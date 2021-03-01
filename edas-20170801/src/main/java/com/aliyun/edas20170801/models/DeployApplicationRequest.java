// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeployApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("PackageVersion")
    public String packageVersion;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("DeployType")
    public String deployType;

    @NameInMap("WarUrl")
    public String warUrl;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Batch")
    public Integer batch;

    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    @NameInMap("AppEnv")
    public String appEnv;

    @NameInMap("BuildPackId")
    public Long buildPackId;

    @NameInMap("ComponentIds")
    public String componentIds;

    @NameInMap("ReleaseType")
    public Long releaseType;

    @NameInMap("Gray")
    public Boolean gray;

    @NameInMap("TrafficControlStrategy")
    public String trafficControlStrategy;

    public static DeployApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationRequest self = new DeployApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeployApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeployApplicationRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public DeployApplicationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public DeployApplicationRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public DeployApplicationRequest setWarUrl(String warUrl) {
        this.warUrl = warUrl;
        return this;
    }
    public String getWarUrl() {
        return this.warUrl;
    }

    public DeployApplicationRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DeployApplicationRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeployApplicationRequest setBatch(Integer batch) {
        this.batch = batch;
        return this;
    }
    public Integer getBatch() {
        return this.batch;
    }

    public DeployApplicationRequest setBatchWaitTime(Integer batchWaitTime) {
        this.batchWaitTime = batchWaitTime;
        return this;
    }
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    public DeployApplicationRequest setAppEnv(String appEnv) {
        this.appEnv = appEnv;
        return this;
    }
    public String getAppEnv() {
        return this.appEnv;
    }

    public DeployApplicationRequest setBuildPackId(Long buildPackId) {
        this.buildPackId = buildPackId;
        return this;
    }
    public Long getBuildPackId() {
        return this.buildPackId;
    }

    public DeployApplicationRequest setComponentIds(String componentIds) {
        this.componentIds = componentIds;
        return this;
    }
    public String getComponentIds() {
        return this.componentIds;
    }

    public DeployApplicationRequest setReleaseType(Long releaseType) {
        this.releaseType = releaseType;
        return this;
    }
    public Long getReleaseType() {
        return this.releaseType;
    }

    public DeployApplicationRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public DeployApplicationRequest setTrafficControlStrategy(String trafficControlStrategy) {
        this.trafficControlStrategy = trafficControlStrategy;
        return this;
    }
    public String getTrafficControlStrategy() {
        return this.trafficControlStrategy;
    }

}
