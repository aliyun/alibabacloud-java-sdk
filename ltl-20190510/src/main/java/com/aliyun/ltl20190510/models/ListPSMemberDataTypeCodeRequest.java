// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListPSMemberDataTypeCodeRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("MemberUid")
    public String memberUid;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("Size")
    public Integer size;

    public static ListPSMemberDataTypeCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPSMemberDataTypeCodeRequest self = new ListPSMemberDataTypeCodeRequest();
        return TeaModel.build(map, self);
    }

    public ListPSMemberDataTypeCodeRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ListPSMemberDataTypeCodeRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public ListPSMemberDataTypeCodeRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public ListPSMemberDataTypeCodeRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ListPSMemberDataTypeCodeRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
