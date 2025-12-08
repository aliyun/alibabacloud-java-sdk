// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>anime</p>
     */
    @NameInMap("AlgoType")
    public String algoType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/GenerateHumanAnimeStyle/GenerateHumanAnimeStyle8.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/GenerateHumanAnimeStyle/GenerateHumanAnimeStyle8.png</a></p>
     */
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
