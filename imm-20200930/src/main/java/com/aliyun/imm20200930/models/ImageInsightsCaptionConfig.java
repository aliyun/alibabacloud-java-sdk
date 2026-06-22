// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ImageInsightsCaptionConfig extends TeaModel {
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Prompt")
    public String prompt;

    public static ImageInsightsCaptionConfig build(java.util.Map<String, ?> map) throws Exception {
        ImageInsightsCaptionConfig self = new ImageInsightsCaptionConfig();
        return TeaModel.build(map, self);
    }

    public ImageInsightsCaptionConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ImageInsightsCaptionConfig setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
