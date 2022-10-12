// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ExtendImageStyleAdvanceRequest extends TeaModel {
    @NameInMap("MajorUrl")
    public java.io.InputStream majorUrlObject;

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
