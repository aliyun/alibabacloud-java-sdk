// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteElasticNetworkInterfaceRequest extends TeaModel {
    /**
     * <p>By default, popApi is not ignored and idempotent</p>
     * 
     * <strong>example:</strong>
     * <p>141cccd6-dfbd-11ec-b8e8-0242ac110003</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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

    public static DeleteElasticNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteElasticNetworkInterfaceRequest self = new DeleteElasticNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteElasticNetworkInterfaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteElasticNetworkInterfaceRequest setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
        this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
        return this;
    }
    public String getElasticNetworkInterfaceId() {
        return this.elasticNetworkInterfaceId;
    }

    public DeleteElasticNetworkInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
