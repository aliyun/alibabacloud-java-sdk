// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetChatQuestionRespRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1869307330227937280</p>
     */
    @NameInMap("batchId")
    public String batchId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>237645726354</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static GetChatQuestionRespRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatQuestionRespRequest self = new GetChatQuestionRespRequest();
        return TeaModel.build(map, self);
    }

    public GetChatQuestionRespRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public GetChatQuestionRespRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
