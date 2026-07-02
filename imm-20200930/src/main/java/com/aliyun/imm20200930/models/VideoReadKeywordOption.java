// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoReadKeywordOption extends TeaModel {
    /**
     * <p>The number of keywords. Valid values: 0 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>Specifies whether to fetch keywords.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
