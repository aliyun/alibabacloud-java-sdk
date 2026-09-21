// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ImportImageRequest extends TeaModel {
    /**
     * <p>The ID of the base image.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-0aae4rgn0bk8f****</p>
     */
    @NameInMap("BaseImageId")
    public String baseImageId;

    /**
     * <p>The description of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>android 12 custom image</p>
     */
    @NameInMap("ImageDescription")
    public String imageDescription;

    /**
     * <p>The URL of the image. The URL must be an Alibaba Cloud Object Storage Service (OSS) address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.oss-xxx/xxxx.tgz">https://xxx.oss-xxx/xxxx.tgz</a></p>
     */
    @NameInMap("ImageFileURL")
    public String imageFileURL;

    /**
     * <p>The name of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>import custom image</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    public static ImportImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportImageRequest self = new ImportImageRequest();
        return TeaModel.build(map, self);
    }

    public ImportImageRequest setBaseImageId(String baseImageId) {
        this.baseImageId = baseImageId;
        return this;
    }
    public String getBaseImageId() {
        return this.baseImageId;
    }

    public ImportImageRequest setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
        return this;
    }
    public String getImageDescription() {
        return this.imageDescription;
    }

    public ImportImageRequest setImageFileURL(String imageFileURL) {
        this.imageFileURL = imageFileURL;
        return this;
    }
    public String getImageFileURL() {
        return this.imageFileURL;
    }

    public ImportImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

}
