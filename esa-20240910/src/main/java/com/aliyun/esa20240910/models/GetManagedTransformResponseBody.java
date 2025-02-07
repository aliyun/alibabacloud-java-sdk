// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetManagedTransformResponseBody extends TeaModel {
    /**
     * <p>Indicates whether to include the header that indicates the geographical location of a client in an origin request. Valid values:</p>
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
     * <p>Indicates whether to include the &quot;ali-real-client-ip&quot; header that contains the client\&quot;s real IP address in an origin request. Valid values:</p>
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

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version number of the website.</p>
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
