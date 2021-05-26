// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class StartEvaluationRateRequest extends TeaModel {
    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("TicketId")
    public Long ticketId;

    @NameInMap("SceneId")
    public Long sceneId;

    public static StartEvaluationRateRequest build(java.util.Map<String, ?> map) throws Exception {
        StartEvaluationRateRequest self = new StartEvaluationRateRequest();
        return TeaModel.build(map, self);
    }

    public StartEvaluationRateRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public StartEvaluationRateRequest setTicketId(Long ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public Long getTicketId() {
        return this.ticketId;
    }

    public StartEvaluationRateRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
