// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCustomHostnamesResponseBody extends TeaModel {
    @NameInMap("Hostnames")
    public java.util.List<ListCustomHostnamesResponseBodyHostnames> hostnames;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCustomHostnamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomHostnamesResponseBody self = new ListCustomHostnamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomHostnamesResponseBody setHostnames(java.util.List<ListCustomHostnamesResponseBodyHostnames> hostnames) {
        this.hostnames = hostnames;
        return this;
    }
    public java.util.List<ListCustomHostnamesResponseBodyHostnames> getHostnames() {
        return this.hostnames;
    }

    public ListCustomHostnamesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomHostnamesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomHostnamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomHostnamesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomHostnamesResponseBodyHostnames extends TeaModel {
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
         * <p>证书过期时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-19T11:15:20Z</p>
         */
        @NameInMap("CertNotAfter")
        public String certNotAfter;

        /**
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
         * <p>绑定的源站记录ID</p>
         * 
         * <strong>example:</strong>
         * <p>3386032455886912</p>
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

        public static ListCustomHostnamesResponseBodyHostnames build(java.util.Map<String, ?> map) throws Exception {
            ListCustomHostnamesResponseBodyHostnames self = new ListCustomHostnamesResponseBodyHostnames();
            return TeaModel.build(map, self);
        }

        public ListCustomHostnamesResponseBodyHostnames setCertApplyCode(Long certApplyCode) {
            this.certApplyCode = certApplyCode;
            return this;
        }
        public Long getCertApplyCode() {
            return this.certApplyCode;
        }

        public ListCustomHostnamesResponseBodyHostnames setCertApplyMessage(String certApplyMessage) {
            this.certApplyMessage = certApplyMessage;
            return this;
        }
        public String getCertApplyMessage() {
            return this.certApplyMessage;
        }

        public ListCustomHostnamesResponseBodyHostnames setCertHttpKey(String certHttpKey) {
            this.certHttpKey = certHttpKey;
            return this;
        }
        public String getCertHttpKey() {
            return this.certHttpKey;
        }

        public ListCustomHostnamesResponseBodyHostnames setCertHttpValue(String certHttpValue) {
            this.certHttpValue = certHttpValue;
            return this;
        }
        public String getCertHttpValue() {
            return this.certHttpValue;
        }

        public ListCustomHostnamesResponseBodyHostnames setCertNotAfter(String certNotAfter) {
            this.certNotAfter = certNotAfter;
            return this;
        }
        public String getCertNotAfter() {
            return this.certNotAfter;
        }

        public ListCustomHostnamesResponseBodyHostnames setCertStatus(String certStatus) {
            this.certStatus = certStatus;
            return this;
        }
        public String getCertStatus() {
            return this.certStatus;
        }

        public ListCustomHostnamesResponseBodyHostnames setCertTxtKey(String certTxtKey) {
            this.certTxtKey = certTxtKey;
            return this;
        }
        public String getCertTxtKey() {
            return this.certTxtKey;
        }

        public ListCustomHostnamesResponseBodyHostnames setCertTxtValue(String certTxtValue) {
            this.certTxtValue = certTxtValue;
            return this;
        }
        public String getCertTxtValue() {
            return this.certTxtValue;
        }

        public ListCustomHostnamesResponseBodyHostnames setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public ListCustomHostnamesResponseBodyHostnames setConflictWith(String conflictWith) {
            this.conflictWith = conflictWith;
            return this;
        }
        public String getConflictWith() {
            return this.conflictWith;
        }

        public ListCustomHostnamesResponseBodyHostnames setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCustomHostnamesResponseBodyHostnames setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListCustomHostnamesResponseBodyHostnames setHostnameId(Long hostnameId) {
            this.hostnameId = hostnameId;
            return this;
        }
        public Long getHostnameId() {
            return this.hostnameId;
        }

        public ListCustomHostnamesResponseBodyHostnames setOfflineReason(String offlineReason) {
            this.offlineReason = offlineReason;
            return this;
        }
        public String getOfflineReason() {
            return this.offlineReason;
        }

        public ListCustomHostnamesResponseBodyHostnames setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public ListCustomHostnamesResponseBodyHostnames setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public ListCustomHostnamesResponseBodyHostnames setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListCustomHostnamesResponseBodyHostnames setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public ListCustomHostnamesResponseBodyHostnames setSslFlag(String sslFlag) {
            this.sslFlag = sslFlag;
            return this;
        }
        public String getSslFlag() {
            return this.sslFlag;
        }

        public ListCustomHostnamesResponseBodyHostnames setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomHostnamesResponseBodyHostnames setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListCustomHostnamesResponseBodyHostnames setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
            return this;
        }
        public String getVerifyCode() {
            return this.verifyCode;
        }

        public ListCustomHostnamesResponseBodyHostnames setVerifyHost(String verifyHost) {
            this.verifyHost = verifyHost;
            return this;
        }
        public String getVerifyHost() {
            return this.verifyHost;
        }

    }

}
