// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePublicWhiteIpsRequest extends TeaModel {
    /**
     * <p>The public network access whitelist or whitelist group configuration of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;publicIpWhitelist&quot;:[&quot;0.0.0.0/0&quot;,&quot;0.0.0.0/1&quot;]}</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The modification method. Valid values:</p>
     * <ul>
     * <li><p>Cover: overwrites the original IP address whitelist with the value of the ips parameter. This is the default value.</p>
     * </li>
     * <li><p>Append: adds the IP addresses specified by the ips parameter to the original IP address whitelist.</p>
     * </li>
     * <li><p>Delete: deletes the IP addresses specified by the ips parameter from the original IP address whitelist. At least one IP address must be retained.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("modifyMode")
    public String modifyMode;

    public static UpdatePublicWhiteIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicWhiteIpsRequest self = new UpdatePublicWhiteIpsRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublicWhiteIpsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdatePublicWhiteIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdatePublicWhiteIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

}
