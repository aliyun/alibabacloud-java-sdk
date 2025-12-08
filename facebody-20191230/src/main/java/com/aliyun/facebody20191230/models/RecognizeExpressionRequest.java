// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeExpressionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/RecognizeExpression/RecognizeExpression10.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/RecognizeExpression/RecognizeExpression10.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeExpressionRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExpressionRequest self = new RecognizeExpressionRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeExpressionRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
