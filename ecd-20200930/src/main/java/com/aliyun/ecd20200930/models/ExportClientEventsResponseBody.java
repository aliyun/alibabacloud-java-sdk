// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportClientEventsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The download address from which you can export desktop groups.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-servicemanager.oss-cn-shanghai.aliyuncs.com/A0_CLIENT_EVENT/EDS_Events%20List_20220519234611_w5HuD83KGs.csv?Expires=1652975773&OSSAccessKeyId=LTYL****8tso&Signature=4erMG*********k%3D">https://cn-shanghai-servicemanager.oss-cn-shanghai.aliyuncs.com/A0_CLIENT_EVENT/EDS_Events%20List_20220519234611_w5HuD83KGs.csv?Expires=1652975773&amp;OSSAccessKeyId=LTYL****8tso&amp;Signature=4erMG*********k%3D</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static ExportClientEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportClientEventsResponseBody self = new ExportClientEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportClientEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportClientEventsResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
