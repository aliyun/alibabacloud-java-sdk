// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoReadKeywordOption extends TeaModel {
    /**
     * <p>Specifies the maximum number of keywords to return. The service may return fewer keywords than this limit. If omitted, the service returns all extracted keywords.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>Specifies whether to extract keywords from the video. Set to <code>true</code> to enable keyword extraction. The default is <code>false</code>.</p>
     */
    @NameInMap("Extract")
    public Boolean extract;

    public static VideoReadKeywordOption build(java.util.Map<String, ?> map) throws Exception {
        VideoReadKeywordOption self = new VideoReadKeywordOption();
        return TeaModel.build(map, self);
    }

    public VideoReadKeywordOption setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public VideoReadKeywordOption setExtract(Boolean extract) {
        this.extract = extract;
        return this;
    }
    public Boolean getExtract() {
        return this.extract;
    }

}
