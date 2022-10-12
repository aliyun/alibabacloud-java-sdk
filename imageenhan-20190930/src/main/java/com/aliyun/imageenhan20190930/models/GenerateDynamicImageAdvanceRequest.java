// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateDynamicImageAdvanceRequest extends TeaModel {
    @NameInMap("Operation")
    public String operation;

    @NameInMap("Url")
    public java.io.InputStream urlObject;

    public static GenerateDynamicImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDynamicImageAdvanceRequest self = new GenerateDynamicImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDynamicImageAdvanceRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public GenerateDynamicImageAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

}
