// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetMessageCampaignInsightsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetMessageCampaignInsightsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>s39**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMessageCampaignInsightsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCampaignInsightsResponseBody self = new GetMessageCampaignInsightsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageCampaignInsightsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetMessageCampaignInsightsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMessageCampaignInsightsResponseBody setData(java.util.List<GetMessageCampaignInsightsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetMessageCampaignInsightsResponseBodyData> getData() {
        return this.data;
    }

    public GetMessageCampaignInsightsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMessageCampaignInsightsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMessageCampaignInsightsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMessageCampaignInsightsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-07-01</p>
         */
        @NameInMap("DateStart")
        public String dateStart;

        /**
         * <strong>example:</strong>
         * <p>2025-07-29</p>
         */
        @NameInMap("DateStop")
        public String dateStop;

        /**
         * <strong>example:</strong>
         * <p>2755</p>
         */
        @NameInMap("MarketingMessagesCostPerDelivered")
        public String marketingMessagesCostPerDelivered;

        /**
         * <strong>example:</strong>
         * <p>268</p>
         */
        @NameInMap("MarketingMessagesCostPerLinkBtnClick")
        public String marketingMessagesCostPerLinkBtnClick;

        /**
         * <strong>example:</strong>
         * <p>2755</p>
         */
        @NameInMap("MarketingMessagesDelivered")
        public String marketingMessagesDelivered;

        /**
         * <strong>example:</strong>
         * <p>79.419238</p>
         */
        @NameInMap("MarketingMessagesDeliveryRate")
        public String marketingMessagesDeliveryRate;

        /**
         * <strong>example:</strong>
         * <p>268</p>
         */
        @NameInMap("MarketingMessagesLinkBtnClick")
        public String marketingMessagesLinkBtnClick;

        /**
         * <strong>example:</strong>
         * <p>79.419238</p>
         */
        @NameInMap("MarketingMessagesLinkBtnClickRate")
        public String marketingMessagesLinkBtnClickRate;

        /**
         * <strong>example:</strong>
         * <p>79.419238</p>
         */
        @NameInMap("MarketingMessagesReadRate")
        public String marketingMessagesReadRate;

        /**
         * <strong>example:</strong>
         * <p>38.87</p>
         */
        @NameInMap("MarketingMessagesSpend")
        public String marketingMessagesSpend;

        public static GetMessageCampaignInsightsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMessageCampaignInsightsResponseBodyData self = new GetMessageCampaignInsightsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMessageCampaignInsightsResponseBodyData setDateStart(String dateStart) {
            this.dateStart = dateStart;
            return this;
        }
        public String getDateStart() {
            return this.dateStart;
        }

        public GetMessageCampaignInsightsResponseBodyData setDateStop(String dateStop) {
            this.dateStop = dateStop;
            return this;
        }
        public String getDateStop() {
            return this.dateStop;
        }

        public GetMessageCampaignInsightsResponseBodyData setMarketingMessagesCostPerDelivered(String marketingMessagesCostPerDelivered) {
            this.marketingMessagesCostPerDelivered = marketingMessagesCostPerDelivered;
            return this;
        }
        public String getMarketingMessagesCostPerDelivered() {
            return this.marketingMessagesCostPerDelivered;
        }

        public GetMessageCampaignInsightsResponseBodyData setMarketingMessagesCostPerLinkBtnClick(String marketingMessagesCostPerLinkBtnClick) {
            this.marketingMessagesCostPerLinkBtnClick = marketingMessagesCostPerLinkBtnClick;
            return this;
        }
        public String getMarketingMessagesCostPerLinkBtnClick() {
            return this.marketingMessagesCostPerLinkBtnClick;
        }

        public GetMessageCampaignInsightsResponseBodyData setMarketingMessagesDelivered(String marketingMessagesDelivered) {
            this.marketingMessagesDelivered = marketingMessagesDelivered;
            return this;
        }
        public String getMarketingMessagesDelivered() {
            return this.marketingMessagesDelivered;
        }

        public GetMessageCampaignInsightsResponseBodyData setMarketingMessagesDeliveryRate(String marketingMessagesDeliveryRate) {
            this.marketingMessagesDeliveryRate = marketingMessagesDeliveryRate;
            return this;
        }
        public String getMarketingMessagesDeliveryRate() {
            return this.marketingMessagesDeliveryRate;
        }

        public GetMessageCampaignInsightsResponseBodyData setMarketingMessagesLinkBtnClick(String marketingMessagesLinkBtnClick) {
            this.marketingMessagesLinkBtnClick = marketingMessagesLinkBtnClick;
            return this;
        }
        public String getMarketingMessagesLinkBtnClick() {
            return this.marketingMessagesLinkBtnClick;
        }

        public GetMessageCampaignInsightsResponseBodyData setMarketingMessagesLinkBtnClickRate(String marketingMessagesLinkBtnClickRate) {
            this.marketingMessagesLinkBtnClickRate = marketingMessagesLinkBtnClickRate;
            return this;
        }
        public String getMarketingMessagesLinkBtnClickRate() {
            return this.marketingMessagesLinkBtnClickRate;
        }

        public GetMessageCampaignInsightsResponseBodyData setMarketingMessagesReadRate(String marketingMessagesReadRate) {
            this.marketingMessagesReadRate = marketingMessagesReadRate;
            return this;
        }
        public String getMarketingMessagesReadRate() {
            return this.marketingMessagesReadRate;
        }

        public GetMessageCampaignInsightsResponseBodyData setMarketingMessagesSpend(String marketingMessagesSpend) {
            this.marketingMessagesSpend = marketingMessagesSpend;
            return this;
        }
        public String getMarketingMessagesSpend() {
            return this.marketingMessagesSpend;
        }

    }

}
