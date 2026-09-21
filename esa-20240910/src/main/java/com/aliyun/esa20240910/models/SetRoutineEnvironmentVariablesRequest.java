// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetRoutineEnvironmentVariablesRequest extends TeaModel {
    /**
     * <p>The environment name. Valid values:</p>
     * <ul>
     * <li><code>staging</code>: staging environment.</li>
     * <li><code>production</code>: production environment.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The dictionary of environment variables. The key is the environment variable name, and the value is the environment variable value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;EnvironmentVariables&quot;: {
     *         &quot;Env_Key_1&quot;: {
     *             &quot;Type&quot;: &quot;plain_text&quot;,
     *             &quot;Value&quot;: &quot;value&quot;
     *         },
     *         &quot;PASSWORD&quot;: {
     *             &quot;Type&quot;: &quot;secret_text&quot;,
     *             &quot;Value&quot;: &quot;secret-password&quot;
     *         }
     *     }</p>
     */
    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, EnvironmentVariablesValue> environmentVariables;

    /**
     * <p>The function name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er_test</p>
     */
    @NameInMap("Name")
    public String name;

    public static SetRoutineEnvironmentVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRoutineEnvironmentVariablesRequest self = new SetRoutineEnvironmentVariablesRequest();
        return TeaModel.build(map, self);
    }

    public SetRoutineEnvironmentVariablesRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public SetRoutineEnvironmentVariablesRequest setEnvironmentVariables(java.util.Map<String, EnvironmentVariablesValue> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, EnvironmentVariablesValue> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public SetRoutineEnvironmentVariablesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
