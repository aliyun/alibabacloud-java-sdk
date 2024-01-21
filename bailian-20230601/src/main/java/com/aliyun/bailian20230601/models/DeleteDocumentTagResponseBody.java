// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DeleteDocumentTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagId")
    public String tagId;

    public static DeleteDocumentTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentTagResponseBody self = new DeleteDocumentTagResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDocumentTagResponseBody setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
