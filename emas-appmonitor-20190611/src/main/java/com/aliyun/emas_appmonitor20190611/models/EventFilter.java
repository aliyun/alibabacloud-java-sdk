// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class EventFilter extends TeaModel {
    /**
     * <p>key</p>
     * 
     * <strong>example:</strong>
     * <p>startTime</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>op</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <blockquote>
     * </blockquote>
     */
    @NameInMap("Op")
    public String op;

    /**
     * <p>filters</p>
     */
    @NameInMap("SubFilters")
    public java.util.List<EventFilter> subFilters;

    /**
     * <p>values</p>
     */
    @NameInMap("Values")
    public java.util.List<String> values;

    public static EventFilter build(java.util.Map<String, ?> map) throws Exception {
        EventFilter self = new EventFilter();
        return TeaModel.build(map, self);
    }

    public EventFilter setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public EventFilter setOp(String op) {
        this.op = op;
        return this;
    }
    public String getOp() {
        return this.op;
    }

    public EventFilter setSubFilters(java.util.List<EventFilter> subFilters) {
        this.subFilters = subFilters;
        return this;
    }
    public java.util.List<EventFilter> getSubFilters() {
        return this.subFilters;
    }

    public EventFilter setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
