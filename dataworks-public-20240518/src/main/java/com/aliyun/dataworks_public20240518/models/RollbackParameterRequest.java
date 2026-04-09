// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RollbackParameterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RollbackVersion")
    public Integer rollbackVersion;

    public static RollbackParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackParameterRequest self = new RollbackParameterRequest();
        return TeaModel.build(map, self);
    }

    public RollbackParameterRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RollbackParameterRequest setRollbackVersion(Integer rollbackVersion) {
        this.rollbackVersion = rollbackVersion;
        return this;
    }
    public Integer getRollbackVersion() {
        return this.rollbackVersion;
    }

}
