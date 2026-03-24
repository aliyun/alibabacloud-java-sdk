// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class TransformAction extends TeaModel {
    /**
     * <p>筛选配置</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>标签名</p>
     * 
     * <strong>example:</strong>
     * <p>labelkey1</p>
     */
    @NameInMap("labelKey")
    public String labelKey;

    /**
     * <p>Mapping配置。</p>
     */
    @NameInMap("mapping")
    public java.util.Map<String, String> mapping;

    /**
     * <p>正则表达式</p>
     * 
     * <strong>example:</strong>
     * <p>(.<em>):(.</em>)</p>
     */
    @NameInMap("regExp")
    public String regExp;

    /**
     * <p>引用路径</p>
     * 
     * <strong>example:</strong>
     * <p>data.subject</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>目标位置</p>
     * 
     * <strong>example:</strong>
     * <p>SUBJECT</p>
     */
    @NameInMap("target")
    public String target;

    /**
     * <p>转换类型</p>
     * 
     * <strong>example:</strong>
     * <p>SET_FIELD</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>设置的值</p>
     * 
     * <strong>example:</strong>
     * <p>value1</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <p>变量名</p>
     * 
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
