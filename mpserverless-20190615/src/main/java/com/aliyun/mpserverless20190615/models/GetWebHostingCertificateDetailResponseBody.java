// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingCertificateDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetWebHostingCertificateDetailResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetWebHostingCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingCertificateDetailResponseBody self = new GetWebHostingCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebHostingCertificateDetailResponseBody setData(GetWebHostingCertificateDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWebHostingCertificateDetailResponseBodyData getData() {
        return this.data;
    }

    public GetWebHostingCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetWebHostingCertificateDetailResponseBodyData extends TeaModel {
        @NameInMap("CertDomainName")
        public String certDomainName;

        @NameInMap("CertExpiredTime")
        public Long certExpiredTime;

        @NameInMap("CertLife")
        public String certLife;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        public static GetWebHostingCertificateDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWebHostingCertificateDetailResponseBodyData self = new GetWebHostingCertificateDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWebHostingCertificateDetailResponseBodyData setCertDomainName(String certDomainName) {
            this.certDomainName = certDomainName;
            return this;
        }
        public String getCertDomainName() {
            return this.certDomainName;
        }

        public GetWebHostingCertificateDetailResponseBodyData setCertExpiredTime(Long certExpiredTime) {
            this.certExpiredTime = certExpiredTime;
            return this;
        }
        public Long getCertExpiredTime() {
            return this.certExpiredTime;
        }

        public GetWebHostingCertificateDetailResponseBodyData setCertLife(String certLife) {
            this.certLife = certLife;
            return this;
        }
        public String getCertLife() {
            return this.certLife;
        }

        public GetWebHostingCertificateDetailResponseBodyData setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public GetWebHostingCertificateDetailResponseBodyData setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public GetWebHostingCertificateDetailResponseBodyData setServerCertificateStatus(String serverCertificateStatus) {
            this.serverCertificateStatus = serverCertificateStatus;
            return this;
        }
        public String getServerCertificateStatus() {
            return this.serverCertificateStatus;
        }

    }

}
