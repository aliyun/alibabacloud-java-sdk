// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopGroupInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The URL from which you can download the exported cloud computer pools. The details of the cloud computer pools include:</p>
     * <br>
     * <p>*   IDs and names of the cloud computer pools</p>
     * <p>*   IDs and names of the office networks</p>
     * <p>*   Cloud computer pool templates</p>
     * <p>*   Number of CPU cores and memory size</p>
     * <p>*   System disks and data disks</p>
     * <p>*   Names of security policies</p>
     * <p>*   Number of current authorized users</p>
     * <p>*   Billing methods</p>
     * <p>*   The time when the cloud computer pools were created</p>
     * <p>*   The time when the cloud computer pools expire</p>
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
