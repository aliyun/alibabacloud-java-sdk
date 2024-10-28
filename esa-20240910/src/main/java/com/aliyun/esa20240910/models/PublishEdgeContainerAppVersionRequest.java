// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PublishEdgeContainerAppVersionRequest extends TeaModel {
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
    public java.util.List<String> regions;

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

    public static PublishEdgeContainerAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishEdgeContainerAppVersionRequest self = new PublishEdgeContainerAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishEdgeContainerAppVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PublishEdgeContainerAppVersionRequest setFullRelease(Boolean fullRelease) {
        this.fullRelease = fullRelease;
        return this;
    }
    public Boolean getFullRelease() {
        return this.fullRelease;
    }

    public PublishEdgeContainerAppVersionRequest setPercentage(Integer percentage) {
        this.percentage = percentage;
        return this;
    }
    public Integer getPercentage() {
        return this.percentage;
    }

    public PublishEdgeContainerAppVersionRequest setPublishEnv(String publishEnv) {
        this.publishEnv = publishEnv;
        return this;
    }
    public String getPublishEnv() {
        return this.publishEnv;
    }

    public PublishEdgeContainerAppVersionRequest setPublishType(String publishType) {
        this.publishType = publishType;
        return this;
    }
    public String getPublishType() {
        return this.publishType;
    }

    public PublishEdgeContainerAppVersionRequest setRegions(java.util.List<String> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    public PublishEdgeContainerAppVersionRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public PublishEdgeContainerAppVersionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public PublishEdgeContainerAppVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
