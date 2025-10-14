// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineCodeDeploymentShrinkRequest extends TeaModel {
    /**
     * <p>The configuration list of phased release version numbers. A maximum of two versions are supported, and the sum of the total proportions is equal to 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CodeVersions")
    public String codeVersionsShrink;

    /**
     * <p>The name of the environment. Only supports test environment <code>staging</code> or production environment <code>production</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>staging</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The function name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The deployment policy. Valid value: percentage.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>percentage</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    public static CreateRoutineCodeDeploymentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineCodeDeploymentShrinkRequest self = new CreateRoutineCodeDeploymentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoutineCodeDeploymentShrinkRequest setCodeVersionsShrink(String codeVersionsShrink) {
        this.codeVersionsShrink = codeVersionsShrink;
        return this;
    }
    public String getCodeVersionsShrink() {
        return this.codeVersionsShrink;
    }

    public CreateRoutineCodeDeploymentShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public CreateRoutineCodeDeploymentShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRoutineCodeDeploymentShrinkRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

}
