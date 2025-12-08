// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class LiquifyFaceAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/LiquifyFace/LiquifyFace1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/LiquifyFace/LiquifyFace1.png</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("SlimDegree")
    public Float slimDegree;

    public static LiquifyFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        LiquifyFaceAdvanceRequest self = new LiquifyFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public LiquifyFaceAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public LiquifyFaceAdvanceRequest setSlimDegree(Float slimDegree) {
        this.slimDegree = slimDegree;
        return this;
    }
    public Float getSlimDegree() {
        return this.slimDegree;
    }

}
