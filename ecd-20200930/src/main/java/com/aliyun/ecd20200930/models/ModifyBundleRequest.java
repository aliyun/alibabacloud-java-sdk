// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyBundleRequest extends TeaModel {
    /**
     * <p>The ID of the cloud computer template that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b-2g65ljy4291vl****</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <p>The name of the new cloud computer template.</p>
     * 
     * <strong>example:</strong>
     * <p>newName</p>
     */
    @NameInMap("BundleName")
    public String bundleName;

    /**
     * <p>The description of the new cloud computer template.</p>
     * 
     * <strong>example:</strong>
     * <p>newDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The new image ID. The new image must meet the following conditions:</p>
     * <ul>
     * <li>The new image must be in the Available state.</li>
     * <li>The operating system of the new image must be the same as that of the original image.</li>
     * <li>The required disk size for the new image cannot be greater than that for the original image.</li>
     * <li>The GPU type of the new image must be the same as that of the original image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>m-aea3oaww001np****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The OS language. This parameter is available only for system images.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>en-US: American English</p>
     * </li>
     * <li><p>zh-HK: Traditional Chinese (Hong Kong)</p>
     * </li>
     * <li><p>zh-CN: Simplified Chinese.</p>
     * </li>
     * <li><p>ja-JP: Japanese</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
