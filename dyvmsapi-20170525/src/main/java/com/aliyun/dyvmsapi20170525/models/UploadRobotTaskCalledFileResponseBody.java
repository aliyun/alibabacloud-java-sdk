// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class UploadRobotTaskCalledFileResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The unique ID of the robocall task.</p>
     * <br>
     * <p>You can call the [QueryRobotTaskDetail](~~QueryRobotTaskDetail~~) operation to query the details of the robocall task based on the task ID.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UploadRobotTaskCalledFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadRobotTaskCalledFileResponseBody self = new UploadRobotTaskCalledFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadRobotTaskCalledFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadRobotTaskCalledFileResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UploadRobotTaskCalledFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadRobotTaskCalledFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
