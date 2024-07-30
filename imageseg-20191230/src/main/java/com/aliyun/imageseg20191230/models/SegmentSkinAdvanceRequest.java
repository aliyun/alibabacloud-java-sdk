// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkinAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/SegmentSkin/SegmentSkin2.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/SegmentSkin/SegmentSkin2.jpg</a></p>
     */
    @NameInMap("URL")
    public java.io.InputStream URLObject;

    public static SegmentSkinAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkinAdvanceRequest self = new SegmentSkinAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentSkinAdvanceRequest setURLObject(java.io.InputStream URLObject) {
        this.URLObject = URLObject;
        return this;
    }
    public java.io.InputStream getURLObject() {
        return this.URLObject;
    }

}
