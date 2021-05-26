// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateMemberRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("OuterMemberId")
    public String outerMemberId;

    @NameInMap("OuterMemberName")
    public String outerMemberName;

    @NameInMap("SourceId")
    public String sourceId;

    public static CreateMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberRequest self = new CreateMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemberRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public CreateMemberRequest setOuterMemberId(String outerMemberId) {
        this.outerMemberId = outerMemberId;
        return this;
    }
    public String getOuterMemberId() {
        return this.outerMemberId;
    }

    public CreateMemberRequest setOuterMemberName(String outerMemberName) {
        this.outerMemberName = outerMemberName;
        return this;
    }
    public String getOuterMemberName() {
        return this.outerMemberName;
    }

    public CreateMemberRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

}
