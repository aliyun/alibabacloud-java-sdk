// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyBundleRequest extends TeaModel {
    /**
     * <p>The ID of the cloud computer template that you want to modify.</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <p>The name of the new cloud computer template.</p>
     */
    @NameInMap("BundleName")
    public String bundleName;

    /**
     * <p>The description of the new cloud computer template.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The new image ID. The new image must meet the following conditions:</p>
     * <br>
     * <p>*   The new image must be in the Available state.</p>
     * <p>*   The operating system of the new image must be the same as that of the original image.</p>
     * <p>*   The required disk size for the new image cannot be greater than that for the original image.</p>
     * <p>*   The GPU type of the new image must be the same as that of the original image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The OS language. This parameter is available only for system images.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   en-US: American English</p>
     * <p>*   zh-HK: Traditional Chinese (Hong Kong)</p>
     * <p>*   zh-CN: Simplified Chinese.</p>
     * <br>
     * <p>*   ja-JP: Japanese</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
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
