// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ExtendImageStyleAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/ExtendImageStyle/ExtendImageStyle1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/ExtendImageStyle/ExtendImageStyle1.jpg</a></p>
     */
    @NameInMap("MajorUrl")
    public java.io.InputStream majorUrlObject;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/ExtendImageStyle/ExtendImageStyle6.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/ExtendImageStyle/ExtendImageStyle6.jpg</a></p>
     */
    @NameInMap("StyleUrl")
    public java.io.InputStream styleUrlObject;

    public static ExtendImageStyleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtendImageStyleAdvanceRequest self = new ExtendImageStyleAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ExtendImageStyleAdvanceRequest setMajorUrlObject(java.io.InputStream majorUrlObject) {
        this.majorUrlObject = majorUrlObject;
        return this;
    }
    public java.io.InputStream getMajorUrlObject() {
        return this.majorUrlObject;
    }

    public ExtendImageStyleAdvanceRequest setStyleUrlObject(java.io.InputStream styleUrlObject) {
        this.styleUrlObject = styleUrlObject;
        return this;
    }
    public java.io.InputStream getStyleUrlObject() {
        return this.styleUrlObject;
    }

}
