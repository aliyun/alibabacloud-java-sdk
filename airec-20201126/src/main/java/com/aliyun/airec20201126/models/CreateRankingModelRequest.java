// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateRankingModelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateRankingModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRankingModelRequest self = new CreateRankingModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateRankingModelRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
