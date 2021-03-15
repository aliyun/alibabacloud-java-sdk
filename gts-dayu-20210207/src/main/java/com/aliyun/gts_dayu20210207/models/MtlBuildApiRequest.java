// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210207.models;

import com.aliyun.tea.*;

public class MtlBuildApiRequest extends TeaModel {
    // pipelineId
    @NameInMap("pipelineId")
    public Long pipelineId;

    // empId
    @NameInMap("empId")
    public byte[] empId;

    public static MtlBuildApiRequest build(java.util.Map<String, ?> map) throws Exception {
        MtlBuildApiRequest self = new MtlBuildApiRequest();
        return TeaModel.build(map, self);
    }

    public MtlBuildApiRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public MtlBuildApiRequest setEmpId(byte[] empId) {
        this.empId = empId;
        return this;
    }
    public byte[] getEmpId() {
        return this.empId;
    }

}
