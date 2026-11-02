// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class VodPackagingConfiguration extends TeaModel {
    /**
     * <p>The name of the packaging configuration. The name can be up to 128 characters in length, must match the [A-Za-z0-9_-]+ format, and must be unique per user.</p>
     * 
     * <strong>example:</strong>
     * <p>example-config</p>
     */
    @NameInMap("ConfigurationName")
    public String configurationName;

    /**
     * <p>The creation time.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the packaging configuration.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the packaging group. The name can be up to 128 characters in length and must match the [A-Za-z0-9_-]+ format.</p>
     * 
     * <strong>example:</strong>
     * <p>example-group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("PackageConfig")
    public VodPackagingConfig packageConfig;

    /**
     * <p>The packaging type. Valid values:</p>
     * <ul>
     * <li>HLS: HLS protocol playback format.</li>
     * <li>HLS_CMAF: CMAF playback format for the HLS protocol.</li>
     * <li>DASH: DASH protocol playback format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HLS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    public static VodPackagingConfiguration build(java.util.Map<String, ?> map) throws Exception {
        VodPackagingConfiguration self = new VodPackagingConfiguration();
        return TeaModel.build(map, self);
    }

    public VodPackagingConfiguration setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }
    public String getConfigurationName() {
        return this.configurationName;
    }

    public VodPackagingConfiguration setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public VodPackagingConfiguration setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VodPackagingConfiguration setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public VodPackagingConfiguration setPackageConfig(VodPackagingConfig packageConfig) {
        this.packageConfig = packageConfig;
        return this;
    }
    public VodPackagingConfig getPackageConfig() {
        return this.packageConfig;
    }

    public VodPackagingConfiguration setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
