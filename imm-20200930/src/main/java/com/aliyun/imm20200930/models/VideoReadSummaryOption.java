// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoReadSummaryOption extends TeaModel {
    @NameInMap("Summarize")
    public Boolean summarize;

    public static VideoReadSummaryOption build(java.util.Map<String, ?> map) throws Exception {
        VideoReadSummaryOption self = new VideoReadSummaryOption();
        return TeaModel.build(map, self);
    }

    public VideoReadSummaryOption setSummarize(Boolean summarize) {
        this.summarize = summarize;
        return this;
    }
    public Boolean getSummarize() {
        return this.summarize;
    }

}
