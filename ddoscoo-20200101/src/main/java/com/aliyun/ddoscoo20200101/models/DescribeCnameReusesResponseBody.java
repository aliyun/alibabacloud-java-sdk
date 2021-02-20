// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeCnameReusesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CnameReuses")
    public java.util.List<DescribeCnameReusesResponseBodyCnameReuses> cnameReuses;

    public static DescribeCnameReusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCnameReusesResponseBody self = new DescribeCnameReusesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCnameReusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCnameReusesResponseBody setCnameReuses(java.util.List<DescribeCnameReusesResponseBodyCnameReuses> cnameReuses) {
        this.cnameReuses = cnameReuses;
        return this;
    }
    public java.util.List<DescribeCnameReusesResponseBodyCnameReuses> getCnameReuses() {
        return this.cnameReuses;
    }

    public static class DescribeCnameReusesResponseBodyCnameReuses extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("Enable")
        public Integer enable;

        public static DescribeCnameReusesResponseBodyCnameReuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeCnameReusesResponseBodyCnameReuses self = new DescribeCnameReusesResponseBodyCnameReuses();
            return TeaModel.build(map, self);
        }

        public DescribeCnameReusesResponseBodyCnameReuses setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCnameReusesResponseBodyCnameReuses setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeCnameReusesResponseBodyCnameReuses setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

    }

}
