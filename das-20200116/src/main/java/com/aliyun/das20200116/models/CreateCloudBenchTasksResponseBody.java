// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCloudBenchTasksResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information.</p>
     */
    @NameInMap("Data")
    public CreateCloudBenchTasksResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateCloudBenchTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudBenchTasksResponseBody self = new CreateCloudBenchTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudBenchTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCloudBenchTasksResponseBody setData(CreateCloudBenchTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCloudBenchTasksResponseBodyData getData() {
        return this.data;
    }

    public CreateCloudBenchTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCloudBenchTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloudBenchTasksResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateCloudBenchTasksResponseBodyData extends TeaModel {
        @NameInMap("taskIds")
        public java.util.List<String> taskIds;

        public static CreateCloudBenchTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudBenchTasksResponseBodyData self = new CreateCloudBenchTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCloudBenchTasksResponseBodyData setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

    }

}
