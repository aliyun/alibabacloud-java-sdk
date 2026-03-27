// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class TransformAction extends TeaModel {
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <strong>example:</strong>
     * <p>labelkey1</p>
     */
    @NameInMap("labelKey")
    public String labelKey;

    @NameInMap("mapping")
    public java.util.Map<String, String> mapping;

    /**
     * <strong>example:</strong>
     * <p>(.<em>):(.</em>)</p>
     */
    @NameInMap("regExp")
    public String regExp;

    /**
     * <strong>example:</strong>
     * <p>data.subject</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>SUBJECT</p>
     */
    @NameInMap("target")
    public String target;

    /**
     * <strong>example:</strong>
     * <p>SET_FIELD</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>value1</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <strong>example:</strong>
     * <p>var1</p>
     */
    @NameInMap("variable")
    public String variable;

    public static TransformAction build(java.util.Map<String, ?> map) throws Exception {
        TransformAction self = new TransformAction();
        return TeaModel.build(map, self);
    }

    public TransformAction setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public TransformAction setLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }
    public String getLabelKey() {
        return this.labelKey;
    }

    public TransformAction setMapping(java.util.Map<String, String> mapping) {
        this.mapping = mapping;
        return this;
    }
    public java.util.Map<String, String> getMapping() {
        return this.mapping;
    }

    public TransformAction setRegExp(String regExp) {
        this.regExp = regExp;
        return this;
    }
    public String getRegExp() {
        return this.regExp;
    }

    public TransformAction setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public TransformAction setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public TransformAction setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TransformAction setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public TransformAction setVariable(String variable) {
        this.variable = variable;
        return this;
    }
    public String getVariable() {
        return this.variable;
    }

}
