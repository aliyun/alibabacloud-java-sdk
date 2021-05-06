// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteInstanceMembersRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MemberUids")
    public java.util.List<Integer> memberUids;

    public static DeleteInstanceMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceMembersRequest self = new DeleteInstanceMembersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceMembersRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteInstanceMembersRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteInstanceMembersRequest setMemberUids(java.util.List<Integer> memberUids) {
        this.memberUids = memberUids;
        return this;
    }
    public java.util.List<Integer> getMemberUids() {
        return this.memberUids;
    }

}
