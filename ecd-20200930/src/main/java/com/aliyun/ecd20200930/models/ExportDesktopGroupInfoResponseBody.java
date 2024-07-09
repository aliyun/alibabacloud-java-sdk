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
     * <p>The URL from which you can download the exported cloud computer pools. The details of the cloud computer pools include:</p>
     * <ul>
     * <li>IDs and names of the cloud computer pools</li>
     * <li>IDs and names of the office networks</li>
     * <li>Cloud computer pool templates</li>
     * <li>Number of CPU cores and memory size</li>
     * <li>System disks and data disks</li>
     * <li>Names of security policies</li>
     * <li>Number of current authorized users</li>
     * <li>Billing methods</li>
     * <li>The time when the cloud computer pools were created</li>
     * <li>The time when the cloud computer pools expire</li>
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
