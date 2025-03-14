// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataSourceSharedRuleResponseBody extends TeaModel {
    /**
     * <p>The sharing rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>105412</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the request. It is used to locate logs and troubleshoot problems.</p>
     * 
     * <strong>example:</strong>
     * <p>46F594E6-84AB-5FA5-8144-6F3D149961E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataSourceSharedRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceSharedRuleResponseBody self = new CreateDataSourceSharedRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceSharedRuleResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateDataSourceSharedRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
