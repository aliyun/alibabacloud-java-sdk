// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class StreamOptions extends TeaModel {
    @NameInMap("IncrementalOutput")
    public Boolean incrementalOutput;

    public static StreamOptions build(java.util.Map<String, ?> map) throws Exception {
        StreamOptions self = new StreamOptions();
        return TeaModel.build(map, self);
    }

    public StreamOptions setIncrementalOutput(Boolean incrementalOutput) {
        this.incrementalOutput = incrementalOutput;
        return this;
    }
    public Boolean getIncrementalOutput() {
        return this.incrementalOutput;
    }

}
