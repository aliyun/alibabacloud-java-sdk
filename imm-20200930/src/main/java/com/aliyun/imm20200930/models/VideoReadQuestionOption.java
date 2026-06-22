// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoReadQuestionOption extends TeaModel {
    /**
     * <p>Specifies the maximum number of answers to return when <code>Extract</code> is <code>true</code>. If omitted, the service returns all detected answers.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>Specifies whether to extract answer segments from the video. When <code>true</code>, the service identifies and returns these segments. The default is <code>false</code>.</p>
     */
    @NameInMap("Extract")
    public Boolean extract;

    public static VideoReadQuestionOption build(java.util.Map<String, ?> map) throws Exception {
        VideoReadQuestionOption self = new VideoReadQuestionOption();
        return TeaModel.build(map, self);
    }

    public VideoReadQuestionOption setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public VideoReadQuestionOption setExtract(Boolean extract) {
        this.extract = extract;
        return this;
    }
    public Boolean getExtract() {
        return this.extract;
    }

}
