// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeIntentRequest extends TeaModel {
    @NameInMap("IntentId")
    public Long intentId;

    public static DescribeIntentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntentRequest self = new DescribeIntentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIntentRequest setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

}
