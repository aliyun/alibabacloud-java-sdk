// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddImages2LibRequest extends TeaModel {
    /**
     * <p>The URL of the image. This value must be the Key field returned by GetUploadInfo, in the format of image/upload/<hash>. Passing an external image URL returns a 400 image.url.invalid error.</p>
     * 
     * <strong>example:</strong>
     * <p>image/upload/755c31906fc0b0b5007ecead9660c2ab</p>
     */
    @NameInMap("ImgUrl")
    public String imgUrl;

    /**
     * <p>The ID of the image library.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_imglib_001</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddImages2LibRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImages2LibRequest self = new AddImages2LibRequest();
        return TeaModel.build(map, self);
    }

    public AddImages2LibRequest setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }
    public String getImgUrl() {
        return this.imgUrl;
    }

    public AddImages2LibRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public AddImages2LibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
