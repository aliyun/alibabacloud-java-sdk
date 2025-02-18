// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataSourceSharedRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64B-587A-8CED-969E1973887FXXX-TT</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the data source sharing rule is deleted successfully. The value is as follows:
     * -true: The request is successful.
     * -false: The request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteDataSourceSharedRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceSharedRuleResponseBody self = new DeleteDataSourceSharedRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceSharedRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDataSourceSharedRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
