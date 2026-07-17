// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PublishEdgeContainerAppVersionRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <blockquote>
     * <ol>
     * <li>AppId is obtained by calling CreateEdgeContainerApp. 2) VersionId is obtained by calling CreateEdgeContainerAppVersion (AppId is required). 3) The complete call chain is CreateEdgeContainerApp → CreateEdgeContainerAppVersion → PublishEdgeContainerAppVersion.</li>
     * </ol>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether to perform a full release. This parameter takes effect only when PublishType is set to region.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FullRelease")
    public Boolean fullRelease;

    /**
     * <p>The publishing percentage. Valid values: <strong>1 to 100</strong>. Default value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Percentage")
    public Integer percentage;

    /**
     * <p>The publishing environment. Valid values:</p>
     * <ul>
     * <li><strong>prod</strong>: production environment.</li>
     * <li><strong>staging</strong>: staging environment.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("PublishEnv")
    public String publishEnv;

    /**
     * <p>The publishing type. Valid values:</p>
     * <ul>
     * <li><p><strong>percentage</strong>: publishes by percentage.</p>
     * </li>
     * <li><p><strong>region</strong>: publishes by region.</p>
     * </li>
     * </ul>
     * <p>If this parameter is not specified, percentage-based publishing is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>percentage</p>
     */
    @NameInMap("PublishType")
    public String publishType;

    /**
     * <p>The list of publishing regions.</p>
     */
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <p>The remarks. Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>test publish app</p>
     */
    @NameInMap("Remarks")
    public String remarks;

    /**
     * <p>The time when the publishing starts. If this parameter is not specified, the current time is used by default.</p>
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
