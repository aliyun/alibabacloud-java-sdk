// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PackageWeightSizeCheckResponseBody extends TeaModel {
    /**
     * <p>The response code. 200 indicates a successful call. For other response codes, refer to the error code information.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The asynchronous submission result data, which contains the asynchronous task ID.</p>
     */
    @NameInMap("Data")
    public PackageWeightSizeCheckResponseBodyData data;

    /**
     * <p>The error message. &quot;Success&quot; is returned for normal calls, and specific error information is returned for exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, used to identify a unique request call.</p>
     * 
     * <strong>example:</strong>
     * <p>F93D82E4-D0B6-1043-AC58-282597BC3C10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful. true indicates success, and false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PackageWeightSizeCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PackageWeightSizeCheckResponseBody self = new PackageWeightSizeCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public PackageWeightSizeCheckResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PackageWeightSizeCheckResponseBody setData(PackageWeightSizeCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PackageWeightSizeCheckResponseBodyData getData() {
        return this.data;
    }

    public PackageWeightSizeCheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PackageWeightSizeCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PackageWeightSizeCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PackageWeightSizeCheckResponseBodyData extends TeaModel {
        /**
         * <p>The asynchronous task ID, used to query the audit result later through QueryAsyncTaskResult.</p>
         * 
         * <strong>example:</strong>
         * <p>a8323ada-a196-9061-976f-90e38b27323a</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static PackageWeightSizeCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PackageWeightSizeCheckResponseBodyData self = new PackageWeightSizeCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PackageWeightSizeCheckResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
