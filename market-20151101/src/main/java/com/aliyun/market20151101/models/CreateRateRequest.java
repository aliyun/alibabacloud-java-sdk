// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class CreateRateRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Score")
    public String score;

    public static CreateRateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRateRequest self = new CreateRateRequest();
        return TeaModel.build(map, self);
    }

    public CreateRateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateRateRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateRateRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRateRequest setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

}
