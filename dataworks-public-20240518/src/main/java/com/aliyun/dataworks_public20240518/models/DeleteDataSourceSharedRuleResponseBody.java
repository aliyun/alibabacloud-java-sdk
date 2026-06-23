// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataSourceSharedRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64B-587A-8CED-969E1973887F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the sharing rule was deleted. Valid values:
     * -true: The sharing rule was deleted.
     * -false: The sharing rule failed to be deleted.</p>
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
