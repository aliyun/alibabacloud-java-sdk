// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDBTopologyRequest extends TeaModel {
    @NameInMap("LogicDbId")
    public Long logicDbId;

    @NameInMap("Tid")
    public Long tid;

    public static GetDBTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDBTopologyRequest self = new GetDBTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetDBTopologyRequest setLogicDbId(Long logicDbId) {
        this.logicDbId = logicDbId;
        return this;
    }
    public Long getLogicDbId() {
        return this.logicDbId;
    }

    public GetDBTopologyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
