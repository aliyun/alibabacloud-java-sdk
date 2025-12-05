// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ImportImageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>android 12 custom image</p>
     */
    @NameInMap("ImageDescription")
    public String imageDescription;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx.oss-xxx/xxxx.tgz">https://xxx.oss-xxx/xxxx.tgz</a></p>
     */
    @NameInMap("ImageFileURL")
    public String imageFileURL;

    /**
     * <strong>example:</strong>
     * <p>import custom image</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    public static ImportImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportImageRequest self = new ImportImageRequest();
        return TeaModel.build(map, self);
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
