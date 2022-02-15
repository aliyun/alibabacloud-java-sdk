// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GeneratePictureLinkRequest extends TeaModel {
    // keys
    @NameInMap("keys")
    public java.util.List<String> keys;

    // 故障id
    @NameInMap("problemId")
    public Long problemId;

    public static GeneratePictureLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GeneratePictureLinkRequest self = new GeneratePictureLinkRequest();
        return TeaModel.build(map, self);
    }

    public GeneratePictureLinkRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public GeneratePictureLinkRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
