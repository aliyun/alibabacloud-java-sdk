// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopListInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The URL of the exported file of the cloud computer list.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-hangzhou-servicemanager.oss-cn-hangzhou.aliyuncs.com/A0_DESKTOP/EDS_CloudDesktops%20List_2022**********_w3fq******.csv">https://cn-hangzhou-servicemanager.oss-cn-hangzhou.aliyuncs.com/A0_DESKTOP/EDS_CloudDesktops%20List_2022**********_w3fq******.csv</a>?**********</p>
     */
    @NameInMap("Url")
    public String url;

    public static ExportDesktopListInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportDesktopListInfoResponseBody self = new ExportDesktopListInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportDesktopListInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportDesktopListInfoResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
