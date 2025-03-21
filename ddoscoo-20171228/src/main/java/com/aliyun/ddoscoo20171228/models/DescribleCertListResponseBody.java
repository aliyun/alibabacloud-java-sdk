// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribleCertListResponseBody extends TeaModel {
    @NameInMap("CertList")
    public java.util.List<DescribleCertListResponseBodyCertList> certList;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribleCertListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribleCertListResponseBody self = new DescribleCertListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribleCertListResponseBody setCertList(java.util.List<DescribleCertListResponseBodyCertList> certList) {
        this.certList = certList;
        return this;
    }
    public java.util.List<DescribleCertListResponseBodyCertList> getCertList() {
        return this.certList;
    }

    public DescribleCertListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribleCertListResponseBodyCertList extends TeaModel {
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Common")
        public String common;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DomainRelated")
        public Boolean domainRelated;

        /**
         * <strong>example:</strong>
         * <p>2020-09-23</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>DigiCert Inc</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <strong>example:</strong>
         * <p>testCertName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2019-09-24</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        public static DescribleCertListResponseBodyCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribleCertListResponseBodyCertList self = new DescribleCertListResponseBodyCertList();
            return TeaModel.build(map, self);
        }

        public DescribleCertListResponseBodyCertList setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public DescribleCertListResponseBodyCertList setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribleCertListResponseBodyCertList setDomainRelated(Boolean domainRelated) {
            this.domainRelated = domainRelated;
            return this;
        }
        public Boolean getDomainRelated() {
            return this.domainRelated;
        }

        public DescribleCertListResponseBodyCertList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribleCertListResponseBodyCertList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribleCertListResponseBodyCertList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribleCertListResponseBodyCertList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribleCertListResponseBodyCertList setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

}
