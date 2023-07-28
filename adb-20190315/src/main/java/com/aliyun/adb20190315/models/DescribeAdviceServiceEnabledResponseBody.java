// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAdviceServiceEnabledResponseBody extends TeaModel {
    /**
     * <p>The message returned for the operation. Valid values:</p>
     * <br>
     * <p>*   **Success** is returned if the operation is successful.</p>
     * <p>*   An error message is returned if the operation fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the suggestion feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **True**: The suggestion feature is enabled.</p>
     * <p>*   **False**: The suggestion feature is disabled.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static DescribeAdviceServiceEnabledResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdviceServiceEnabledResponseBody self = new DescribeAdviceServiceEnabledResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdviceServiceEnabledResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAdviceServiceEnabledResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdviceServiceEnabledResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
