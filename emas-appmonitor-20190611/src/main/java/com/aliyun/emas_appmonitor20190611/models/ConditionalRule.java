// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class ConditionalRule extends TeaModel {
    @NameInMap("Filter")
    public EventFilter filter;

    /**
     * <strong>example:</strong>
     * <p>1205-02-01 12:00:00</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SampleRate")
    public Float sampleRate;

    public static ConditionalRule build(java.util.Map<String, ?> map) throws Exception {
        ConditionalRule self = new ConditionalRule();
        return TeaModel.build(map, self);
    }

    public ConditionalRule setFilter(EventFilter filter) {
        this.filter = filter;
        return this;
    }
    public EventFilter getFilter() {
        return this.filter;
    }

    public ConditionalRule setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public ConditionalRule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConditionalRule setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ConditionalRule setSampleRate(Float sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Float getSampleRate() {
        return this.sampleRate;
    }

}
