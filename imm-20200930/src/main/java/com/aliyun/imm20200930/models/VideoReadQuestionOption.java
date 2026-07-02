// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoReadQuestionOption extends TeaModel {
    /**
     * <p>The number of keywords. Valid values: 0 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>Specifies whether to fetch.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
