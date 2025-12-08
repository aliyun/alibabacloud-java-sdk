// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleAdvanceRequest extends TeaModel {
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
    public java.io.InputStream imageURLObject;

    public static GenerateHumanAnimeStyleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanAnimeStyleAdvanceRequest self = new GenerateHumanAnimeStyleAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateHumanAnimeStyleAdvanceRequest setAlgoType(String algoType) {
        this.algoType = algoType;
        return this;
    }
    public String getAlgoType() {
        return this.algoType;
    }

    public GenerateHumanAnimeStyleAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
