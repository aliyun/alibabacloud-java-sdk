// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRumAppShrinkRequest extends TeaModel {
    /**
     * <p>The name of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("AppGroup")
    public String appGroup;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>Monitoring description</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Language")
    public String language;

    /**
     * <p>The nickname of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("NickName")
    public String nickName;

    /**
     * <p>The name of the Android application package. This parameter is required if you create an Android application.</p>
     * 
     * <strong>example:</strong>
     * <p>com.xxxx.xxxxxx</p>
     */
    @NameInMap("PackageName")
    public String packageName;

    @NameInMap("RealRegionId")
    public String realRegionId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The application type. Valid values: web, miniapp, ios, and android.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("SiteType")
    public String siteType;

    /**
     * <p>The source. This is a reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>arms</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The list of tags. You can specify a maximum of 20 tags.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    @NameInMap("Workspace")
    public String workspace;

    public static CreateRumAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRumAppShrinkRequest self = new CreateRumAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRumAppShrinkRequest setAppGroup(String appGroup) {
        this.appGroup = appGroup;
        return this;
    }
    public String getAppGroup() {
        return this.appGroup;
    }

    public CreateRumAppShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateRumAppShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRumAppShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateRumAppShrinkRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public CreateRumAppShrinkRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public CreateRumAppShrinkRequest setRealRegionId(String realRegionId) {
        this.realRegionId = realRegionId;
        return this;
    }
    public String getRealRegionId() {
        return this.realRegionId;
    }

    public CreateRumAppShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRumAppShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRumAppShrinkRequest setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

    public CreateRumAppShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateRumAppShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public CreateRumAppShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
