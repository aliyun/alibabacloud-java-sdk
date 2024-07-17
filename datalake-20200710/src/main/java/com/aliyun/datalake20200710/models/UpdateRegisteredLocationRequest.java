// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateRegisteredLocationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InventoryCollectEnabled")
    public Boolean inventoryCollectEnabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LOC-AB8FBC17F95A4AF5</p>
     */
    @NameInMap("LocationId")
    public String locationId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OssLogCollectEnabled")
    public Boolean ossLogCollectEnabled;

    public static UpdateRegisteredLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegisteredLocationRequest self = new UpdateRegisteredLocationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRegisteredLocationRequest setInventoryCollectEnabled(Boolean inventoryCollectEnabled) {
        this.inventoryCollectEnabled = inventoryCollectEnabled;
        return this;
    }
    public Boolean getInventoryCollectEnabled() {
        return this.inventoryCollectEnabled;
    }

    public UpdateRegisteredLocationRequest setLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
    public String getLocationId() {
        return this.locationId;
    }

    public UpdateRegisteredLocationRequest setOssLogCollectEnabled(Boolean ossLogCollectEnabled) {
        this.ossLogCollectEnabled = ossLogCollectEnabled;
        return this;
    }
    public Boolean getOssLogCollectEnabled() {
        return this.ossLogCollectEnabled;
    }

}
