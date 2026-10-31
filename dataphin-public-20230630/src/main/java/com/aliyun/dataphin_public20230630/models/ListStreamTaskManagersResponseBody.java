// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamTaskManagersResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of TaskManagers for the real-time task.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListStreamTaskManagersResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend response exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListStreamTaskManagersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStreamTaskManagersResponseBody self = new ListStreamTaskManagersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStreamTaskManagersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListStreamTaskManagersResponseBody setData(java.util.List<ListStreamTaskManagersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListStreamTaskManagersResponseBodyData> getData() {
        return this.data;
    }

    public ListStreamTaskManagersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListStreamTaskManagersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStreamTaskManagersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStreamTaskManagersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListStreamTaskManagersResponseBodyData extends TeaModel {
        /**
         * <p>The communication address or machine information.</p>
         * 
         * <strong>example:</strong>
         * <p>akka.tcp://<a href="mailto:flink@10.0.0.12">flink@10.0.0.12</a>:6122/user/rpc/taskmanager_0</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>taskmanagerId</p>
         * 
         * <strong>example:</strong>
         * <p>dataphin-session-7db678957dc449aab0086b931c9f8218-taskmanazjkxq</p>
         */
        @NameInMap("TaskmanagerId")
        public String taskmanagerId;

        public static ListStreamTaskManagersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListStreamTaskManagersResponseBodyData self = new ListStreamTaskManagersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListStreamTaskManagersResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListStreamTaskManagersResponseBodyData setTaskmanagerId(String taskmanagerId) {
            this.taskmanagerId = taskmanagerId;
            return this;
        }
        public String getTaskmanagerId() {
            return this.taskmanagerId;
        }

    }

}
