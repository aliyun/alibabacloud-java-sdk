// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeDRMCertListResponseBody extends TeaModel {
    @NameInMap("DRMCertInfoListList")
    public DescribeDRMCertListResponseBodyDRMCertInfoListList DRMCertInfoListList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDRMCertListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDRMCertListResponseBody self = new DescribeDRMCertListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDRMCertListResponseBody setDRMCertInfoListList(DescribeDRMCertListResponseBodyDRMCertInfoListList DRMCertInfoListList) {
        this.DRMCertInfoListList = DRMCertInfoListList;
        return this;
    }
    public DescribeDRMCertListResponseBodyDRMCertInfoListList getDRMCertInfoListList() {
        return this.DRMCertInfoListList;
    }

    public DescribeDRMCertListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("PrivateKey")
        public String privateKey;

        @NameInMap("ServCert")
        public String servCert;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("Passphrase")
        public String passphrase;

        @NameInMap("CertId")
        public String certId;

        @NameInMap("Ask")
        public String ask;

        public static DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo self = new DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

        public DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo setServCert(String servCert) {
            this.servCert = servCert;
            return this;
        }
        public String getServCert() {
            return this.servCert;
        }

        public DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo setPassphrase(String passphrase) {
            this.passphrase = passphrase;
            return this;
        }
        public String getPassphrase() {
            return this.passphrase;
        }

        public DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo setAsk(String ask) {
            this.ask = ask;
            return this;
        }
        public String getAsk() {
            return this.ask;
        }

    }

    public static class DescribeDRMCertListResponseBodyDRMCertInfoListList extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo> certInfo;

        public static DescribeDRMCertListResponseBodyDRMCertInfoListList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDRMCertListResponseBodyDRMCertInfoListList self = new DescribeDRMCertListResponseBodyDRMCertInfoListList();
            return TeaModel.build(map, self);
        }

        public DescribeDRMCertListResponseBodyDRMCertInfoListList setCertInfo(java.util.List<DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeDRMCertListResponseBodyDRMCertInfoListListCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
