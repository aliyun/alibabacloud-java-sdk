// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class PublishLiveStagingConfigToProductionRequest extends TeaModel {
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
     * <p>The name of the feature. For more information about how to obtain the feature name, see <a href="https://help.aliyun.com/document_detail/297374.html">DescribeLiveDomainStagingConfig</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliauth</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static PublishLiveStagingConfigToProductionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishLiveStagingConfigToProductionRequest self = new PublishLiveStagingConfigToProductionRequest();
        return TeaModel.build(map, self);
    }

    public PublishLiveStagingConfigToProductionRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public PublishLiveStagingConfigToProductionRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public PublishLiveStagingConfigToProductionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PublishLiveStagingConfigToProductionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
