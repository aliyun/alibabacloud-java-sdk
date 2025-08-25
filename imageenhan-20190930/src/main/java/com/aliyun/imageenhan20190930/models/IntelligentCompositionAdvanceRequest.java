// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class IntelligentCompositionAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/IntelligentComposition/IntelligentComposition3.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/IntelligentComposition/IntelligentComposition3.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("NumBoxes")
    public Integer numBoxes;

    public static IntelligentCompositionAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        IntelligentCompositionAdvanceRequest self = new IntelligentCompositionAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public IntelligentCompositionAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public IntelligentCompositionAdvanceRequest setNumBoxes(Integer numBoxes) {
        this.numBoxes = numBoxes;
        return this;
    }
    public Integer getNumBoxes() {
        return this.numBoxes;
    }

}
