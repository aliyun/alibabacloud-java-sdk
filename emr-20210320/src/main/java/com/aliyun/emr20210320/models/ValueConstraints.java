// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ValueConstraints extends TeaModel {
    /**
     * <p>默认值。</p>
     */
    @NameInMap("DefaultValue")
    public Integer defaultValue;

    /**
     * <p>结束值。</p>
     */
    @NameInMap("End")
    public Integer end;

    /**
     * <p>起始值。</p>
     */
    @NameInMap("Start")
    public Integer start;

    /**
     * <p>步长。</p>
     */
    @NameInMap("Step")
    public Integer step;

    /**
     * <p>值限制类型。</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>枚举值。</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Values")
    public java.util.List<Integer> values;

    public static ValueConstraints build(java.util.Map<String, ?> map) throws Exception {
        ValueConstraints self = new ValueConstraints();
        return TeaModel.build(map, self);
    }

    public ValueConstraints setDefaultValue(Integer defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public Integer getDefaultValue() {
        return this.defaultValue;
    }

    public ValueConstraints setEnd(Integer end) {
        this.end = end;
        return this;
    }
    public Integer getEnd() {
        return this.end;
    }

    public ValueConstraints setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public ValueConstraints setStep(Integer step) {
        this.step = step;
        return this;
    }
    public Integer getStep() {
        return this.step;
    }

    public ValueConstraints setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ValueConstraints setValues(java.util.List<Integer> values) {
        this.values = values;
        return this;
    }
    public java.util.List<Integer> getValues() {
        return this.values;
    }

}
