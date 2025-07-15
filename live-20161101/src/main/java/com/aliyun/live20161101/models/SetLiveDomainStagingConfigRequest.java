// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainStagingConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>developer.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The list of features. You must specify the ConfigId field when you want to modify the configurations. For more information, see <strong>Features specified by the Functions parameter</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;enable&quot;,&quot;argValue&quot;:&quot;on&quot;},{&quot;argName&quot;:&quot;pri&quot;,&quot;argValue&quot;:&quot;1&quot;},{&quot;argName&quot;:&quot;rule&quot;,&quot;argValue&quot;:&quot;xxx&quot;}],&quot;functionName&quot;:&quot;edge_function&quot;}]</p>
     */
    @NameInMap("Functions")
    public String functions;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static SetLiveDomainStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainStagingConfigRequest self = new SetLiveDomainStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveDomainStagingConfigRequest setFunctions(String functions) {
        this.functions = functions;
        return this;
    }
    public String getFunctions() {
        return this.functions;
    }

    public SetLiveDomainStagingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveDomainStagingConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
