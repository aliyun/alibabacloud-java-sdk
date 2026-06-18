// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateManagedTransformRequest extends TeaModel {
    /**
     * <p>Specifies whether to add a header that contains visitor geolocation information. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Add the header.</p>
     * </li>
     * <li><p><code>off</code>: Do not add the header.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AddClientGeolocationHeader")
    public String addClientGeolocationHeader;

    /**
     * <p>Specifies whether to add the <code>ali-real-client-ip</code> header, which contains the real client IP. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Add the header.</p>
     * </li>
     * <li><p><code>off</code>: Do not add the header.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AddRealClientIpHeader")
    public String addRealClientIpHeader;

    /**
     * <p>The name of the header that contains the real client IP. The name must start with a letter and can contain letters, digits (0-9), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test-header</p>
     */
    @NameInMap("RealClientIpHeaderName")
    public String realClientIpHeaderName;

    /**
     * <p>The ID of the site. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version of the site. For sites with version management enabled, this parameter specifies the version to which the configuration applies. Default value: 0.</p>
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
