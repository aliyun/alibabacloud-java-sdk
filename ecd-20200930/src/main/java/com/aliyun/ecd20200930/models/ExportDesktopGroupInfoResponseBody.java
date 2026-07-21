// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopGroupInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24E05D3E-08F4-551E-B1F0-F6D84EE0BCCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The download URL of the exported shared cloud desktop list file. The exported file contains the following details of shared cloud desktops:</p>
     * <ul>
     * <li>Shared cloud desktop ID/name</li>
     * <li>Office network ID/name</li>
     * <li>Shared cloud desktop template</li>
     * <li>CPU/memory</li>
     * <li>System cloud disk/data cloud disk</li>
     * <li>Security policy name</li>
     * <li>Number of currently authorized users</li>
     * <li>Billing method</li>
     * <li>Creation time</li>
     * <li>Expiration time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-hangzhou-servicemanager.oss-cn-hangzhou.aliyuncs.com/A0_DESKTOP/EDS_CloudDesktopGroups_202203********_xBjqdCT***.xlsx">https://cn-hangzhou-servicemanager.oss-cn-hangzhou.aliyuncs.com/A0_DESKTOP/EDS_CloudDesktopGroups_202203********_xBjqdCT***.xlsx</a>?*********</p>
     */
    @NameInMap("Url")
    public String url;

    public static ExportDesktopGroupInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportDesktopGroupInfoResponseBody self = new ExportDesktopGroupInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportDesktopGroupInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportDesktopGroupInfoResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
