// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineCodeDeploymentShrinkRequest extends TeaModel {
    /**
     * <p>The list of percentage-based canary release version configurations. A maximum of two versions are supported, and the total percentage must equal 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CodeVersions")
    public String codeVersionsShrink;

    /**
     * <p>The environment name.<br>Valid values:</p>
     * <ul>
     * <li><code>staging</code>: staging environment </li>
     * <li><code>production</code>: production environment</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>staging</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The name of the Edge Function Routine.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The deployment strategy.<br>Valid values:</p>
     * <ul>
     * <li><code>percentage</code>: percentage mode</li>
     * </ul>
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
