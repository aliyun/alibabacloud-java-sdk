// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartInstanceRequest extends TeaModel {
    /**
     * <p>The restart parameters.</p>
     * 
     * <strong>example:</strong>
     * <ol>
     * <li>restart nodes example:
     * {
     *   &quot;restartType&quot;: &quot;nodeIp&quot;,
     *   &quot;nodes&quot;: [
     *  &quot;es-cn-xx-data-j-0&quot;
     *   ],
     *   &quot;blueGreenDep&quot;: false
     * }</li>
     * <li>restart instance example:
     * {
     *   &quot;restartType&quot;: &quot;instance&quot;,
     *   &quot;blueGreenDep&quot;: false
     * }</li>
     * </ol>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the value of this parameter on the client side. Ensure that the value is unique across different requests and contains a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to ignore the cluster state and force a restart. Valid values:</p>
     * <ul>
     * <li>true: Ignores the cluster state.</li>
     * <li>false: Does not ignore the cluster state. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("force")
    public Boolean force;

    public static RestartInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartInstanceRequest self = new RestartInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartInstanceRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public RestartInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RestartInstanceRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
