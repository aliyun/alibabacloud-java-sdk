// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateImageRequest extends TeaModel {
    /**
     * <p>The complete list of application adapter IDs for the selected image version. A maximum of 100 items are supported. <strong>When a non-empty list is passed, it must include the adapters that you still want to retain. Omitting this parameter or passing an empty list does not clear the existing associations.</strong></p>
     */
    @NameInMap("AdaptorIdList")
    public java.util.List<String> adaptorIdList;

    /**
     * <p>The updated description of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>Update office software and basic configurations</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The operating system distribution information of the image. This must be consistent with the actual operating system distribution of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>Ubuntu 22.04 64-bit</p>
     */
    @NameInMap("Distro")
    public String distro;

    /**
     * <p>The ID of the image to be modified. You must provide at least one of ImageId and VersionId. If both are provided, they must belong to the same image.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-bp1example****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The new name of the image. Specify this parameter only when you need to update the name.</p>
     * 
     * <strong>example:</strong>
     * <p>OfficeImage_202611</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The language of the image. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Simplified Chinese.</li>
     * <li><strong>zh-HK</strong>: Traditional Chinese (Hong Kong).</li>
     * <li><strong>en-US</strong>: English.</li>
     * <li><strong>ja-JP</strong>: Japanese.</li>
     * <li><strong>CN</strong>: A compatible value for Simplified Chinese.</li>
     * <li><strong>EN</strong>: A compatible value for English.</li>
     * <li><strong>JP</strong>: A compatible value for Japanese.</li>
     * <li><strong>CN-HK</strong>: A compatible value for Traditional Chinese (Hong Kong).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The ID of the image version to be modified. If this parameter is omitted, the current effective version of the image specified by ImageId is used. You must provide at least one of ImageId and VersionId.</p>
     * 
     * <strong>example:</strong>
     * <p>iv-bp1example****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    /**
     * <p>The new display name of the image version.</p>
     * 
     * <strong>example:</strong>
     * <p>Office environment-202611</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static UpdateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageRequest self = new UpdateImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageRequest setAdaptorIdList(java.util.List<String> adaptorIdList) {
        this.adaptorIdList = adaptorIdList;
        return this;
    }
    public java.util.List<String> getAdaptorIdList() {
        return this.adaptorIdList;
    }

    public UpdateImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateImageRequest setDistro(String distro) {
        this.distro = distro;
        return this;
    }
    public String getDistro() {
        return this.distro;
    }

    public UpdateImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public UpdateImageRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public UpdateImageRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public UpdateImageRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
