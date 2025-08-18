// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateUrlObservationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>automatic</p>
     */
    @NameInMap("SdkType")
    public String sdkType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456******</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/test</p>
     */
    @NameInMap("Url")
    public String url;

    public static CreateUrlObservationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUrlObservationRequest self = new CreateUrlObservationRequest();
        return TeaModel.build(map, self);
    }

    public CreateUrlObservationRequest setSdkType(String sdkType) {
        this.sdkType = sdkType;
        return this;
    }
    public String getSdkType() {
        return this.sdkType;
    }

    public CreateUrlObservationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateUrlObservationRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
