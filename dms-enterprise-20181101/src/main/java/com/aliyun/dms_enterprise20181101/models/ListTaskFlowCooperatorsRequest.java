// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowCooperatorsRequest extends TeaModel {
    /**
     * <p>The username.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListTaskFlowCooperatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowCooperatorsRequest self = new ListTaskFlowCooperatorsRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowCooperatorsRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ListTaskFlowCooperatorsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
