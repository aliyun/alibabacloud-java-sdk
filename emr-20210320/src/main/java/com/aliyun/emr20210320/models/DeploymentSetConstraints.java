// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DeploymentSetConstraints extends TeaModel {
    /**
     * <p>默认值。</p>
     * 
     * <strong>example:</strong>
     * <p>CLUSTER</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    /**
     * <strong>example:</strong>
     * <p>是否启用部署集限制策略</p>
     */
    @NameInMap("EnableState")
    public String enableState;

    /**
     * <p>替换策略。</p>
     */
    @NameInMap("ReplacementStrategy")
    public ReplacementStrategy replacementStrategy;

    /**
     * <p>枚举值。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;CLUSTER&quot;,&quot;NODE_GROUP&quot;,&quot;NONE&quot;]</p>
     */
    @NameInMap("Values")
    public java.util.List<String> values;

    public static DeploymentSetConstraints build(java.util.Map<String, ?> map) throws Exception {
        DeploymentSetConstraints self = new DeploymentSetConstraints();
        return TeaModel.build(map, self);
    }

    public DeploymentSetConstraints setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public DeploymentSetConstraints setEnableState(String enableState) {
        this.enableState = enableState;
        return this;
    }
    public String getEnableState() {
        return this.enableState;
    }

    public DeploymentSetConstraints setReplacementStrategy(ReplacementStrategy replacementStrategy) {
        this.replacementStrategy = replacementStrategy;
        return this;
    }
    public ReplacementStrategy getReplacementStrategy() {
        return this.replacementStrategy;
    }

    public DeploymentSetConstraints setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
