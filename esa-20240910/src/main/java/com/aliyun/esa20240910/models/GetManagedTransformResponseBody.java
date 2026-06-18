// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetManagedTransformResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a header that contains the visitor\&quot;s geolocation is added. Valid values:</p>
     * <ul>
     * <li><p>on: Enables this feature.</p>
     * </li>
     * <li><p>off: Disables this feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AddClientGeolocationHeader")
    public String addClientGeolocationHeader;

    /**
     * <p>Indicates whether the &quot;ali-real-client-ip&quot; header is added to include the real client IP. Valid values:</p>
     * <ul>
     * <li><p>on: Enables this feature.</p>
     * </li>
     * <li><p>off: Disables this feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AddRealClientIpHeader")
    public String addRealClientIpHeader;

    /**
     * <p>The real client IP header name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-header</p>
     */
    @NameInMap("RealClientIpHeaderName")
    public String realClientIpHeaderName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version of the site for which the configuration is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static GetManagedTransformResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetManagedTransformResponseBody self = new GetManagedTransformResponseBody();
        return TeaModel.build(map, self);
    }

    public GetManagedTransformResponseBody setAddClientGeolocationHeader(String addClientGeolocationHeader) {
        this.addClientGeolocationHeader = addClientGeolocationHeader;
        return this;
    }
    public String getAddClientGeolocationHeader() {
        return this.addClientGeolocationHeader;
    }

    public GetManagedTransformResponseBody setAddRealClientIpHeader(String addRealClientIpHeader) {
        this.addRealClientIpHeader = addRealClientIpHeader;
        return this;
    }
    public String getAddRealClientIpHeader() {
        return this.addRealClientIpHeader;
    }

    public GetManagedTransformResponseBody setRealClientIpHeaderName(String realClientIpHeaderName) {
        this.realClientIpHeaderName = realClientIpHeaderName;
        return this;
    }
    public String getRealClientIpHeaderName() {
        return this.realClientIpHeaderName;
    }

    public GetManagedTransformResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetManagedTransformResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
