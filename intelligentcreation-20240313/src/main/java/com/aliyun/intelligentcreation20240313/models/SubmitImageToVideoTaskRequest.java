// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SubmitImageToVideoTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://xxx/image.png">http://xxx/image.png</a></p>
     */
    @NameInMap("imageUrl")
    public String imageUrl;

    @NameInMap("posPrompt")
    public String posPrompt;

    public static SubmitImageToVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageToVideoTaskRequest self = new SubmitImageToVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImageToVideoTaskRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SubmitImageToVideoTaskRequest setPosPrompt(String posPrompt) {
        this.posPrompt = posPrompt;
        return this;
    }
    public String getPosPrompt() {
        return this.posPrompt;
    }

}
