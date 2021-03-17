// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class EnhanceImageColorAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("OutputFormat")
    public String outputFormat;

    @NameInMap("Mode")
    public String mode;

    public static EnhanceImageColorAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnhanceImageColorAdvanceRequest self = new EnhanceImageColorAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EnhanceImageColorAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public EnhanceImageColorAdvanceRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public EnhanceImageColorAdvanceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
