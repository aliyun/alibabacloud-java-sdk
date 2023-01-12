// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListNotificationHistoriesStatisticsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Quota")
    public java.util.List<ListNotificationHistoriesStatisticsResponseBodyQuota> quota;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistics")
    public java.util.List<ListNotificationHistoriesStatisticsResponseBodyStatistics> statistics;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNotificationHistoriesStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationHistoriesStatisticsResponseBody self = new ListNotificationHistoriesStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNotificationHistoriesStatisticsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNotificationHistoriesStatisticsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNotificationHistoriesStatisticsResponseBody setQuota(java.util.List<ListNotificationHistoriesStatisticsResponseBodyQuota> quota) {
        this.quota = quota;
        return this;
    }
    public java.util.List<ListNotificationHistoriesStatisticsResponseBodyQuota> getQuota() {
        return this.quota;
    }

    public ListNotificationHistoriesStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNotificationHistoriesStatisticsResponseBody setStatistics(java.util.List<ListNotificationHistoriesStatisticsResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<ListNotificationHistoriesStatisticsResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public ListNotificationHistoriesStatisticsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNotificationHistoriesStatisticsResponseBodyQuota extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Quota")
        public String quota;

        public static ListNotificationHistoriesStatisticsResponseBodyQuota build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationHistoriesStatisticsResponseBodyQuota self = new ListNotificationHistoriesStatisticsResponseBodyQuota();
            return TeaModel.build(map, self);
        }

        public ListNotificationHistoriesStatisticsResponseBodyQuota setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public ListNotificationHistoriesStatisticsResponseBodyQuota setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListNotificationHistoriesStatisticsResponseBodyQuota setQuota(String quota) {
            this.quota = quota;
            return this;
        }
        public String getQuota() {
            return this.quota;
        }

    }

    public static class ListNotificationHistoriesStatisticsResponseBodyStatistics extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceId")
        public String resourceId;

        public static ListNotificationHistoriesStatisticsResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationHistoriesStatisticsResponseBodyStatistics self = new ListNotificationHistoriesStatisticsResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public ListNotificationHistoriesStatisticsResponseBodyStatistics setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public ListNotificationHistoriesStatisticsResponseBodyStatistics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNotificationHistoriesStatisticsResponseBodyStatistics setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
