// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeImageStyleAdvanceRequest extends TeaModel {
    @NameInMap("UrlObject")
    @Validation(required = true)
    public java.io.InputStream urlObject;

    public static RecognizeImageStyleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageStyleAdvanceRequest self = new RecognizeImageStyleAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeImageStyleAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

}
