// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeCertsResponseBody extends TeaModel {
    @NameInMap("Certs")
    public java.util.List<DescribeCertsResponseBodyCerts> certs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertsResponseBody self = new DescribeCertsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCertsResponseBody setCerts(java.util.List<DescribeCertsResponseBodyCerts> certs) {
        this.certs = certs;
        return this;
    }
    public java.util.List<DescribeCertsResponseBodyCerts> getCerts() {
        return this.certs;
    }

    public DescribeCertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCertsResponseBodyCerts extends TeaModel {
        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("DomainRelated")
        public Boolean domainRelated;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("Name")
        public String name;

        @NameInMap("Common")
        public String common;

        @NameInMap("Id")
        public Integer id;

        public static DescribeCertsResponseBodyCerts build(java.util.Map<String, ?> map) throws Exception {
            DescribeCertsResponseBodyCerts self = new DescribeCertsResponseBodyCerts();
            return TeaModel.build(map, self);
        }

        public DescribeCertsResponseBodyCerts setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeCertsResponseBodyCerts setDomainRelated(Boolean domainRelated) {
            this.domainRelated = domainRelated;
            return this;
        }
        public Boolean getDomainRelated() {
            return this.domainRelated;
        }

        public DescribeCertsResponseBodyCerts setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeCertsResponseBodyCerts setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeCertsResponseBodyCerts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCertsResponseBodyCerts setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeCertsResponseBodyCerts setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
