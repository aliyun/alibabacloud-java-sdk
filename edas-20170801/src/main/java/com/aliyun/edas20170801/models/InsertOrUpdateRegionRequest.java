// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertOrUpdateRegionRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable remote debugging. Valid values:</p>
     * <ul>
     * <li>true: enables remote debugging.</li>
     * <li>false: disables remote debugging.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DebugEnable")
    public Boolean debugEnable;

    /**
     * <p>The description of the namespace. The description can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to create or modify the namespace. If this parameter is left empty or is set to 0, the namespace is created. Otherwise, the namespace is modified.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the MSE registry.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-tl32n******</p>
     */
    @NameInMap("MseInstanceId")
    public String mseInstanceId;

    /**
     * <p>The name of the namespace. The name can be up to 63 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_region</p>
     */
    @NameInMap("RegionName")
    public String regionName;

    /**
     * <p>The ID of the namespace.</p>
     * <ul>
     * <li>The ID of a custom namespace is in the <code>Region ID:Namespace identifier</code> format. Example: cn-beijing:tdy218.</li>
     * <li>The ID of the default namespace is in the <code>region ID</code> format. Example: cn-beijing.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("RegionTag")
    public String regionTag;

    /**
     * <p>The type of the registry.</p>
     * <ul>
     * <li>default: the shared registry of Enterprise Distributed Application Service (EDAS)</li>
     * <li>exclusive_mse: a Microservices Engine (MSE) registry</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("RegistryType")
    public String registryType;

    public static InsertOrUpdateRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertOrUpdateRegionRequest self = new InsertOrUpdateRegionRequest();
        return TeaModel.build(map, self);
    }

    public InsertOrUpdateRegionRequest setDebugEnable(Boolean debugEnable) {
        this.debugEnable = debugEnable;
        return this;
    }
    public Boolean getDebugEnable() {
        return this.debugEnable;
    }

    public InsertOrUpdateRegionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public InsertOrUpdateRegionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public InsertOrUpdateRegionRequest setMseInstanceId(String mseInstanceId) {
        this.mseInstanceId = mseInstanceId;
        return this;
    }
    public String getMseInstanceId() {
        return this.mseInstanceId;
    }

    public InsertOrUpdateRegionRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public InsertOrUpdateRegionRequest setRegionTag(String regionTag) {
        this.regionTag = regionTag;
        return this;
    }
    public String getRegionTag() {
        return this.regionTag;
    }

    public InsertOrUpdateRegionRequest setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

}
