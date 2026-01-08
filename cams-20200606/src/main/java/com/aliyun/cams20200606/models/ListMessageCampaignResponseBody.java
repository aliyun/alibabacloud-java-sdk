// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListMessageCampaignResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListMessageCampaignResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>23**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
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
         * <strong>example:</strong>
         * <p>2339**</p>
         */
        @NameInMap("AdAccountId")
        public String adAccountId;

        /**
         * <strong>example:</strong>
         * <p>62</p>
         */
        @NameInMap("Budget")
        public Long budget;

        /**
         * <strong>example:</strong>
         * <p>daily</p>
         */
        @NameInMap("BudgetType")
        public String budgetType;

        /**
         * <strong>example:</strong>
         * <p>233**</p>
         */
        @NameInMap("CampaignId")
        public String campaignId;

        /**
         * <strong>example:</strong>
         * <p>campaign-name</p>
         */
        @NameInMap("CampaignName")
        public String campaignName;

        /**
         * <strong>example:</strong>
         * <p>173029392838</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>238***</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
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
