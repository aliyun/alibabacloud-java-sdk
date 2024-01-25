// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteResourceWhitelistRequest extends TeaModel {
    @NameInMap("InspectionWhitelistId")
    public Long inspectionWhitelistId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DeleteResourceWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceWhitelistRequest self = new DeleteResourceWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceWhitelistRequest setInspectionWhitelistId(Long inspectionWhitelistId) {
        this.inspectionWhitelistId = inspectionWhitelistId;
        return this;
    }
    public Long getInspectionWhitelistId() {
        return this.inspectionWhitelistId;
    }

    public DeleteResourceWhitelistRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
