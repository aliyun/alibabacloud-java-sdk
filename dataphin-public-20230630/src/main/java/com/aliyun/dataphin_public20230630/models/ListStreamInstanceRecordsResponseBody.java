// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamInstanceRecordsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The historical running instance records of the real-time task. You can use the deploymentInstanceId to query the logs of a specific run.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListStreamInstanceRecordsResponseBodyData> data;

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

    public static ListStreamInstanceRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStreamInstanceRecordsResponseBody self = new ListStreamInstanceRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStreamInstanceRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListStreamInstanceRecordsResponseBody setData(java.util.List<ListStreamInstanceRecordsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListStreamInstanceRecordsResponseBodyData> getData() {
        return this.data;
    }

    public ListStreamInstanceRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListStreamInstanceRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStreamInstanceRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStreamInstanceRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListStreamInstanceRecordsResponseBodyData extends TeaModel {
        /**
         * <p>The deployment ID of the task. A single deployment can be associated with multiple running instances.</p>
         * 
         * <strong>example:</strong>
         * <p>ac6e5a34bbd44d7f8b7851ef28c90d12</p>
         */
        @NameInMap("DeploymentId")
        public String deploymentId;

        /**
         * <p>The instance ID of the deployment running instance. This value corresponds to the DeploymentInstanceId request parameter in the log and TaskManager query operations.</p>
         * 
         * <strong>example:</strong>
         * <p>7db678957dc449aab0086b931c9f8218</p>
         */
        @NameInMap("DeploymentInstanceId")
        public String deploymentInstanceId;

        /**
         * <p>The relative path for dirty data storage in this run, excluding the storage service domain name. A value of null indicates that no dirty data path exists.</p>
         * 
         * <strong>example:</strong>
         * <p>dirty-data/7333610201479808/7db678957dc449aab0086b931c9f8218/error.log</p>
         */
        @NameInMap("ErrorDataPath")
        public String errorDataPath;

        /**
         * <p>The start time of this run. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-15 13:46:26</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The running instance status returned by the engine, such as RUNNING, FINISHED, and TRANSITIONING. This status uses a different enumeration from the TaskStatusEnum returned by the GetStreamTask operation.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("State")
        public String state;

        public static ListStreamInstanceRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListStreamInstanceRecordsResponseBodyData self = new ListStreamInstanceRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListStreamInstanceRecordsResponseBodyData setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public String getDeploymentId() {
            return this.deploymentId;
        }

        public ListStreamInstanceRecordsResponseBodyData setDeploymentInstanceId(String deploymentInstanceId) {
            this.deploymentInstanceId = deploymentInstanceId;
            return this;
        }
        public String getDeploymentInstanceId() {
            return this.deploymentInstanceId;
        }

        public ListStreamInstanceRecordsResponseBodyData setErrorDataPath(String errorDataPath) {
            this.errorDataPath = errorDataPath;
            return this;
        }
        public String getErrorDataPath() {
            return this.errorDataPath;
        }

        public ListStreamInstanceRecordsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListStreamInstanceRecordsResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
