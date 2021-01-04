// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexInnerPolicyRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("EsnBizId")
    public Long esnBizId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupInnerPolicy")
    public Integer groupInnerPolicy;

    public static UpdateFlexInnerPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexInnerPolicyRequest self = new UpdateFlexInnerPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlexInnerPolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateFlexInnerPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateFlexInnerPolicyRequest setEsnBizId(Long esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public Long getEsnBizId() {
        return this.esnBizId;
    }

    public UpdateFlexInnerPolicyRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateFlexInnerPolicyRequest setGroupInnerPolicy(Integer groupInnerPolicy) {
        this.groupInnerPolicy = groupInnerPolicy;
        return this;
    }
    public Integer getGroupInnerPolicy() {
        return this.groupInnerPolicy;
    }

}
