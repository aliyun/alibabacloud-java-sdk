// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PrometheusNamedQueryEntry extends TeaModel {
    /**
     * <p>The PromQL query expression.</p>
     * 
     * <strong>example:</strong>
     * <p>avg(cpu_usage) &gt; 80</p>
     */
    @NameInMap("expr")
    public String expr;

    /**
     * <p>The query name, such as $A or $B, referenced by the condition trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>cpuQuery</p>
     */
    @NameInMap("name")
    public String name;

    public static PrometheusNamedQueryEntry build(java.util.Map<String, ?> map) throws Exception {
        PrometheusNamedQueryEntry self = new PrometheusNamedQueryEntry();
        return TeaModel.build(map, self);
    }

    public PrometheusNamedQueryEntry setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public PrometheusNamedQueryEntry setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
