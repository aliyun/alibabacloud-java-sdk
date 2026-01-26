// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCustomHostnameResponseBody extends TeaModel {
    @NameInMap("CustomHostnameModel")
    public GetCustomHostnameResponseBodyCustomHostnameModel customHostnameModel;

    /**
     * <p>本次请求的唯一标识</p>
     * 
     * <strong>example:</strong>
     * <p>7C414690-9D7B-5D66-9CD9-AD0B3F25ED49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCustomHostnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomHostnameResponseBody self = new GetCustomHostnameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomHostnameResponseBody setCustomHostnameModel(GetCustomHostnameResponseBodyCustomHostnameModel customHostnameModel) {
        this.customHostnameModel = customHostnameModel;
        return this;
    }
    public GetCustomHostnameResponseBodyCustomHostnameModel getCustomHostnameModel() {
        return this.customHostnameModel;
    }

    public GetCustomHostnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCustomHostnameResponseBodyCustomHostnameModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30000478</p>
         */
        @NameInMap("CasId")
        public Long casId;

        /**
         * <p>免费证书申请错误码</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CertApplyCode")
        public Long certApplyCode;

        /**
         * <p>免费证书申请错误说明</p>
         * 
         * <strong>example:</strong>
         * <p>canceled</p>
         */
        @NameInMap("CertApplyMessage")
        public String certApplyMessage;

        /**
         * <p>证书校验HTTP名称</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://custom.site.com/.well-known/acme-challenge/jLmMHlEaZ3jb352Qo3ciaSoAC8KZ5Hk0F-4_1xLQtgc">http://custom.site.com/.well-known/acme-challenge/jLmMHlEaZ3jb352Qo3ciaSoAC8KZ5Hk0F-4_1xLQtgc</a></p>
         */
        @NameInMap("CertHttpKey")
        public String certHttpKey;

        /**
         * <p>证书校验HTTP内容</p>
         * 
         * <strong>example:</strong>
         * <p>jLmMHlEaZ3jb352Qo3ciaSoAC8KZ5Hk0F-4_1xLQtgc.GridYdfJJB5PgFEL-t89XfaFvMPB4f2-I9fwLpKl6e0</p>
         */
        @NameInMap("CertHttpValue")
        public String certHttpValue;

        /**
         * <strong>example:</strong>
         * <p>baba2c9e90e840b3b55698cedf02b308</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>证书过期时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-19T11:15:20Z</p>
         */
        @NameInMap("CertNotAfter")
        public String certNotAfter;

        /**
         * <p>证书状态</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("CertStatus")
        public String certStatus;

        /**
         * <p>证书校验TXT名称</p>
         * 
         * <strong>example:</strong>
         * <p>_acme-challenge.custom.site.com</p>
         */
        @NameInMap("CertTxtKey")
        public String certTxtKey;

        /**
         * <p>证书校验TXT内容</p>
         * 
         * <strong>example:</strong>
         * <p>lcKYad3UQXgrZLvMm_6TBUYKK4xTkGmninV0Mzx4gjM</p>
         */
        @NameInMap("CertTxtValue")
        public String certTxtValue;

        /**
         * <p>证书类型</p>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>上传的证书公钥</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <strong>example:</strong>
         * <p>existing_custom_hostname</p>
         */
        @NameInMap("ConflictWith")
        public String conflictWith;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-19T11:15:20Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>用户自定义的主机名</p>
         * 
         * <strong>example:</strong>
         * <p>custom.site.com</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        @NameInMap("HostnameId")
        public Long hostnameId;

        /**
         * <strong>example:</strong>
         * <p>missing_icp</p>
         */
        @NameInMap("OfflineReason")
        public String offlineReason;

        /**
         * <strong>example:</strong>
         * <p>-----BEGIN RSA PRIVATE KEY-----</p>
         */
        @NameInMap("PrivateKey")
        public String privateKey;

        /**
         * <p>绑定的源站记录ID</p>
         * 
         * <strong>example:</strong>
         * <p>4042843419650112</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <p>绑定的源站记录名</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <p>与主机名关联的站点ID</p>
         * 
         * <strong>example:</strong>
         * <p>890601022130656</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>关联站点名称</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>SSL开关的状态</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SslFlag")
        public String sslFlag;

        /**
         * <p>自定义主机名状态</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-19T11:15:20Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>归属校验TXT内容</p>
         * 
         * <strong>example:</strong>
         * <p>verify_16ab7f4d389d4dff6655f995c6a997bd</p>
         */
        @NameInMap("VerifyCode")
        public String verifyCode;

        /**
         * <p>归属校验TXT名称</p>
         * 
         * <strong>example:</strong>
         * <p>_esa_custom_hostname.custom.site.com</p>
         */
        @NameInMap("VerifyHost")
        public String verifyHost;

        public static GetCustomHostnameResponseBodyCustomHostnameModel build(java.util.Map<String, ?> map) throws Exception {
            GetCustomHostnameResponseBodyCustomHostnameModel self = new GetCustomHostnameResponseBodyCustomHostnameModel();
            return TeaModel.build(map, self);
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCasId(Long casId) {
            this.casId = casId;
            return this;
        }
        public Long getCasId() {
            return this.casId;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCertApplyCode(Long certApplyCode) {
            this.certApplyCode = certApplyCode;
            return this;
        }
        public Long getCertApplyCode() {
            return this.certApplyCode;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCertApplyMessage(String certApplyMessage) {
            this.certApplyMessage = certApplyMessage;
            return this;
        }
        public String getCertApplyMessage() {
            return this.certApplyMessage;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCertHttpKey(String certHttpKey) {
            this.certHttpKey = certHttpKey;
            return this;
        }
        public String getCertHttpKey() {
            return this.certHttpKey;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCertHttpValue(String certHttpValue) {
            this.certHttpValue = certHttpValue;
            return this;
        }
        public String getCertHttpValue() {
            return this.certHttpValue;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCertNotAfter(String certNotAfter) {
            this.certNotAfter = certNotAfter;
            return this;
        }
        public String getCertNotAfter() {
            return this.certNotAfter;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCertStatus(String certStatus) {
            this.certStatus = certStatus;
            return this;
        }
        public String getCertStatus() {
            return this.certStatus;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCertTxtKey(String certTxtKey) {
            this.certTxtKey = certTxtKey;
            return this;
        }
        public String getCertTxtKey() {
            return this.certTxtKey;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCertTxtValue(String certTxtValue) {
            this.certTxtValue = certTxtValue;
            return this;
        }
        public String getCertTxtValue() {
            return this.certTxtValue;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setConflictWith(String conflictWith) {
            this.conflictWith = conflictWith;
            return this;
        }
        public String getConflictWith() {
            return this.conflictWith;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setHostnameId(Long hostnameId) {
            this.hostnameId = hostnameId;
            return this;
        }
        public Long getHostnameId() {
            return this.hostnameId;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setOfflineReason(String offlineReason) {
            this.offlineReason = offlineReason;
            return this;
        }
        public String getOfflineReason() {
            return this.offlineReason;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setSslFlag(String sslFlag) {
            this.sslFlag = sslFlag;
            return this;
        }
        public String getSslFlag() {
            return this.sslFlag;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
            return this;
        }
        public String getVerifyCode() {
            return this.verifyCode;
        }

        public GetCustomHostnameResponseBodyCustomHostnameModel setVerifyHost(String verifyHost) {
            this.verifyHost = verifyHost;
            return this;
        }
        public String getVerifyHost() {
            return this.verifyHost;
        }

    }

}
