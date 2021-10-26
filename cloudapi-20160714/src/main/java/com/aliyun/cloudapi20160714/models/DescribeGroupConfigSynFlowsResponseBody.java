// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupConfigSynFlowsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Flows")
    public DescribeGroupConfigSynFlowsResponseBodyFlows flows;

    public static DescribeGroupConfigSynFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupConfigSynFlowsResponseBody self = new DescribeGroupConfigSynFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupConfigSynFlowsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGroupConfigSynFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupConfigSynFlowsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupConfigSynFlowsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGroupConfigSynFlowsResponseBody setFlows(DescribeGroupConfigSynFlowsResponseBodyFlows flows) {
        this.flows = flows;
        return this;
    }
    public DescribeGroupConfigSynFlowsResponseBodyFlows getFlows() {
        return this.flows;
    }

    public static class DescribeGroupConfigSynFlowsResponseBodyFlowsFlow extends TeaModel {
        @NameInMap("ApiCopyVersion")
        public String apiCopyVersion;

        @NameInMap("SourceGroupId")
        public String sourceGroupId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("FlowStatus")
        public String flowStatus;

        @NameInMap("Region")
        public String region;

        @NameInMap("ExecutionTime")
        public String executionTime;

        @NameInMap("TargetGroupName")
        public String targetGroupName;

        @NameInMap("TargetGroupId")
        public String targetGroupId;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("SourceGroupName")
        public String sourceGroupName;

        public static DescribeGroupConfigSynFlowsResponseBodyFlowsFlow build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupConfigSynFlowsResponseBodyFlowsFlow self = new DescribeGroupConfigSynFlowsResponseBodyFlowsFlow();
            return TeaModel.build(map, self);
        }

        public DescribeGroupConfigSynFlowsResponseBodyFlowsFlow setApiCopyVersion(String apiCopyVersion) {
            this.apiCopyVersion = apiCopyVersion;
            return this;
        }
        public String getApiCopyVersion() {
            return this.apiCopyVersion;
        }

        public DescribeGroupConfigSynFlowsResponseBodyFlowsFlow setSourceGroupId(String sourceGroupId) {
            this.sourceGroupId = sourceGroupId;
            return this;
        }
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        public DescribeGroupConfigSynFlowsResponseBodyFlowsFlow setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeGroupConfigSynFlowsResponseBodyFlowsFlow setFlowStatus(String flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public String getFlowStatus() {
            return this.flowStatus;
        }

        public DescribeGroupConfigSynFlowsResponseBodyFlowsFlow setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeGroupConfigSynFlowsResponseBodyFlowsFlow setExecutionTime(String executionTime) {
            this.executionTime = executionTime;
            return this;
        }
        public String getExecutionTime() {
            return this.executionTime;
        }

        public DescribeGroupConfigSynFlowsResponseBodyFlowsFlow setTargetGroupName(String targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

        public DescribeGroupConfigSynFlowsResponseBodyFlowsFlow setTargetGroupId(String targetGroupId) {
            this.targetGroupId = targetGroupId;
            return this;
        }
        public String getTargetGroupId() {
            return this.targetGroupId;
        }

        public DescribeGroupConfigSynFlowsResponseBodyFlowsFlow setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeGroupConfigSynFlowsResponseBodyFlowsFlow setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public DescribeGroupConfigSynFlowsResponseBodyFlowsFlow setSourceGroupName(String sourceGroupName) {
            this.sourceGroupName = sourceGroupName;
            return this;
        }
        public String getSourceGroupName() {
            return this.sourceGroupName;
        }

    }

    public static class DescribeGroupConfigSynFlowsResponseBodyFlows extends TeaModel {
        @NameInMap("Flow")
        public java.util.List<DescribeGroupConfigSynFlowsResponseBodyFlowsFlow> flow;

        public static DescribeGroupConfigSynFlowsResponseBodyFlows build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupConfigSynFlowsResponseBodyFlows self = new DescribeGroupConfigSynFlowsResponseBodyFlows();
            return TeaModel.build(map, self);
        }

        public DescribeGroupConfigSynFlowsResponseBodyFlows setFlow(java.util.List<DescribeGroupConfigSynFlowsResponseBodyFlowsFlow> flow) {
            this.flow = flow;
            return this;
        }
        public java.util.List<DescribeGroupConfigSynFlowsResponseBodyFlowsFlow> getFlow() {
            return this.flow;
        }

    }

}
