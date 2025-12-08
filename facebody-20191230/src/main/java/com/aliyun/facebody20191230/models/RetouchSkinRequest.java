// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RetouchSkinRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/RetouchSkin/RetouchSkin3.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/RetouchSkin/RetouchSkin3.png</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("RetouchDegree")
    public Float retouchDegree;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("WhiteningDegree")
    public Float whiteningDegree;

    public static RetouchSkinRequest build(java.util.Map<String, ?> map) throws Exception {
        RetouchSkinRequest self = new RetouchSkinRequest();
        return TeaModel.build(map, self);
    }

    public RetouchSkinRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RetouchSkinRequest setRetouchDegree(Float retouchDegree) {
        this.retouchDegree = retouchDegree;
        return this;
    }
    public Float getRetouchDegree() {
        return this.retouchDegree;
    }

    public RetouchSkinRequest setWhiteningDegree(Float whiteningDegree) {
        this.whiteningDegree = whiteningDegree;
        return this;
    }
    public Float getWhiteningDegree() {
        return this.whiteningDegree;
    }

}
