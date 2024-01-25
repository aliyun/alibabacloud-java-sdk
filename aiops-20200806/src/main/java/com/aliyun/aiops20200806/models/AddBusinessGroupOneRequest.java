// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddBusinessGroupOneRequest extends TeaModel {
    @NameInMap("BusinessGroupDesc")
    public String businessGroupDesc;

    @NameInMap("BusinessGroupName")
    public String businessGroupName;

    @NameInMap("OperaUid")
    public String operaUid;

    public static AddBusinessGroupOneRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBusinessGroupOneRequest self = new AddBusinessGroupOneRequest();
        return TeaModel.build(map, self);
    }

    public AddBusinessGroupOneRequest setBusinessGroupDesc(String businessGroupDesc) {
        this.businessGroupDesc = businessGroupDesc;
        return this;
    }
    public String getBusinessGroupDesc() {
        return this.businessGroupDesc;
    }

    public AddBusinessGroupOneRequest setBusinessGroupName(String businessGroupName) {
        this.businessGroupName = businessGroupName;
        return this;
    }
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    public AddBusinessGroupOneRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
