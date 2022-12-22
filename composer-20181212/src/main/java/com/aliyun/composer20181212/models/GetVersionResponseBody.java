// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetVersionResponseBody extends TeaModel {
    // The time when the version was created.
    @NameInMap("CreateTime")
    public String createTime;

    // The definition of the workflow to which the version belongs.
    @NameInMap("Definition")
    public String definition;

    // The ID of the workflow to which the version belongs.
    @NameInMap("FlowId")
    public String flowId;

    // The region where the workflow resides.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The time when the version was last updated.
    @NameInMap("UpdateTime")
    public String updateTime;

    // The description of the version.
    @NameInMap("VersionDescription")
    public String versionDescription;

    // The ID of the version.
    @NameInMap("VersionId")
    public String versionId;

    // The name of the version.
    @NameInMap("VersionName")
    public String versionName;

    // The status of the version. **Enabled** indicates that the version is enabled.
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
