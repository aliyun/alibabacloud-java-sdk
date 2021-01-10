// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingCertificateDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetWebHostingCertificateDetailResponseBodyData data;

    public static GetWebHostingCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingCertificateDetailResponseBody self = new GetWebHostingCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebHostingCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebHostingCertificateDetailResponseBody setData(GetWebHostingCertificateDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWebHostingCertificateDetailResponseBodyData getData() {
        return this.data;
    }

    public static class GetWebHostingCertificateDetailResponseBodyData extends TeaModel {
        @NameInMap("CertLife")
        public String certLife;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("CertDomainName")
        public String certDomainName;

        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CertExpiredTime")
        public Long certExpiredTime;

        public static GetWebHostingCertificateDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWebHostingCertificateDetailResponseBodyData self = new GetWebHostingCertificateDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWebHostingCertificateDetailResponseBodyData setCertLife(String certLife) {
            this.certLife = certLife;
            return this;
        }
        public String getCertLife() {
            return this.certLife;
        }

        public GetWebHostingCertificateDetailResponseBodyData setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public GetWebHostingCertificateDetailResponseBodyData setCertDomainName(String certDomainName) {
            this.certDomainName = certDomainName;
            return this;
        }
        public String getCertDomainName() {
            return this.certDomainName;
        }

        public GetWebHostingCertificateDetailResponseBodyData setServerCertificateStatus(String serverCertificateStatus) {
            this.serverCertificateStatus = serverCertificateStatus;
            return this;
        }
        public String getServerCertificateStatus() {
            return this.serverCertificateStatus;
        }

        public GetWebHostingCertificateDetailResponseBodyData setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public GetWebHostingCertificateDetailResponseBodyData setCertExpiredTime(Long certExpiredTime) {
            this.certExpiredTime = certExpiredTime;
            return this;
        }
        public Long getCertExpiredTime() {
            return this.certExpiredTime;
        }

    }

}
