// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetManagedTransformResponseBody extends TeaModel {
    /**
     * <p>Add visitor geolocation header. Value range:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AddClientGeolocationHeader")
    public String addClientGeolocationHeader;

    /**
     * <p>Add the &quot;ali-real-client-ip&quot; header containing the real client IP. Value range:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AddRealClientIpHeader")
    public String addRealClientIpHeader;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version number of the site. For sites with version management enabled, this parameter can be used to specify the site version for which the configuration takes effect, defaulting to version 0.</p>
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
