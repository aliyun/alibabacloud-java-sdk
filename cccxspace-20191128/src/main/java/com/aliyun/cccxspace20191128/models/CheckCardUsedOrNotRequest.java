// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CheckCardUsedOrNotRequest extends TeaModel {
    // 卡片id
    @NameInMap("CardId")
    public Long cardId;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    public static CheckCardUsedOrNotRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCardUsedOrNotRequest self = new CheckCardUsedOrNotRequest();
        return TeaModel.build(map, self);
    }

    public CheckCardUsedOrNotRequest setCardId(Long cardId) {
        this.cardId = cardId;
        return this;
    }
    public Long getCardId() {
        return this.cardId;
    }

    public CheckCardUsedOrNotRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
