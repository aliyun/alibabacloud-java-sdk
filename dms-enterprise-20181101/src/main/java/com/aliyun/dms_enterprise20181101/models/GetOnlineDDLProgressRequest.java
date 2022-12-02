// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOnlineDDLProgressRequest extends TeaModel {
    @NameInMap("JobDetailId")
    public Long jobDetailId;

    @NameInMap("Tid")
    public Long tid;

    public static GetOnlineDDLProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineDDLProgressRequest self = new GetOnlineDDLProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetOnlineDDLProgressRequest setJobDetailId(Long jobDetailId) {
        this.jobDetailId = jobDetailId;
        return this;
    }
    public Long getJobDetailId() {
        return this.jobDetailId;
    }

    public GetOnlineDDLProgressRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
