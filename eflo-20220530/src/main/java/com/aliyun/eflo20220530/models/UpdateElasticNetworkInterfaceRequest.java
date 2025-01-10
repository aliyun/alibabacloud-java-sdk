// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateElasticNetworkInterfaceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3fd79d62-ab1d-11ec-9a53-0242ac110004</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>LHICDOSEExternaluserinquiryP</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Lingjun Elastic Network Interface ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>leni-1234****</p>
     */
    @NameInMap("ElasticNetworkInterfaceId")
    public String elasticNetworkInterfaceId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-wz9fj2s3o21nw2****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static UpdateElasticNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateElasticNetworkInterfaceRequest self = new UpdateElasticNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateElasticNetworkInterfaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateElasticNetworkInterfaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateElasticNetworkInterfaceRequest setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
        this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
        return this;
    }
    public String getElasticNetworkInterfaceId() {
        return this.elasticNetworkInterfaceId;
    }

    public UpdateElasticNetworkInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateElasticNetworkInterfaceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
