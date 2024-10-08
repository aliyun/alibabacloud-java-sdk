// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StartAlertResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><code>true</code>: The call was successful.</li>
     * <li><code>false</code>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>27E653FA-5958-45BE-8AA9-14D884DC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAlertResponseBody self = new StartAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAlertResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public StartAlertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
