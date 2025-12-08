// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class PedestrianDetectAttributeAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/PedestrianDetectAttribute/PedestrianDetectAttribute1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/PedestrianDetectAttribute/PedestrianDetectAttribute1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static PedestrianDetectAttributeAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PedestrianDetectAttributeAdvanceRequest self = new PedestrianDetectAttributeAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public PedestrianDetectAttributeAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
