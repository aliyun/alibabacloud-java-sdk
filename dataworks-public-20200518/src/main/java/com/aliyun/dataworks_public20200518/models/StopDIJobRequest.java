// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StopDIJobRequest extends TeaModel {
    @NameInMap("DIJobId")
    public Long DIJobId;

    public static StopDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDIJobRequest self = new StopDIJobRequest();
        return TeaModel.build(map, self);
    }

    public StopDIJobRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

}
