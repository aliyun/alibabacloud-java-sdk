// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoReadPPTOption extends TeaModel {
    /**
     * <p>Specifies whether to fetch.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Extract")
    public Boolean extract;

    public static VideoReadPPTOption build(java.util.Map<String, ?> map) throws Exception {
        VideoReadPPTOption self = new VideoReadPPTOption();
        return TeaModel.build(map, self);
    }

    public VideoReadPPTOption setExtract(Boolean extract) {
        this.extract = extract;
        return this;
    }
    public Boolean getExtract() {
        return this.extract;
    }

}
