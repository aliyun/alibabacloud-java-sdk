// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ExportRecordCnamesResponseBody extends TeaModel {
    /**
     * <p>The exported CNAME content.</p>
     * 
     * <strong>example:</strong>
     * <p>a.com a.com.cname.zone</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2430E05E-1340-5773-B5E1-B743929F46F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportRecordCnamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportRecordCnamesResponseBody self = new ExportRecordCnamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportRecordCnamesResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExportRecordCnamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
