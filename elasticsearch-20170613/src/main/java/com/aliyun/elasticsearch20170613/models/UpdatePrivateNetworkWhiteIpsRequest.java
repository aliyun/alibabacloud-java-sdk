// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePrivateNetworkWhiteIpsRequest extends TeaModel {
    /**
     * <p>The VPC private network access whitelist or whitelist group configuration of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;privateNetworkIpWhiteList&quot;:[&quot;0.0.XX.XX&quot;,&quot;10.2.XX.XX&quot;,&quot;192.168.XX.XX/25&quot;]}</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The modification method. Valid values:</p>
     * <ul>
     * <li><p>Cover (default): overwrites the original IP address whitelist with the value of the ips parameter.</p>
     * </li>
     * <li><p>Append: adds the IP addresses specified by the ips parameter to the original IP address whitelist.</p>
     * </li>
     * <li><p>Delete: deletes the IP addresses specified by the ips parameter from the original IP address whitelist. You must retain at least one IP address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("modifyMode")
    public String modifyMode;

    public static UpdatePrivateNetworkWhiteIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateNetworkWhiteIpsRequest self = new UpdatePrivateNetworkWhiteIpsRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateNetworkWhiteIpsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdatePrivateNetworkWhiteIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdatePrivateNetworkWhiteIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

}
