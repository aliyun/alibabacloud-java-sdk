// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ExportRecordsResponseBody extends TeaModel {
    /**
     * <p>The exported DNS records.</p>
     * 
     * <strong>example:</strong>
     * <p>;; site:example.com.\n;; Exported:2024-01-24 15:54:35\n\n;; A Records\na1.example.com. 30 IN A 1.1.1.1 direct\na2.example.com. 30 IN A 1.1.1.1 direct\na3.example.com. 30 IN A 1.1.1.1 direct\n</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C69B5894-D1BA-592C-95D0-DADBE7AEAC63</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportRecordsResponseBody self = new ExportRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportRecordsResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExportRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
