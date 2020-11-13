// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static GenerateHumanAnimeStyleRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanAnimeStyleRequest self = new GenerateHumanAnimeStyleRequest();
        return TeaModel.build(map, self);
    }

    public GenerateHumanAnimeStyleRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
