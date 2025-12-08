// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanSketchStyleAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/GenerateHumanSketchStyle/GenerateHumanSketchStyle7.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/GenerateHumanSketchStyle/GenerateHumanSketchStyle7.png</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    /**
     * <strong>example:</strong>
     * <p>head</p>
     */
    @NameInMap("ReturnType")
    public String returnType;

    public static GenerateHumanSketchStyleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanSketchStyleAdvanceRequest self = new GenerateHumanSketchStyleAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateHumanSketchStyleAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public GenerateHumanSketchStyleAdvanceRequest setReturnType(String returnType) {
        this.returnType = returnType;
        return this;
    }
    public String getReturnType() {
        return this.returnType;
    }

}
