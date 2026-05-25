// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class Filter extends TeaModel {
    /**
     * <p>key</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>operator</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>subFillter</p>
     */
    @NameInMap("SubFilters")
    public java.util.List<Filter> subFilters;

    /**
     * <p>values</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("Values")
    public Object values;

    public static Filter build(java.util.Map<String, ?> map) throws Exception {
        Filter self = new Filter();
        return TeaModel.build(map, self);
    }

    public Filter setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Filter setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public Filter setSubFilters(java.util.List<Filter> subFilters) {
        this.subFilters = subFilters;
        return this;
    }
    public java.util.List<Filter> getSubFilters() {
        return this.subFilters;
    }

    public Filter setValues(Object values) {
        this.values = values;
        return this;
    }
    public Object getValues() {
        return this.values;
    }

}
