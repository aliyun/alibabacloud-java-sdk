// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableDetailInfoRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("TableGuid")
    public String tableGuid;

    public static GetMetaTableDetailInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableDetailInfoRequest self = new GetMetaTableDetailInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableDetailInfoRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public GetMetaTableDetailInfoRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

}
