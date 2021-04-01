// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAccessModeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainModeList")
    @Validation(required = true)
    public java.util.List<DescribeDomainAccessModeResponseDomainModeList> domainModeList;

    public static DescribeDomainAccessModeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAccessModeResponse self = new DescribeDomainAccessModeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAccessModeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainAccessModeResponse setDomainModeList(java.util.List<DescribeDomainAccessModeResponseDomainModeList> domainModeList) {
        this.domainModeList = domainModeList;
        return this;
    }
    public java.util.List<DescribeDomainAccessModeResponseDomainModeList> getDomainModeList() {
        return this.domainModeList;
    }

    public static class DescribeDomainAccessModeResponseDomainModeList extends TeaModel {
        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("AccessMode")
        @Validation(required = true)
        public Integer accessMode;

        public static DescribeDomainAccessModeResponseDomainModeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAccessModeResponseDomainModeList self = new DescribeDomainAccessModeResponseDomainModeList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAccessModeResponseDomainModeList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainAccessModeResponseDomainModeList setAccessMode(Integer accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public Integer getAccessMode() {
            return this.accessMode;
        }

    }

}
