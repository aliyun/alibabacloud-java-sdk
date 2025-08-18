// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateUrlObservationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("SdkType")
    public String sdkType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateUrlObservationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUrlObservationRequest self = new UpdateUrlObservationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUrlObservationRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateUrlObservationRequest setSdkType(String sdkType) {
        this.sdkType = sdkType;
        return this;
    }
    public String getSdkType() {
        return this.sdkType;
    }

    public UpdateUrlObservationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
