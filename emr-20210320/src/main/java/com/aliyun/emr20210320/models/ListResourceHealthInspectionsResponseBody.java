// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListResourceHealthInspectionsResponseBody extends TeaModel {
    @NameInMap("HealthInspections")
    public java.util.List<HealthInspections> healthInspections;

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

    public static ListResourceHealthInspectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceHealthInspectionsResponseBody self = new ListResourceHealthInspectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceHealthInspectionsResponseBody setHealthInspections(java.util.List<HealthInspections> healthInspections) {
        this.healthInspections = healthInspections;
        return this;
    }
    public java.util.List<HealthInspections> getHealthInspections() {
        return this.healthInspections;
    }

    public ListResourceHealthInspectionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceHealthInspectionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceHealthInspectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceHealthInspectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class HealthInspections extends TeaModel {
        /**
         * <p>应用名称。</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>组件名称。</p>
         * 
         * <strong>example:</strong>
         * <p>DataNode</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>健康详细信息。</p>
         * 
         * <strong>example:</strong>
         * <p>Connection timeout</p>
         */
        @NameInMap("HealthMessage")
        public String healthMessage;

        /**
         * <p>健康状态。</p>
         * 
         * <strong>example:</strong>
         * <p>GOOD</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>巡检项名称。</p>
         * 
         * <strong>example:</strong>
         * <p>live_status_check</p>
         */
        @NameInMap("InspectionName")
        public String inspectionName;

        /**
         * <p>节点ID。</p>
         * 
         * <strong>example:</strong>
         * <p>core1-1</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>节点名称。</p>
         * 
         * <strong>example:</strong>
         * <p>core1-1</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>最近上报时间戳。</p>
         * 
         * <strong>example:</strong>
         * <p>1639709192940</p>
         */
        @NameInMap("ReportTime")
        public Long reportTime;

        /**
         * <p>规则名称。</p>
         * 
         * <strong>example:</strong>
         * <p>live_status_check_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static HealthInspections build(java.util.Map<String, ?> map) throws Exception {
            HealthInspections self = new HealthInspections();
            return TeaModel.build(map, self);
        }

        public HealthInspections setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public HealthInspections setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public HealthInspections setHealthMessage(String healthMessage) {
            this.healthMessage = healthMessage;
            return this;
        }
        public String getHealthMessage() {
            return this.healthMessage;
        }

        public HealthInspections setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public HealthInspections setInspectionName(String inspectionName) {
            this.inspectionName = inspectionName;
            return this;
        }
        public String getInspectionName() {
            return this.inspectionName;
        }

        public HealthInspections setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public HealthInspections setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public HealthInspections setReportTime(Long reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public Long getReportTime() {
            return this.reportTime;
        }

        public HealthInspections setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
