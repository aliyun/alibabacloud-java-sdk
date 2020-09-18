// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FlowId")
    @Validation(required = true)
    public String flowId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VersionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("VersionDescription")
    @Validation(required = true)
    public String versionDescription;

    @NameInMap("Definition")
    @Validation(required = true)
    public String definition;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("UpdateTime")
    @Validation(required = true)
    public String updateTime;

    @NameInMap("VersionId")
    @Validation(required = true)
    public Integer versionId;

    @NameInMap("VersionStatus")
    @Validation(required = true)
    public String versionStatus;

    public static GetVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVersionResponse self = new GetVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVersionResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GetVersionResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVersionResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public GetVersionResponse setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public GetVersionResponse setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetVersionResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetVersionResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetVersionResponse setVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }
    public Integer getVersionId() {
        return this.versionId;
    }

    public GetVersionResponse setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }
    public String getVersionStatus() {
        return this.versionStatus;
    }

}
