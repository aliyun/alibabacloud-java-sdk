// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleRequest extends TeaModel {
    @NameInMap("AlgoType")
    public String algoType;

    @NameInMap("ImageURL")
    public String imageURL;

    public static GenerateHumanAnimeStyleRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanAnimeStyleRequest self = new GenerateHumanAnimeStyleRequest();
        return TeaModel.build(map, self);
    }

    public GenerateHumanAnimeStyleRequest setAlgoType(String algoType) {
        this.algoType = algoType;
        return this;
    }
    public String getAlgoType() {
        return this.algoType;
    }

    public GenerateHumanAnimeStyleRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
