// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDefaultSLARulesRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Tid")
    public Long tid;

    public static ListDefaultSLARulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultSLARulesRequest self = new ListDefaultSLARulesRequest();
        return TeaModel.build(map, self);
    }

    public ListDefaultSLARulesRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ListDefaultSLARulesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
