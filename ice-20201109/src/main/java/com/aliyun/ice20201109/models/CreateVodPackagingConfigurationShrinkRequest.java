// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingConfigurationShrinkRequest extends TeaModel {
    /**
     * <p>The name of the packaging configuration. The name must be unique in an account and can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>hls_3s</p>
     */
    @NameInMap("ConfigurationName")
    public String configurationName;

    /**
     * <p>The description of the packaging configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>HLS 3s vod packaging</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the packaging group. The name can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>vod_hls</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The packaging configuration.</p>
     */
    @NameInMap("PackageConfig")
    public String packageConfigShrink;

    /**
     * <p>The package type.</p>
     * <ul>
     * <li>HLS: packages content into TS segments for delivery over the HLS protocol.</li>
     * <li>HLS_CMAF: packages content into CMAF segments for delivery over the HLS protocol.</li>
     * <li>DASH: packages content for delivery over the DASH protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HLS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    public static CreateVodPackagingConfigurationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVodPackagingConfigurationShrinkRequest self = new CreateVodPackagingConfigurationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateVodPackagingConfigurationShrinkRequest setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }
    public String getConfigurationName() {
        return this.configurationName;
    }

    public CreateVodPackagingConfigurationShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVodPackagingConfigurationShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateVodPackagingConfigurationShrinkRequest setPackageConfigShrink(String packageConfigShrink) {
        this.packageConfigShrink = packageConfigShrink;
        return this;
    }
    public String getPackageConfigShrink() {
        return this.packageConfigShrink;
    }

    public CreateVodPackagingConfigurationShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
