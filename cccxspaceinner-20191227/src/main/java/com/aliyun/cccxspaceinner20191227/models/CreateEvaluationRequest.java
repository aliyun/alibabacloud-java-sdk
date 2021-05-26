// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateEvaluationRequest extends TeaModel {
    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("TicketId")
    public Long ticketId;

    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("From")
    public String from;

    @NameInMap("PortalName")
    public String portalName;

    @NameInMap("Operation")
    public String operation;

    public static CreateEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluationRequest self = new CreateEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvaluationRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public CreateEvaluationRequest setTicketId(Long ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public Long getTicketId() {
        return this.ticketId;
    }

    public CreateEvaluationRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateEvaluationRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public CreateEvaluationRequest setPortalName(String portalName) {
        this.portalName = portalName;
        return this;
    }
    public String getPortalName() {
        return this.portalName;
    }

    public CreateEvaluationRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

}
