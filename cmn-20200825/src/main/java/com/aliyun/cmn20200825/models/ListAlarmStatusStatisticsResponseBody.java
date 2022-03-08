// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListAlarmStatusStatisticsResponseBody extends TeaModel {
    // MaxResults本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 统计数据
    @NameInMap("Statistics")
    public java.util.List<ListAlarmStatusStatisticsResponseBodyStatistics> statistics;

    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAlarmStatusStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmStatusStatisticsResponseBody self = new ListAlarmStatusStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmStatusStatisticsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlarmStatusStatisticsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlarmStatusStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmStatusStatisticsResponseBody setStatistics(java.util.List<ListAlarmStatusStatisticsResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<ListAlarmStatusStatisticsResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public ListAlarmStatusStatisticsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlarmStatusStatisticsResponseBodyStatistics extends TeaModel {
        // 数量
        @NameInMap("Count")
        public Long count;

        // 名称
        @NameInMap("Name")
        public String name;

        // 资源ID
        @NameInMap("ResourceId")
        public String resourceId;

        public static ListAlarmStatusStatisticsResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusStatisticsResponseBodyStatistics self = new ListAlarmStatusStatisticsResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusStatisticsResponseBodyStatistics setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListAlarmStatusStatisticsResponseBodyStatistics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlarmStatusStatisticsResponseBodyStatistics setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
