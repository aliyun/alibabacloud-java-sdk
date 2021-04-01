// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribleCertListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CertList")
    @Validation(required = true)
    public java.util.List<DescribleCertListResponseCertList> certList;

    public static DescribleCertListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribleCertListResponse self = new DescribleCertListResponse();
        return TeaModel.build(map, self);
    }

    public DescribleCertListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribleCertListResponse setCertList(java.util.List<DescribleCertListResponseCertList> certList) {
        this.certList = certList;
        return this;
    }
    public java.util.List<DescribleCertListResponseCertList> getCertList() {
        return this.certList;
    }

    public static class DescribleCertListResponseCertList extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Common")
        @Validation(required = true)
        public String common;

        @NameInMap("Issuer")
        @Validation(required = true)
        public String issuer;

        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("DomainRelated")
        @Validation(required = true)
        public Boolean domainRelated;

        public static DescribleCertListResponseCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribleCertListResponseCertList self = new DescribleCertListResponseCertList();
            return TeaModel.build(map, self);
        }

        public DescribleCertListResponseCertList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribleCertListResponseCertList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribleCertListResponseCertList setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribleCertListResponseCertList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribleCertListResponseCertList setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribleCertListResponseCertList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribleCertListResponseCertList setDomainRelated(Boolean domainRelated) {
            this.domainRelated = domainRelated;
            return this;
        }
        public Boolean getDomainRelated() {
            return this.domainRelated;
        }

    }

}
