// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateSaseUserTagResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FEF1144C-95D1-5F7C-81EF-9DB70EA49FCE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user tag ID.</p>
     * 
     * <strong>example:</strong>
     * <p>su-tag-1ae52f66039fa0d4****</p>
     */
    @NameInMap("TagId")
    public String tagId;

    public static CreateSaseUserTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSaseUserTagResponseBody self = new CreateSaseUserTagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSaseUserTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSaseUserTagResponseBody setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
