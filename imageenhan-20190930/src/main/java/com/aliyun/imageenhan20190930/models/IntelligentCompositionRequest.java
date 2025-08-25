// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class IntelligentCompositionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/IntelligentComposition/IntelligentComposition3.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/IntelligentComposition/IntelligentComposition3.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("NumBoxes")
    public Integer numBoxes;

    public static IntelligentCompositionRequest build(java.util.Map<String, ?> map) throws Exception {
        IntelligentCompositionRequest self = new IntelligentCompositionRequest();
        return TeaModel.build(map, self);
    }

    public IntelligentCompositionRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public IntelligentCompositionRequest setNumBoxes(Integer numBoxes) {
        this.numBoxes = numBoxes;
        return this;
    }
    public Integer getNumBoxes() {
        return this.numBoxes;
    }

}
