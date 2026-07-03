// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListAlertsResponseBody extends TeaModel {
    /**
     * <p>The alert details.</p>
     */
    @NameInMap("Alerts")
    public java.util.List<ListAlertsResponseBodyAlerts> alerts;

    /**
     * <p>The maximum number of entries to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

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
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAlertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsResponseBody self = new ListAlertsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertsResponseBody setAlerts(java.util.List<ListAlertsResponseBodyAlerts> alerts) {
        this.alerts = alerts;
        return this;
    }
    public java.util.List<ListAlertsResponseBodyAlerts> getAlerts() {
        return this.alerts;
    }

    public ListAlertsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlertsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlertsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlertsResponseBodyAlerts extends TeaModel {
        /**
         * <p>The alert details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;alert_uuid&quot;:&quot;a3f8c2e1-9b7d-4f6a-8c2e-1d5b9a7f****&quot;}</p>
         */
        @NameInMap("AlertRecord")
        public String alertRecord;

        /**
         * <p>The alert UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>798341271677187</p>
         */
        @NameInMap("AlertUuid")
        public String alertUuid;

        public static ListAlertsResponseBodyAlerts build(java.util.Map<String, ?> map) throws Exception {
            ListAlertsResponseBodyAlerts self = new ListAlertsResponseBodyAlerts();
            return TeaModel.build(map, self);
        }

        public ListAlertsResponseBodyAlerts setAlertRecord(String alertRecord) {
            this.alertRecord = alertRecord;
            return this;
        }
        public String getAlertRecord() {
            return this.alertRecord;
        }

        public ListAlertsResponseBodyAlerts setAlertUuid(String alertUuid) {
            this.alertUuid = alertUuid;
            return this;
        }
        public String getAlertUuid() {
            return this.alertUuid;
        }

    }

}
