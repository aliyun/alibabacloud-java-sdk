// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddImages2LibRequest extends TeaModel {
    /**
     * <p>URL of the image to be uploaded.</p>
     * 
     * <strong>example:</strong>
     * <p>upload/ea7a98f9-f8bd-4905-a79b-963c9da419c5.jpg</p>
     */
    @NameInMap("ImgUrl")
    public String imgUrl;

    /**
     * <p>The ID of image library.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <p>Region ID</p>
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
