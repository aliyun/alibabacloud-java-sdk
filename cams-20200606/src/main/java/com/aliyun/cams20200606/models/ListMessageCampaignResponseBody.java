// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListMessageCampaignResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>A value of OK indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Example</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListMessageCampaignResponseBodyData> data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: successful.</p>
     * </li>
     * <li><p>false: failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListMessageCampaignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageCampaignResponseBody self = new ListMessageCampaignResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageCampaignResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListMessageCampaignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMessageCampaignResponseBody setData(java.util.List<ListMessageCampaignResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMessageCampaignResponseBodyData> getData() {
        return this.data;
    }

    public ListMessageCampaignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMessageCampaignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessageCampaignResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMessageCampaignResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListMessageCampaignResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Meta ad account.</p>
         * 
         * <strong>example:</strong>
         * <p>2339**</p>
         */
        @NameInMap("AdAccountId")
        public String adAccountId;

        /**
         * <p>The budget.</p>
         * 
         * <strong>example:</strong>
         * <p>62</p>
         */
        @NameInMap("Budget")
        public Long budget;

        /**
         * <p>The budget type.</p>
         * 
         * <strong>example:</strong>
         * <p>daily</p>
         */
        @NameInMap("BudgetType")
        public String budgetType;

        /**
         * <p>The campaign ID.</p>
         * 
         * <strong>example:</strong>
         * <p>233**</p>
         */
        @NameInMap("CampaignId")
        public String campaignId;

        /**
         * <p>The name of the campaign.</p>
         * 
         * <strong>example:</strong>
         * <p>campaign-name</p>
         */
        @NameInMap("CampaignName")
        public String campaignName;

        /**
         * <p>The time when the campaign was created.</p>
         * 
         * <strong>example:</strong>
         * <p>173029392838</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The Page ID for Messenger.</p>
         * 
         * <strong>example:</strong>
         * <p>238***</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <p>The status of the campaign.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListMessageCampaignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMessageCampaignResponseBodyData self = new ListMessageCampaignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMessageCampaignResponseBodyData setAdAccountId(String adAccountId) {
            this.adAccountId = adAccountId;
            return this;
        }
        public String getAdAccountId() {
            return this.adAccountId;
        }

        public ListMessageCampaignResponseBodyData setBudget(Long budget) {
            this.budget = budget;
            return this;
        }
        public Long getBudget() {
            return this.budget;
        }

        public ListMessageCampaignResponseBodyData setBudgetType(String budgetType) {
            this.budgetType = budgetType;
            return this;
        }
        public String getBudgetType() {
            return this.budgetType;
        }

        public ListMessageCampaignResponseBodyData setCampaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }
        public String getCampaignId() {
            return this.campaignId;
        }

        public ListMessageCampaignResponseBodyData setCampaignName(String campaignName) {
            this.campaignName = campaignName;
            return this;
        }
        public String getCampaignName() {
            return this.campaignName;
        }

        public ListMessageCampaignResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListMessageCampaignResponseBodyData setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public ListMessageCampaignResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
