// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteThreadResponseBody extends TeaModel {
    @NameInMap("deleted")
    public Boolean deleted;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>123-0F43-23423-AC43-34234</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteThreadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteThreadResponseBody self = new DeleteThreadResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteThreadResponseBody setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public DeleteThreadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
