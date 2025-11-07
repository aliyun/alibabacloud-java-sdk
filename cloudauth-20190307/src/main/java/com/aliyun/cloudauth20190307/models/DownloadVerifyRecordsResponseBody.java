// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DownloadVerifyRecordsResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>OSS link for file download.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth.oss-cn-shanghai.aliyuncs.com/invoke_download/0E30CD55-DCD4-5363-AA98-XXXXXXX">https://cn-shanghai-aliyun-cloudauth.oss-cn-shanghai.aliyuncs.com/invoke_download/0E30CD55-DCD4-5363-AA98-XXXXXXX</a></p>
     */
    @NameInMap("ResultObject")
    public String resultObject;

    public static DownloadVerifyRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadVerifyRecordsResponseBody self = new DownloadVerifyRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadVerifyRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadVerifyRecordsResponseBody setResultObject(String resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public String getResultObject() {
        return this.resultObject;
    }

}
