// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateDynamicImageRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("Operation")
    public String operation;

    public static GenerateDynamicImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDynamicImageRequest self = new GenerateDynamicImageRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDynamicImageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public GenerateDynamicImageRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

}
