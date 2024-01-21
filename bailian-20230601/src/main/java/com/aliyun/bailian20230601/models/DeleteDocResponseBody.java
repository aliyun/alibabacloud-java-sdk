// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DeleteDocResponseBody extends TeaModel {
    @NameInMap("DocId")
    public String docId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocResponseBody self = new DeleteDocResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDocResponseBody setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public DeleteDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
