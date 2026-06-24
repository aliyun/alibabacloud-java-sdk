// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartInstanceRequest extends TeaModel {
    /**
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
     * <p>A unique token used to ensure the idempotence of the request. The client generates this value. The value must be unique among different requests and can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to forcefully restart the cluster regardless of the cluster status.</p>
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
