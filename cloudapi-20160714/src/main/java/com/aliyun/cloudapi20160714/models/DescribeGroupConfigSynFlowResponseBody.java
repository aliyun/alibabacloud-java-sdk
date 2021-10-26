// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupConfigSynFlowResponseBody extends TeaModel {
    @NameInMap("ApiCopyVersion")
    public String apiCopyVersion;

    @NameInMap("SourceGroupId")
    public String sourceGroupId;

    @NameInMap("TargetGroupId")
    public String targetGroupId;

    @NameInMap("ExecutionTime")
    public String executionTime;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("Region")
    public String region;

    @NameInMap("FlowStatus")
    public String flowStatus;

    @NameInMap("TargetGroupName")
    public String targetGroupName;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("SourceGroupName")
    public String sourceGroupName;

    public static DescribeGroupConfigSynFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupConfigSynFlowResponseBody self = new DescribeGroupConfigSynFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupConfigSynFlowResponseBody setApiCopyVersion(String apiCopyVersion) {
        this.apiCopyVersion = apiCopyVersion;
        return this;
    }
    public String getApiCopyVersion() {
        return this.apiCopyVersion;
    }

    public DescribeGroupConfigSynFlowResponseBody setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    public DescribeGroupConfigSynFlowResponseBody setTargetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
        return this;
    }
    public String getTargetGroupId() {
        return this.targetGroupId;
    }

    public DescribeGroupConfigSynFlowResponseBody setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public String getExecutionTime() {
        return this.executionTime;
    }

    public DescribeGroupConfigSynFlowResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DescribeGroupConfigSynFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupConfigSynFlowResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeGroupConfigSynFlowResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeGroupConfigSynFlowResponseBody setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public String getFlowStatus() {
        return this.flowStatus;
    }

    public DescribeGroupConfigSynFlowResponseBody setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
        return this;
    }
    public String getTargetGroupName() {
        return this.targetGroupName;
    }

    public DescribeGroupConfigSynFlowResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeGroupConfigSynFlowResponseBody setSourceGroupName(String sourceGroupName) {
        this.sourceGroupName = sourceGroupName;
        return this;
    }
    public String getSourceGroupName() {
        return this.sourceGroupName;
    }

}
