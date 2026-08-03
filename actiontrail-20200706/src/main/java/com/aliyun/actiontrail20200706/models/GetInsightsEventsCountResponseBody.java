// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetInsightsEventsCountResponseBody extends TeaModel {
    /**
     * <p>The information about the Insights events.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetInsightsEventsCountResponseBodyData> data;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>VjE6bHJlTGoxdm1M****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4ABAEA6E-C740-5CE2-A003-643E5519****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInsightsEventsCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInsightsEventsCountResponseBody self = new GetInsightsEventsCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInsightsEventsCountResponseBody setData(java.util.List<GetInsightsEventsCountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetInsightsEventsCountResponseBodyData> getData() {
        return this.data;
    }

    public GetInsightsEventsCountResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetInsightsEventsCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInsightsEventsCountResponseBodyData extends TeaModel {
        /**
         * <p>The number of Insights events.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The type of the Insights event. Valid values:</p>
         * <ul>
         * <li><p>IpInsight: IP request events.</p>
         * </li>
         * <li><p>ApiCallRateInsight: High-risk API call events.</p>
         * </li>
         * <li><p>ApiErrorRateInsight: API error events.</p>
         * </li>
         * <li><p>AkInsight: AccessKey pair call events.</p>
         * </li>
         * <li><p>PolicyChangeInsight: Permission change events.</p>
         * </li>
         * <li><p>PasswordChangeInsight: Password change events.</p>
         * </li>
         * <li><p>TrailConcealmentInsight: Trail concealment events.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IpInsight</p>
         */
        @NameInMap("InsightType")
        public String insightType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static GetInsightsEventsCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInsightsEventsCountResponseBodyData self = new GetInsightsEventsCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInsightsEventsCountResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetInsightsEventsCountResponseBodyData setInsightType(String insightType) {
            this.insightType = insightType;
            return this;
        }
        public String getInsightType() {
            return this.insightType;
        }

        public GetInsightsEventsCountResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
