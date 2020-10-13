// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class IntelligentCompositionRequest extends TeaModel {
    @NameInMap("NumBoxes")
    public Integer numBoxes;

    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static IntelligentCompositionRequest build(java.util.Map<String, ?> map) throws Exception {
        IntelligentCompositionRequest self = new IntelligentCompositionRequest();
        return TeaModel.build(map, self);
    }

    public IntelligentCompositionRequest setNumBoxes(Integer numBoxes) {
        this.numBoxes = numBoxes;
        return this;
    }
    public Integer getNumBoxes() {
        return this.numBoxes;
    }

    public IntelligentCompositionRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
