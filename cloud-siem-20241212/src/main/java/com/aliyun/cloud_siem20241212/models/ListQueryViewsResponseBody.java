// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListQueryViewsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of results to return per request when using the NextToken-based pagination. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. You do not need to specify this parameter for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of query views.</p>
     */
    @NameInMap("QueryViews")
    public java.util.List<ListQueryViewsResponseBodyQueryViews> queryViews;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListQueryViewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueryViewsResponseBody self = new ListQueryViewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueryViewsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQueryViewsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQueryViewsResponseBody setQueryViews(java.util.List<ListQueryViewsResponseBodyQueryViews> queryViews) {
        this.queryViews = queryViews;
        return this;
    }
    public java.util.List<ListQueryViewsResponseBodyQueryViews> getQueryViews() {
        return this.queryViews;
    }

    public ListQueryViewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQueryViewsResponseBodyQueryViews extends TeaModel {
        /**
         * <p>The custom query condition of the view.</p>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("QueryViewCondition")
        public String queryViewCondition;

        /**
         * <p>The alert filter statement of the view.</p>
         * 
         * <strong>example:</strong>
         * <p>module_code: alibaba_cloud_sas_custom_rule</p>
         */
        @NameInMap("QueryViewCriteria")
        public String queryViewCriteria;

        /**
         * <p>The list of displayed fields.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;alert_name_cn&quot;,&quot;alert_type_cn&quot;,&quot;entity_list&quot;,&quot;alert_level&quot;,&quot;alert_status&quot;,&quot;start_time&quot;,&quot;end_time&quot;]</p>
         */
        @NameInMap("QueryViewFields")
        public String queryViewFields;

        /**
         * <p>The unique identifier of the query view.</p>
         * 
         * <strong>example:</strong>
         * <p>qv-a1b2c3d4e5f6g7h8****</p>
         */
        @NameInMap("QueryViewId")
        public String queryViewId;

        /**
         * <p>The view name.</p>
         * 
         * <strong>example:</strong>
         * <p>alert</p>
         */
        @NameInMap("QueryViewName")
        public String queryViewName;

        /**
         * <p>The display order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QueryViewOrder")
        public String queryViewOrder;

        /**
         * <p>The scene to which the view belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert</p>
         */
        @NameInMap("QueryViewScene")
        public String queryViewScene;

        /**
         * <p>The view status.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("QueryViewStatus")
        public String queryViewStatus;

        /**
         * <p>The view type.</p>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("QueryViewType")
        public String queryViewType;

        public static ListQueryViewsResponseBodyQueryViews build(java.util.Map<String, ?> map) throws Exception {
            ListQueryViewsResponseBodyQueryViews self = new ListQueryViewsResponseBodyQueryViews();
            return TeaModel.build(map, self);
        }

        public ListQueryViewsResponseBodyQueryViews setQueryViewCondition(String queryViewCondition) {
            this.queryViewCondition = queryViewCondition;
            return this;
        }
        public String getQueryViewCondition() {
            return this.queryViewCondition;
        }

        public ListQueryViewsResponseBodyQueryViews setQueryViewCriteria(String queryViewCriteria) {
            this.queryViewCriteria = queryViewCriteria;
            return this;
        }
        public String getQueryViewCriteria() {
            return this.queryViewCriteria;
        }

        public ListQueryViewsResponseBodyQueryViews setQueryViewFields(String queryViewFields) {
            this.queryViewFields = queryViewFields;
            return this;
        }
        public String getQueryViewFields() {
            return this.queryViewFields;
        }

        public ListQueryViewsResponseBodyQueryViews setQueryViewId(String queryViewId) {
            this.queryViewId = queryViewId;
            return this;
        }
        public String getQueryViewId() {
            return this.queryViewId;
        }

        public ListQueryViewsResponseBodyQueryViews setQueryViewName(String queryViewName) {
            this.queryViewName = queryViewName;
            return this;
        }
        public String getQueryViewName() {
            return this.queryViewName;
        }

        public ListQueryViewsResponseBodyQueryViews setQueryViewOrder(String queryViewOrder) {
            this.queryViewOrder = queryViewOrder;
            return this;
        }
        public String getQueryViewOrder() {
            return this.queryViewOrder;
        }

        public ListQueryViewsResponseBodyQueryViews setQueryViewScene(String queryViewScene) {
            this.queryViewScene = queryViewScene;
            return this;
        }
        public String getQueryViewScene() {
            return this.queryViewScene;
        }

        public ListQueryViewsResponseBodyQueryViews setQueryViewStatus(String queryViewStatus) {
            this.queryViewStatus = queryViewStatus;
            return this;
        }
        public String getQueryViewStatus() {
            return this.queryViewStatus;
        }

        public ListQueryViewsResponseBodyQueryViews setQueryViewType(String queryViewType) {
            this.queryViewType = queryViewType;
            return this;
        }
        public String getQueryViewType() {
            return this.queryViewType;
        }

    }

}
