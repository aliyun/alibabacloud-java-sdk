// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineEnvironmentVariablesRequest extends TeaModel {
    /**
     * <p>The environment name.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>staging</code>: staging environment</li>
     * <li><code>production</code>: production environment</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The list of environment variable keys to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;LOG_LEVEL&quot;]</p>
     */
    @NameInMap("EnvironmentVariableKeys")
    public java.util.List<String> environmentVariableKeys;

    /**
     * <p>The name of the Routine function.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-routine</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteRoutineEnvironmentVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineEnvironmentVariablesRequest self = new DeleteRoutineEnvironmentVariablesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineEnvironmentVariablesRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DeleteRoutineEnvironmentVariablesRequest setEnvironmentVariableKeys(java.util.List<String> environmentVariableKeys) {
        this.environmentVariableKeys = environmentVariableKeys;
        return this;
    }
    public java.util.List<String> getEnvironmentVariableKeys() {
        return this.environmentVariableKeys;
    }

    public DeleteRoutineEnvironmentVariablesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
