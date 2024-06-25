// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsSignResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
     */
    @NameInMap("ApplyScene")
    public String applyScene;

    @NameInMap("AuditInfo")
    public GetSmsSignResponseBodyAuditInfo auditInfo;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>2024-06-03 10:02:34</p>
     */
    @NameInMap("CreateDate")
    public String createDate;

    @NameInMap("FileUrlList")
    public java.util.List<String> fileUrlList;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>20044156924</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>2004393xxxx</p>
     */
    @NameInMap("QualificationId")
    public Long qualificationId;

    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SIGN_100xxx077042023_16884xxxx64065_hrsdB</p>
     */
    @NameInMap("SignCode")
    public String signCode;

    @NameInMap("SignName")
    public String signName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignStatus")
    public Long signStatus;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SignTag")
    public String signTag;

    @NameInMap("SignUsage")
    public String signUsage;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ThirdParty")
    public Boolean thirdParty;

    public static GetSmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmsSignResponseBody self = new GetSmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmsSignResponseBody setApplyScene(String applyScene) {
        this.applyScene = applyScene;
        return this;
    }
    public String getApplyScene() {
        return this.applyScene;
    }

    public GetSmsSignResponseBody setAuditInfo(GetSmsSignResponseBodyAuditInfo auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public GetSmsSignResponseBodyAuditInfo getAuditInfo() {
        return this.auditInfo;
    }

    public GetSmsSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmsSignResponseBody setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public GetSmsSignResponseBody setFileUrlList(java.util.List<String> fileUrlList) {
        this.fileUrlList = fileUrlList;
        return this;
    }
    public java.util.List<String> getFileUrlList() {
        return this.fileUrlList;
    }

    public GetSmsSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmsSignResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetSmsSignResponseBody setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public GetSmsSignResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public GetSmsSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmsSignResponseBody setSignCode(String signCode) {
        this.signCode = signCode;
        return this;
    }
    public String getSignCode() {
        return this.signCode;
    }

    public GetSmsSignResponseBody setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public GetSmsSignResponseBody setSignStatus(Long signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public Long getSignStatus() {
        return this.signStatus;
    }

    public GetSmsSignResponseBody setSignTag(String signTag) {
        this.signTag = signTag;
        return this;
    }
    public String getSignTag() {
        return this.signTag;
    }

    public GetSmsSignResponseBody setSignUsage(String signUsage) {
        this.signUsage = signUsage;
        return this;
    }
    public String getSignUsage() {
        return this.signUsage;
    }

    public GetSmsSignResponseBody setThirdParty(Boolean thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

    public static class GetSmsSignResponseBodyAuditInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-06-03 12:02:34</p>
         */
        @NameInMap("AuditDate")
        public String auditDate;

        @NameInMap("RejectInfo")
        public String rejectInfo;

        public static GetSmsSignResponseBodyAuditInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSmsSignResponseBodyAuditInfo self = new GetSmsSignResponseBodyAuditInfo();
            return TeaModel.build(map, self);
        }

        public GetSmsSignResponseBodyAuditInfo setAuditDate(String auditDate) {
            this.auditDate = auditDate;
            return this;
        }
        public String getAuditDate() {
            return this.auditDate;
        }

        public GetSmsSignResponseBodyAuditInfo setRejectInfo(String rejectInfo) {
            this.rejectInfo = rejectInfo;
            return this;
        }
        public String getRejectInfo() {
            return this.rejectInfo;
        }

    }

}
