// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PublishEdgeContainerAppVersionShrinkRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether to fully release the version. This parameter takes effect only when PublishType is set to region.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FullRelease")
    public Boolean fullRelease;

    /**
     * <p>The release percentage. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Percentage")
    public Integer percentage;

    /**
     * <p>The environment to which you want to release the version. Valid values:</p>
     * <ul>
     * <li>prod: the production environment.</li>
     * <li>staging: the staging environment.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("PublishEnv")
    public String publishEnv;

    /**
     * <p>Specifies how the version is released. Valid values:</p>
     * <ul>
     * <li>percentage: releases the version by percentage.</li>
     * <li>region: releases the version by region.</li>
     * </ul>
     * <p>If you do not specify this parameter, the version is released by percentage by default.</p>
     * 
     * <strong>example:</strong>
     * <p>percentage</p>
     */
    @NameInMap("PublishType")
    public String publishType;

    /**
     * <p>The regions to which the version is released.</p>
     */
    @NameInMap("Regions")
    public String regionsShrink;

    /**
     * <p>The remarks. This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>test publish app</p>
     */
    @NameInMap("Remarks")
    public String remarks;

    /**
     * <p>The time when the application version starts to be released. If you do not specify this parameter, the current time is used by default.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-05T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The version ID.</p>
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
