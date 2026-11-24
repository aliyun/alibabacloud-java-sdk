// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdviceServiceEnabledResponseBody extends TeaModel {
    /**
     * <p>The message returned for the call result. </p>
     * <ul>
     * <li>If the request is successful, <strong>Success</strong> is returned. </li>
     * <li>If the request fails, the specific error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E031AABF-BD56-5966-A063-4283EF18DB45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the advisory service is enabled. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: Enabled. </li>
     * <li><strong>False</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
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
