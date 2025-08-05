// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class BatchUpdateTableOwnerRequest extends TeaModel {
    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("TableGuids")
    public String tableGuids;

    public static BatchUpdateTableOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateTableOwnerRequest self = new BatchUpdateTableOwnerRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateTableOwnerRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public BatchUpdateTableOwnerRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public BatchUpdateTableOwnerRequest setTableGuids(String tableGuids) {
        this.tableGuids = tableGuids;
        return this;
    }
    public String getTableGuids() {
        return this.tableGuids;
    }

}
