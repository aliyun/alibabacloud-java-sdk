// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class EnhanceImageColorRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("OutputFormat")
    public String outputFormat;

    @NameInMap("Mode")
    public String mode;

    public static EnhanceImageColorRequest build(java.util.Map<String, ?> map) throws Exception {
        EnhanceImageColorRequest self = new EnhanceImageColorRequest();
        return TeaModel.build(map, self);
    }

    public EnhanceImageColorRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public EnhanceImageColorRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public EnhanceImageColorRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
