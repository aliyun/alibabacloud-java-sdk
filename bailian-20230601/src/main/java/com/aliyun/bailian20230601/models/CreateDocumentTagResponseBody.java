// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class CreateDocumentTagResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagId")
    public String tagId;

    public static CreateDocumentTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDocumentTagResponseBody self = new CreateDocumentTagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDocumentTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDocumentTagResponseBody setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
