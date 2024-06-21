// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRumAppRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("AppGroup")
    public String appGroup;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>com.xxxx.xxxxxx</p>
     */
    @NameInMap("PackageName")
    public String packageName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("SiteType")
    public String siteType;

    /**
     * <strong>example:</strong>
     * <p>arms</p>
     */
    @NameInMap("Source")
    public String source;

    @NameInMap("Tag")
    public java.util.List<CreateRumAppRequestTag> tag;

    public static CreateRumAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRumAppRequest self = new CreateRumAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateRumAppRequest setAppGroup(String appGroup) {
        this.appGroup = appGroup;
        return this;
    }
    public String getAppGroup() {
        return this.appGroup;
    }

    public CreateRumAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateRumAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRumAppRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public CreateRumAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRumAppRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRumAppRequest setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

    public CreateRumAppRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateRumAppRequest setTag(java.util.List<CreateRumAppRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateRumAppRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateRumAppRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRumAppRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateRumAppRequestTag self = new CreateRumAppRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateRumAppRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRumAppRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
