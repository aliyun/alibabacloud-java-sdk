// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanSketchStyleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/GenerateHumanSketchStyle/GenerateHumanSketchStyle7.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/GenerateHumanSketchStyle/GenerateHumanSketchStyle7.png</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <strong>example:</strong>
     * <p>head</p>
     */
    @NameInMap("ReturnType")
    public String returnType;

    public static GenerateHumanSketchStyleRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanSketchStyleRequest self = new GenerateHumanSketchStyleRequest();
        return TeaModel.build(map, self);
    }

    public GenerateHumanSketchStyleRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public GenerateHumanSketchStyleRequest setReturnType(String returnType) {
        this.returnType = returnType;
        return this;
    }
    public String getReturnType() {
        return this.returnType;
    }

}
