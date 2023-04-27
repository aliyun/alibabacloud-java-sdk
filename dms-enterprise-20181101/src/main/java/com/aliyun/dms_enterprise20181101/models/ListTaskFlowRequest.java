// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowRequest extends TeaModel {
    /**
     * <p>The information about the task flows returned.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListTaskFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowRequest self = new ListTaskFlowRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
