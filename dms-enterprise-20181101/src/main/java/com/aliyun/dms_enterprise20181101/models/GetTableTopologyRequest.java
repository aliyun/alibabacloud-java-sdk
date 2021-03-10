// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableTopologyRequest extends TeaModel {
    @NameInMap("TableGuid")
    public String tableGuid;

    @NameInMap("Tid")
    public Long tid;

    public static GetTableTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableTopologyRequest self = new GetTableTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetTableTopologyRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetTableTopologyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
