// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ImageInsightsCaptionConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable this feature.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>Provide a concise title for this monitoring section, capturing the core subject and key event. Keep the title within 10 characters.</p>
     */
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
