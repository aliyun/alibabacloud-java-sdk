// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpChangeWarmupTypeRequest extends TeaModel {
    /**
     * <p>Dedicated IP ID</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Warmup method</p>
     * 
     * <strong>example:</strong>
     * <p>sysCusStream</p>
     */
    @NameInMap("WarmupType")
    public String warmupType;

    public static DedicatedIpChangeWarmupTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpChangeWarmupTypeRequest self = new DedicatedIpChangeWarmupTypeRequest();
        return TeaModel.build(map, self);
    }

    public DedicatedIpChangeWarmupTypeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DedicatedIpChangeWarmupTypeRequest setWarmupType(String warmupType) {
        this.warmupType = warmupType;
        return this;
    }
    public String getWarmupType() {
        return this.warmupType;
    }

}
