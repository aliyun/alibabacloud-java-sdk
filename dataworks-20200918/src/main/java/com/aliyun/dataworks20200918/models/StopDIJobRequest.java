// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class StopDIJobRequest extends TeaModel {
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public Long instanceId;

    public static StopDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDIJobRequest self = new StopDIJobRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public StopDIJobRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public StopDIJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public StopDIJobRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

}
