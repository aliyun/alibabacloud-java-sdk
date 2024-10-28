// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PublishEdgeContainerAppVersionShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("FullRelease")
    public Boolean fullRelease;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Percentage")
    public Integer percentage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("PublishEnv")
    public String publishEnv;

    @NameInMap("PublishType")
    public String publishType;

    @NameInMap("Regions")
    public String regionsShrink;

    /**
     * <strong>example:</strong>
     * <p>test publish app</p>
     */
    @NameInMap("Remarks")
    public String remarks;

    /**
     * <strong>example:</strong>
     * <p>2023-06-05T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ver-87962637161651****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static PublishEdgeContainerAppVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishEdgeContainerAppVersionShrinkRequest self = new PublishEdgeContainerAppVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PublishEdgeContainerAppVersionShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PublishEdgeContainerAppVersionShrinkRequest setFullRelease(Boolean fullRelease) {
        this.fullRelease = fullRelease;
        return this;
    }
    public Boolean getFullRelease() {
        return this.fullRelease;
    }

    public PublishEdgeContainerAppVersionShrinkRequest setPercentage(Integer percentage) {
        this.percentage = percentage;
        return this;
    }
    public Integer getPercentage() {
        return this.percentage;
    }

    public PublishEdgeContainerAppVersionShrinkRequest setPublishEnv(String publishEnv) {
        this.publishEnv = publishEnv;
        return this;
    }
    public String getPublishEnv() {
        return this.publishEnv;
    }

    public PublishEdgeContainerAppVersionShrinkRequest setPublishType(String publishType) {
        this.publishType = publishType;
        return this;
    }
    public String getPublishType() {
        return this.publishType;
    }

    public PublishEdgeContainerAppVersionShrinkRequest setRegionsShrink(String regionsShrink) {
        this.regionsShrink = regionsShrink;
        return this;
    }
    public String getRegionsShrink() {
        return this.regionsShrink;
    }

    public PublishEdgeContainerAppVersionShrinkRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public PublishEdgeContainerAppVersionShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public PublishEdgeContainerAppVersionShrinkRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
