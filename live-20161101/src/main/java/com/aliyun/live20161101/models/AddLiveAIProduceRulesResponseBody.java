// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAIProduceRulesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0df228-4a64-af62-20e91b96****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the subtitle rule.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("RulesId")
    public String rulesId;

    public static AddLiveAIProduceRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAIProduceRulesResponseBody self = new AddLiveAIProduceRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveAIProduceRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLiveAIProduceRulesResponseBody setRulesId(String rulesId) {
        this.rulesId = rulesId;
        return this;
    }
    public String getRulesId() {
        return this.rulesId;
    }

}
