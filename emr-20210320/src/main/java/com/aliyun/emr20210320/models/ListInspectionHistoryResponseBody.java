// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListInspectionHistoryResponseBody extends TeaModel {
    /**
     * <p>Created on 2023/8/21</p>
     */
    @NameInMap("Data")
    public java.util.List<Data> data;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInspectionHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionHistoryResponseBody self = new ListInspectionHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInspectionHistoryResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public ListInspectionHistoryResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInspectionHistoryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInspectionHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInspectionHistoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class Data extends TeaModel {
        /**
         * <p>变更消息</p>
         */
        @NameInMap("ChangeMessage")
        public String changeMessage;

        /**
         * <p>巡检状态</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>巡检变更明细</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("InspectionItems")
        public java.util.List<java.util.Map<String, String>> inspectionItems;

        @NameInMap("ReportTime")
        public String reportTime;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setChangeMessage(String changeMessage) {
            this.changeMessage = changeMessage;
            return this;
        }
        public String getChangeMessage() {
            return this.changeMessage;
        }

        public Data setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public Data setInspectionItems(java.util.List<java.util.Map<String, String>> inspectionItems) {
            this.inspectionItems = inspectionItems;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getInspectionItems() {
            return this.inspectionItems;
        }

        public Data setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

    }

}
