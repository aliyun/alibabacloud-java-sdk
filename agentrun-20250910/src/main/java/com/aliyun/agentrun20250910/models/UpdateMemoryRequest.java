// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateMemoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("longTtl")
    public Integer longTtl;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("permanent")
    public Boolean permanent;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("shortTtl")
    public Integer shortTtl;

    @NameInMap("strategy")
    public java.util.List<String> strategy;

    public static UpdateMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryRequest self = new UpdateMemoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryRequest setLongTtl(Integer longTtl) {
        this.longTtl = longTtl;
        return this;
    }
    public Integer getLongTtl() {
        return this.longTtl;
    }

    public UpdateMemoryRequest setPermanent(Boolean permanent) {
        this.permanent = permanent;
        return this;
    }
    public Boolean getPermanent() {
        return this.permanent;
    }

    public UpdateMemoryRequest setShortTtl(Integer shortTtl) {
        this.shortTtl = shortTtl;
        return this;
    }
    public Integer getShortTtl() {
        return this.shortTtl;
    }

    public UpdateMemoryRequest setStrategy(java.util.List<String> strategy) {
        this.strategy = strategy;
        return this;
    }
    public java.util.List<String> getStrategy() {
        return this.strategy;
    }

}
