// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddImages2LibRequest extends TeaModel {
    @NameInMap("ImgUrl")
    public String imgUrl;

    @NameInMap("LibId")
    public String libId;

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
