// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateSceneRequest extends TeaModel {
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneRequest self = new CreateSceneRequest();
        return TeaModel.build(map, self);
    }

    public CreateSceneRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
