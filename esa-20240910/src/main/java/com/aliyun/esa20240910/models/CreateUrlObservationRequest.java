// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateUrlObservationRequest extends TeaModel {
    /**
     * <p>SDK integration. Supported</p>
     * <ul>
     * <li><strong>automatic</strong></li>
     * <li><strong>manual</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>automatic</p>
     */
    @NameInMap("SdkType")
    public String sdkType;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456******</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The URL of the web page to monitor.</p>
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
