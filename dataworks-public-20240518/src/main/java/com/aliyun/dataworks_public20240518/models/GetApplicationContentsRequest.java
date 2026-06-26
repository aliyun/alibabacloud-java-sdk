// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetApplicationContentsRequest extends TeaModel {
    /**
     * <p>The approval process instance ID of the submitted application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>332066440109224007</p>
     */
    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    public static GetApplicationContentsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationContentsRequest self = new GetApplicationContentsRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationContentsRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

}
