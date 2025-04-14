// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteLineageRelationshipResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>952795279527ab****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteLineageRelationshipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLineageRelationshipResponseBody self = new DeleteLineageRelationshipResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLineageRelationshipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLineageRelationshipResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
