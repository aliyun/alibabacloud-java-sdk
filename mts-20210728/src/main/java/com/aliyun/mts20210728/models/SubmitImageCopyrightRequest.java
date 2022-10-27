// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitImageCopyrightRequest extends TeaModel {
    @NameInMap("Level")
    public Long level;

    @NameInMap("Message")
    public String message;

    @NameInMap("Output")
    public String output;

    @NameInMap("Params")
    public String params;

    public static SubmitImageCopyrightRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageCopyrightRequest self = new SubmitImageCopyrightRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImageCopyrightRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public SubmitImageCopyrightRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitImageCopyrightRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitImageCopyrightRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
