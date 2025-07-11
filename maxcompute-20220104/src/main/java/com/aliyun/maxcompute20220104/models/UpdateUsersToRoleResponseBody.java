// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateUsersToRoleResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0a032a1317254153012687347ef4ee</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateUsersToRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUsersToRoleResponseBody self = new UpdateUsersToRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUsersToRoleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateUsersToRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
