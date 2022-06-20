// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateDynamicImageRequest extends TeaModel {
    @NameInMap("Operation")
    public String operation;

    @NameInMap("Url")
    public String url;

    public static GenerateDynamicImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDynamicImageRequest self = new GenerateDynamicImageRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDynamicImageRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public GenerateDynamicImageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
