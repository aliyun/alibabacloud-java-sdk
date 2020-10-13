// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateDynamicImageAdvanceRequest extends TeaModel {
    @NameInMap("UrlObject")
    @Validation(required = true)
    public java.io.InputStream urlObject;

    @NameInMap("Operation")
    @Validation(required = true)
    public String operation;

    public static GenerateDynamicImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDynamicImageAdvanceRequest self = new GenerateDynamicImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDynamicImageAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

    public GenerateDynamicImageAdvanceRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

}
