// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateMemoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("longTtl")
    public Integer longTtl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-memory</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("shortTtl")
    public Integer shortTtl;

    /**
     * <strong>example:</strong>
     * <p>[&quot;Preference&quot;, &quot;Facts&quot;]</p>
     */
    @NameInMap("strategy")
    public java.util.List<String> strategy;

    public static CreateMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryRequest self = new CreateMemoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryRequest setLongTtl(Integer longTtl) {
        this.longTtl = longTtl;
        return this;
    }
    public Integer getLongTtl() {
        return this.longTtl;
    }

    public CreateMemoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMemoryRequest setShortTtl(Integer shortTtl) {
        this.shortTtl = shortTtl;
        return this;
    }
    public Integer getShortTtl() {
        return this.shortTtl;
    }

    public CreateMemoryRequest setStrategy(java.util.List<String> strategy) {
        this.strategy = strategy;
        return this;
    }
    public java.util.List<String> getStrategy() {
        return this.strategy;
    }

}
