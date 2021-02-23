// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetVersionResponseBody extends TeaModel {
    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 工作流定义
    @NameInMap("Definition")
    public String definition;

    // 工作流 ID
    @NameInMap("FlowId")
    public String flowId;

    // 地域 ID
    @NameInMap("RegionId")
    public String regionId;

    // 请求 ID
    @NameInMap("RequestId")
    public String requestId;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    // 版本描述
    @NameInMap("VersionDescription")
    public String versionDescription;

    // 版本 ID
    @NameInMap("VersionId")
    public String versionId;

    // 版本名称
    @NameInMap("VersionName")
    public String versionName;

    // 版本状态
    @NameInMap("VersionStatus")
    public String versionStatus;

    public static GetVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVersionResponseBody self = new GetVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVersionResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetVersionResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetVersionResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GetVersionResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVersionResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetVersionResponseBody setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public GetVersionResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public GetVersionResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public GetVersionResponseBody setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }
    public String getVersionStatus() {
        return this.versionStatus;
    }

}
