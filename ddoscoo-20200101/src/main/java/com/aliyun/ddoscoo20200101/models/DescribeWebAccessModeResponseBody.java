// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessModeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainModes")
    public java.util.List<DescribeWebAccessModeResponseBodyDomainModes> domainModes;

    public static DescribeWebAccessModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessModeResponseBody self = new DescribeWebAccessModeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebAccessModeResponseBody setDomainModes(java.util.List<DescribeWebAccessModeResponseBodyDomainModes> domainModes) {
        this.domainModes = domainModes;
        return this;
    }
    public java.util.List<DescribeWebAccessModeResponseBodyDomainModes> getDomainModes() {
        return this.domainModes;
    }

    public static class DescribeWebAccessModeResponseBodyDomainModes extends TeaModel {
        @NameInMap("AccessMode")
        public Integer accessMode;

        @NameInMap("Domain")
        public String domain;

        public static DescribeWebAccessModeResponseBodyDomainModes build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebAccessModeResponseBodyDomainModes self = new DescribeWebAccessModeResponseBodyDomainModes();
            return TeaModel.build(map, self);
        }

        public DescribeWebAccessModeResponseBodyDomainModes setAccessMode(Integer accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public Integer getAccessMode() {
            return this.accessMode;
        }

        public DescribeWebAccessModeResponseBodyDomainModes setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

}
