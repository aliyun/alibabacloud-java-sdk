// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopDIJobRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated and is replaced by the Id parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>11668</p>
     */
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>11668</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
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
