// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertOrUpdateRegionRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable remote debugging. Valid values:</p>
     * <br>
     * <p>*   true: enables remote debugging.</p>
     * <p>*   false: disables remote debugging.</p>
     */
    @NameInMap("DebugEnable")
    public Boolean debugEnable;

    /**
     * <p>The description of the namespace. The description can be up to 128 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to create or modify the namespace. If this parameter is left empty or is set to 0, the namespace is created. Otherwise, the namespace is modified.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the MSE registry.</p>
     */
    @NameInMap("MseInstanceId")
    public String mseInstanceId;

    /**
     * <p>The name of the namespace. The name can be up to 63 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionName")
    public String regionName;

    /**
     * <p>The ID of the namespace.</p>
     * <br>
     * <p>*   The ID of a custom namespace is in the `Region ID:Namespace identifier` format. Example: cn-beijing:tdy218.</p>
     * <p>*   The ID of the default namespace is in the `region ID` format. Example: cn-beijing.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionTag")
    public String regionTag;

    /**
     * <p>The type of the registry.</p>
     * <br>
     * <p>*   default: the shared registry of Enterprise Distributed Application Service (EDAS)</p>
     * <p>*   exclusive_mse: a Microservices Engine (MSE) registry</p>
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
