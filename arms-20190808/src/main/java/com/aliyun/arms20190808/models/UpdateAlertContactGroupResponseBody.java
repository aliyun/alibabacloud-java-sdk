// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertContactGroupResponseBody extends TeaModel {
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
     * <p>9319A57D-2D9E-472A-B69B-CF3CD16D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAlertContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertContactGroupResponseBody self = new UpdateAlertContactGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAlertContactGroupResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public UpdateAlertContactGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
