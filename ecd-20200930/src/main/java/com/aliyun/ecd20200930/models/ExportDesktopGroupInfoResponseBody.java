// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopGroupInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>24E05D3E-08F4-551E-B1F0-F6D84EE0BCCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The download URL of the XLSX file that contains cloud computer shares. The XLSX file provides the following information:</p>
     * <ul>
     * <li><p>Cloud computer share ID/name</p>
     * </li>
     * <li><p>Office network ID/name</p>
     * </li>
     * <li><p>Cloud computer share template</p>
     * </li>
     * <li><p>vCPUs/Memory size</p>
     * </li>
     * <li><p>System disk/Data disk</p>
     * </li>
     * <li><p>Security policy name</p>
     * </li>
     * <li><p>Number of authorized users</p>
     * </li>
     * <li><p>Billing method</p>
     * </li>
     * <li><p>Creation time</p>
     * </li>
     * <li><p>Expiration time</p>
     * </li>
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
