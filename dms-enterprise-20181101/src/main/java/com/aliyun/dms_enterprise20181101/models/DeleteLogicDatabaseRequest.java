// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLogicDatabaseRequest extends TeaModel {
    @NameInMap("LogicDbId")
    public Long logicDbId;

    @NameInMap("Tid")
    public Long tid;

    public static DeleteLogicDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogicDatabaseRequest self = new DeleteLogicDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogicDatabaseRequest setLogicDbId(Long logicDbId) {
        this.logicDbId = logicDbId;
        return this;
    }
    public Long getLogicDbId() {
        return this.logicDbId;
    }

    public DeleteLogicDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
