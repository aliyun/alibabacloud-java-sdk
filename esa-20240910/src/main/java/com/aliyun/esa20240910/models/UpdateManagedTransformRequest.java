// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateManagedTransformRequest extends TeaModel {
    /**
     * <p>Specifies whether to include the header that indicates the geographical location of a client in an origin request. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AddClientGeolocationHeader")
    public String addClientGeolocationHeader;

    /**
     * <p>Specifies whether to include the &quot;ali-real-client-ip&quot; header that indicates the client\&quot;s real IP address in an origin request. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AddRealClientIpHeader")
    public String addRealClientIpHeader;

    @NameInMap("RealClientIpHeaderName")
    public String realClientIpHeaderName;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the website. You can use this parameter to specify a version of your website to apply the feature settings. By default, version 0 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static UpdateManagedTransformRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateManagedTransformRequest self = new UpdateManagedTransformRequest();
        return TeaModel.build(map, self);
    }

    public UpdateManagedTransformRequest setAddClientGeolocationHeader(String addClientGeolocationHeader) {
        this.addClientGeolocationHeader = addClientGeolocationHeader;
        return this;
    }
    public String getAddClientGeolocationHeader() {
        return this.addClientGeolocationHeader;
    }

    public UpdateManagedTransformRequest setAddRealClientIpHeader(String addRealClientIpHeader) {
        this.addRealClientIpHeader = addRealClientIpHeader;
        return this;
    }
    public String getAddRealClientIpHeader() {
        return this.addRealClientIpHeader;
    }

    public UpdateManagedTransformRequest setRealClientIpHeaderName(String realClientIpHeaderName) {
        this.realClientIpHeaderName = realClientIpHeaderName;
        return this;
    }
    public String getRealClientIpHeaderName() {
        return this.realClientIpHeaderName;
    }

    public UpdateManagedTransformRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateManagedTransformRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
