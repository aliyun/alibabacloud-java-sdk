// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddMemberRequest extends TeaModel {
    @NameInMap("AuthorizedCount")
    public Long authorizedCount;

    @NameInMap("Contactor")
    public String contactor;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Telephony")
    public String telephony;

    @NameInMap("Uid")
    public String uid;

    public static AddMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMemberRequest self = new AddMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddMemberRequest setAuthorizedCount(Long authorizedCount) {
        this.authorizedCount = authorizedCount;
        return this;
    }
    public Long getAuthorizedCount() {
        return this.authorizedCount;
    }

    public AddMemberRequest setContactor(String contactor) {
        this.contactor = contactor;
        return this;
    }
    public String getContactor() {
        return this.contactor;
    }

    public AddMemberRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMemberRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddMemberRequest setTelephony(String telephony) {
        this.telephony = telephony;
        return this;
    }
    public String getTelephony() {
        return this.telephony;
    }

    public AddMemberRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
