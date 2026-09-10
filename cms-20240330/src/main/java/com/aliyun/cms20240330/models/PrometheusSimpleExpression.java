// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PrometheusSimpleExpression extends TeaModel {
    /**
     * <p>The comparison operator. Valid values: GT (greater than), GE (greater than or equal to), LT (less than), LE (less than or equal to), EQ (equal to), and NE (not equal to).</p>
     * 
     * <strong>example:</strong>
     * <p>GT</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The referenced query name, corresponding to QueryConfigUnified.queries[].name.</p>
     * 
     * <strong>example:</strong>
     * <p>cpuQuery</p>
     */
    @NameInMap("queryName")
    public String queryName;

    /**
     * <p>The comparison threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("threshold")
    public Double threshold;

    public static PrometheusSimpleExpression build(java.util.Map<String, ?> map) throws Exception {
        PrometheusSimpleExpression self = new PrometheusSimpleExpression();
        return TeaModel.build(map, self);
    }

    public PrometheusSimpleExpression setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public PrometheusSimpleExpression setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public PrometheusSimpleExpression setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

}
