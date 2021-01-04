// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDBTopologyRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("TableGuid")
    public String tableGuid;

    public static GetTableDBTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableDBTopologyRequest self = new GetTableDBTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetTableDBTopologyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public GetTableDBTopologyRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

}
