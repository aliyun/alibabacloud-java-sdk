// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CountCrowdRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("IsShow")
    public Boolean isShow;

    public static CountCrowdRequest build(java.util.Map<String, ?> map) throws Exception {
        CountCrowdRequest self = new CountCrowdRequest();
        return TeaModel.build(map, self);
    }

    public CountCrowdRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public CountCrowdRequest setIsShow(Boolean isShow) {
        this.isShow = isShow;
        return this;
    }
    public Boolean getIsShow() {
        return this.isShow;
    }

}
