// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitImageCopyrightRequest extends TeaModel {
    // 需要加水印的图片oss地址
    @NameInMap("Input")
    public String input;

    // 水印强度
    @NameInMap("Level")
    public Long level;

    // 水印信息
    @NameInMap("Message")
    public String message;

    // 水印图片输出oss地址
    @NameInMap("Output")
    public String output;

    public static SubmitImageCopyrightRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageCopyrightRequest self = new SubmitImageCopyrightRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImageCopyrightRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
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

}
