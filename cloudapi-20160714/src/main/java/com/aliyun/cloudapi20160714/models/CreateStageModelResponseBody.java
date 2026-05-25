// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateStageModelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EF924FE4-2EDD-4CD3-89EC-34E4708xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>39sdfjsd8fudsfxxx</p>
     */
    @NameInMap("StageModelId")
    public String stageModelId;

    public static CreateStageModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStageModelResponseBody self = new CreateStageModelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStageModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStageModelResponseBody setStageModelId(String stageModelId) {
        this.stageModelId = stageModelId;
        return this;
    }
    public String getStageModelId() {
        return this.stageModelId;
    }

}
