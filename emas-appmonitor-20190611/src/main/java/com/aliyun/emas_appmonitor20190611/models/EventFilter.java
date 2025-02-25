// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class EventFilter extends TeaModel {
    @NameInMap("Key")
    public String key;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Op")
    public String op;

    @NameInMap("SubFilters")
    public java.util.List<EventFilter> subFilters;

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
