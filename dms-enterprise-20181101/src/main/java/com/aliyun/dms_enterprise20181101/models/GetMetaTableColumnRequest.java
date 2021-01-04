// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableColumnRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("TableGuid")
    public String tableGuid;

    public static GetMetaTableColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableColumnRequest self = new GetMetaTableColumnRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableColumnRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public GetMetaTableColumnRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

}
