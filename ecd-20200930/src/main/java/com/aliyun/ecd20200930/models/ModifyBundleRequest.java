// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyBundleRequest extends TeaModel {
    // The ID of the desktop template.
    @NameInMap("BundleId")
    public String bundleId;

    // The name of the new desktop template.
    @NameInMap("BundleName")
    public String bundleName;

    // The description of the new desktop template.
    @NameInMap("Description")
    public String description;

    // The ID of the new image. The new image must meet the following requirements:
    // 
    // *   The new image must be in the Available state.
    // *   The operating system of the new image must be the same as that of the original image.
    // *   The required disk size for the new image cannot be greater than that for the original image.
    // *   The GPU type of the new image must be the same as that of the original image.
    @NameInMap("ImageId")
    public String imageId;

    // The language of the operating system. This parameter is available only for system images. Valid values:
    // 
    // *   zh-CN: Simplified Chinese
    // *   zh-HK: Traditional Chinese (Hong Kong)
    // *   en-US: English
    @NameInMap("Language")
    public String language;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyBundleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBundleRequest self = new ModifyBundleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBundleRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public ModifyBundleRequest setBundleName(String bundleName) {
        this.bundleName = bundleName;
        return this;
    }
    public String getBundleName() {
        return this.bundleName;
    }

    public ModifyBundleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyBundleRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyBundleRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ModifyBundleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
