// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SetRetcodeShareStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The call is successful.</li>
     * <li><code>false</code>: The call fails.</li>
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
     * <p>40B10E04-81E8-4643-970D-F1B38F2E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetRetcodeShareStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRetcodeShareStatusResponseBody self = new SetRetcodeShareStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRetcodeShareStatusResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public SetRetcodeShareStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
