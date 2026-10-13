// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecMetaProfilingSkillJobDisableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>290</p>
     */
    @NameInMap("dsId")
    public Long dsId;

    public static ExecMetaProfilingSkillJobDisableRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecMetaProfilingSkillJobDisableRequest self = new ExecMetaProfilingSkillJobDisableRequest();
        return TeaModel.build(map, self);
    }

    public ExecMetaProfilingSkillJobDisableRequest setDsId(Long dsId) {
        this.dsId = dsId;
        return this;
    }
    public Long getDsId() {
        return this.dsId;
    }

}
