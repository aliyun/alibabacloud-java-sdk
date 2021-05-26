// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateCaseTicketRequest extends TeaModel {
    @NameInMap("Title")
    public String title;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("Value")
    public String value;

    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("MemberName")
    public String memberName;

    @NameInMap("From")
    public String from;

    public static CreateCaseTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCaseTicketRequest self = new CreateCaseTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateCaseTicketRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateCaseTicketRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CreateCaseTicketRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public CreateCaseTicketRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public CreateCaseTicketRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public CreateCaseTicketRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}
