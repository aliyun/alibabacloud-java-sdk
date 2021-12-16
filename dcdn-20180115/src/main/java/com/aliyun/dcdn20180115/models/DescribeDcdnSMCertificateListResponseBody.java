// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSMCertificateListResponseBody extends TeaModel {
    @NameInMap("CertificateListModel")
    public DescribeDcdnSMCertificateListResponseBodyCertificateListModel certificateListModel;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnSMCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSMCertificateListResponseBody self = new DescribeDcdnSMCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSMCertificateListResponseBody setCertificateListModel(DescribeDcdnSMCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeDcdnSMCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public DescribeDcdnSMCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnSMCertificateListResponseBodyCertificateListModelCertList extends TeaModel {
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("Common")
        public String common;

        @NameInMap("Issuer")
        public String issuer;

        public static DescribeDcdnSMCertificateListResponseBodyCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnSMCertificateListResponseBodyCertificateListModelCertList self = new DescribeDcdnSMCertificateListResponseBodyCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnSMCertificateListResponseBodyCertificateListModelCertList setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public DescribeDcdnSMCertificateListResponseBodyCertificateListModelCertList setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDcdnSMCertificateListResponseBodyCertificateListModelCertList setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeDcdnSMCertificateListResponseBodyCertificateListModelCertList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

    }

    public static class DescribeDcdnSMCertificateListResponseBodyCertificateListModel extends TeaModel {
        @NameInMap("CertList")
        public java.util.List<DescribeDcdnSMCertificateListResponseBodyCertificateListModelCertList> certList;

        @NameInMap("Count")
        public Integer count;

        public static DescribeDcdnSMCertificateListResponseBodyCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnSMCertificateListResponseBodyCertificateListModel self = new DescribeDcdnSMCertificateListResponseBodyCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnSMCertificateListResponseBodyCertificateListModel setCertList(java.util.List<DescribeDcdnSMCertificateListResponseBodyCertificateListModelCertList> certList) {
            this.certList = certList;
            return this;
        }
        public java.util.List<DescribeDcdnSMCertificateListResponseBodyCertificateListModelCertList> getCertList() {
            return this.certList;
        }

        public DescribeDcdnSMCertificateListResponseBodyCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
