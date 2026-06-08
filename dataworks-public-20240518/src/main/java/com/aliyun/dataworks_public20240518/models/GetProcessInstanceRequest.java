// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProcessInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>332066440109224007</p>
     */
    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    public static GetProcessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProcessInstanceRequest self = new GetProcessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetProcessInstanceRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

}
