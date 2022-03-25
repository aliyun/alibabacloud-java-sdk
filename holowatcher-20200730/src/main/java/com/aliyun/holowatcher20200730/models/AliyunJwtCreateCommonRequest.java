// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AliyunJwtCreateCommonRequest extends TeaModel {
    @NameInMap("AliyunAccountName")
    public String aliyunAccountName;

    @NameInMap("AliyunUid")
    public String aliyunUid;

    @NameInMap("AliyunUidType")
    public String aliyunUidType;

    @NameInMap("ParentUid")
    public String parentUid;

    @NameInMap("Ticket")
    public String ticket;

    public static AliyunJwtCreateCommonRequest build(java.util.Map<String, ?> map) throws Exception {
        AliyunJwtCreateCommonRequest self = new AliyunJwtCreateCommonRequest();
        return TeaModel.build(map, self);
    }

    public AliyunJwtCreateCommonRequest setAliyunAccountName(String aliyunAccountName) {
        this.aliyunAccountName = aliyunAccountName;
        return this;
    }
    public String getAliyunAccountName() {
        return this.aliyunAccountName;
    }

    public AliyunJwtCreateCommonRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public AliyunJwtCreateCommonRequest setAliyunUidType(String aliyunUidType) {
        this.aliyunUidType = aliyunUidType;
        return this;
    }
    public String getAliyunUidType() {
        return this.aliyunUidType;
    }

    public AliyunJwtCreateCommonRequest setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
    }

    public AliyunJwtCreateCommonRequest setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
