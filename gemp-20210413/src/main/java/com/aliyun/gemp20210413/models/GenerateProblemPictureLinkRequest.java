// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GenerateProblemPictureLinkRequest extends TeaModel {
    /**
     * <p>oss key</p>
     */
    @NameInMap("keys")
    public java.util.List<String> keys;

    /**
     * <strong>example:</strong>
     * <p>50002021</p>
     */
    @NameInMap("problemId")
    public String problemId;

    public static GenerateProblemPictureLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateProblemPictureLinkRequest self = new GenerateProblemPictureLinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateProblemPictureLinkRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public GenerateProblemPictureLinkRequest setProblemId(String problemId) {
        this.problemId = problemId;
        return this;
    }
    public String getProblemId() {
        return this.problemId;
    }

}
