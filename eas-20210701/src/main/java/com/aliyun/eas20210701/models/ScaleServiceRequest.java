// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ScaleServiceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Instance")
    public Long instance;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("InstancesToDelete")
    public java.util.List<String> instancesToDelete;

    public static ScaleServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleServiceRequest self = new ScaleServiceRequest();
        return TeaModel.build(map, self);
    }

    public ScaleServiceRequest setInstance(Long instance) {
        this.instance = instance;
        return this;
    }
    public Long getInstance() {
        return this.instance;
    }

    public ScaleServiceRequest setInstancesToDelete(java.util.List<String> instancesToDelete) {
        this.instancesToDelete = instancesToDelete;
        return this;
    }
    public java.util.List<String> getInstancesToDelete() {
        return this.instancesToDelete;
    }

}
