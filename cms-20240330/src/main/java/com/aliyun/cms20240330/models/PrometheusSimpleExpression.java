// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PrometheusSimpleExpression extends TeaModel {
    @NameInMap("operator")
    public String operator;

    @NameInMap("queryName")
    public String queryName;

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
