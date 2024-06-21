// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertContactGroupResponseBody extends TeaModel {
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
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C21AB7CF-B7AF-410F-BD61-82D1567F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAlertContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactGroupResponseBody self = new DeleteAlertContactGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactGroupResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteAlertContactGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
