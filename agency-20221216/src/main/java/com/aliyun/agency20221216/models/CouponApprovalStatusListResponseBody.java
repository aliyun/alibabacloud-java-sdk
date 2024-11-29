// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CouponApprovalStatusListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<CouponApprovalStatusListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static CouponApprovalStatusListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CouponApprovalStatusListResponseBody self = new CouponApprovalStatusListResponseBody();
        return TeaModel.build(map, self);
    }

    public CouponApprovalStatusListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CouponApprovalStatusListResponseBody setData(java.util.List<CouponApprovalStatusListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CouponApprovalStatusListResponseBodyData> getData() {
        return this.data;
    }

    public CouponApprovalStatusListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CouponApprovalStatusListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public CouponApprovalStatusListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CouponApprovalStatusListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CouponApprovalStatusListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class CouponApprovalStatusListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("IssuerAccount")
        public String issuerAccount;

        /**
         * <strong>example:</strong>
         * <p>5432738203821334</p>
         */
        @NameInMap("IssuerUid")
        public String issuerUid;

        @NameInMap("Note")
        public String note;

        /**
         * <strong>example:</strong>
         * <p>S00000101-100040</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TemplateStatus")
        public Long templateStatus;

        /**
         * <strong>example:</strong>
         * <p>2024-02-02 09:46:59</p>
         */
        @NameInMap("TimeOfRequest")
        public String timeOfRequest;

        public static CouponApprovalStatusListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CouponApprovalStatusListResponseBodyData self = new CouponApprovalStatusListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CouponApprovalStatusListResponseBodyData setIssuerAccount(String issuerAccount) {
            this.issuerAccount = issuerAccount;
            return this;
        }
        public String getIssuerAccount() {
            return this.issuerAccount;
        }

        public CouponApprovalStatusListResponseBodyData setIssuerUid(String issuerUid) {
            this.issuerUid = issuerUid;
            return this;
        }
        public String getIssuerUid() {
            return this.issuerUid;
        }

        public CouponApprovalStatusListResponseBodyData setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public CouponApprovalStatusListResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CouponApprovalStatusListResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public CouponApprovalStatusListResponseBodyData setTemplateStatus(Long templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public Long getTemplateStatus() {
            return this.templateStatus;
        }

        public CouponApprovalStatusListResponseBodyData setTimeOfRequest(String timeOfRequest) {
            this.timeOfRequest = timeOfRequest;
            return this;
        }
        public String getTimeOfRequest() {
            return this.timeOfRequest;
        }

    }

}
