// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectImageElementsAdvanceRequest extends TeaModel {
    @NameInMap("UrlObject")
    @Validation(required = true)
    public java.io.InputStream urlObject;

    public static DetectImageElementsAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageElementsAdvanceRequest self = new DetectImageElementsAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageElementsAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

}
