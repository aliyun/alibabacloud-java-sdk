// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CouponApprovalStatusListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<CouponApprovalStatusListResponseBodyData> data;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
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
         * <p>The issuing account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("IssuerAccount")
        public String issuerAccount;

        /**
         * <p>The UID of the issuing account.</p>
         * 
         * <strong>example:</strong>
         * <p>5432738203821334</p>
         */
        @NameInMap("IssuerUid")
        public String issuerUid;

        /**
         * <p>The approval comment.</p>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>S00000101-100040</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the coupon template.</p>
         * 
         * <strong>example:</strong>
         * <p>Template name</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The status of the coupon template. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: application revoked</li>
         * <li><strong>2</strong>: under review</li>
         * <li><strong>3</strong>: review rejected</li>
         * <li><strong>4</strong>: review approved</li>
         * <li><strong>5</strong>: review approved but issuance failed</li>
         * <li><strong>6</strong>: automatically approved</li>
         * <li><strong>7</strong>: automatically approved but issuance failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TemplateStatus")
        public Long templateStatus;

        /**
         * <p>The application time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
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
