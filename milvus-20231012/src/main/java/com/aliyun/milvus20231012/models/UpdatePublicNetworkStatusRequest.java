// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class UpdatePublicNetworkStatusRequest extends TeaModel {
    /**
     * <p>The CIDR blocks.</p>
     * 
     * <strong>example:</strong>
     * <p><code>192.168.**.**</code>/24,<code>172.1.**.**</code>/16</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <p>The component type. Valid values:</p>
     * <ul>
     * <li>Proxy</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Proxy</p>
     */
    @NameInMap("ComponentType")
    public String componentType;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-123xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Enable /disable the Internet.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublicNetworkEnabled")
    public Boolean publicNetworkEnabled;

    public static UpdatePublicNetworkStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicNetworkStatusRequest self = new UpdatePublicNetworkStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublicNetworkStatusRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public UpdatePublicNetworkStatusRequest setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public UpdatePublicNetworkStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdatePublicNetworkStatusRequest setPublicNetworkEnabled(Boolean publicNetworkEnabled) {
        this.publicNetworkEnabled = publicNetworkEnabled;
        return this;
    }
    public Boolean getPublicNetworkEnabled() {
        return this.publicNetworkEnabled;
    }

}
