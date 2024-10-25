// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteProjectMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1FF0465F-209C-5964-8F30-FAF21B677CC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProjectMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectMemberResponseBody self = new DeleteProjectMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProjectMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
