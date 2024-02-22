// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateDocAttributeResponseBody extends TeaModel {
    @NameInMap("DocId")
    public String docId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDocAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocAttributeResponseBody self = new UpdateDocAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDocAttributeResponseBody setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public UpdateDocAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
