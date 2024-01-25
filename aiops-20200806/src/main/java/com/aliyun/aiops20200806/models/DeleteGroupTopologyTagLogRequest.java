// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteGroupTopologyTagLogRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DeleteGroupTopologyTagLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupTopologyTagLogRequest self = new DeleteGroupTopologyTagLogRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGroupTopologyTagLogRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public DeleteGroupTopologyTagLogRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
