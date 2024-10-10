// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B56432E0-2112-5C97-88D0-AA0AE5C75C74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceResponseBody self = new DeleteDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
