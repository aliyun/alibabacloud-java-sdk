// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetIntervalLimitOfSLARequest extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetIntervalLimitOfSLARequest build(java.util.Map<String, ?> map) throws Exception {
        GetIntervalLimitOfSLARequest self = new GetIntervalLimitOfSLARequest();
        return TeaModel.build(map, self);
    }

    public GetIntervalLimitOfSLARequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public GetIntervalLimitOfSLARequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
