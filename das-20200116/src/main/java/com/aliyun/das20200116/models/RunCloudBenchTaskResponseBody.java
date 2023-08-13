// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class RunCloudBenchTaskResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information, including the error codes and the number of returned entries.</p>
     */
    @NameInMap("Data")
    public RunCloudBenchTaskResponseBodyData data;

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
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public String success;

    public static RunCloudBenchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCloudBenchTaskResponseBody self = new RunCloudBenchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCloudBenchTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunCloudBenchTaskResponseBody setData(RunCloudBenchTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunCloudBenchTaskResponseBodyData getData() {
        return this.data;
    }

    public RunCloudBenchTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunCloudBenchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCloudBenchTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class RunCloudBenchTaskResponseBodyDataPreCheckItem extends TeaModel {
        /**
         * <p>The HTTP status code returned.</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The detailed information of the check item.</p>
         */
        @NameInMap("Details")
        public String details;

        /**
         * <p>The returned message.</p>
         * <br>
         * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the check item. Valid values:</p>
         * <br>
         * <p>* **SqlArchiveStatusChecker**: checks whether SQL Explorer is available.</p>
         * <p>* **BenchClientEnvChecker**: checks whether the runtime environment for programs on the stress testing client is available.</p>
         * <p>* **SpecChecker**: checks whether the destination instance type and the instance type of the stress testing client support this API operation.</p>
         * <p>* **SourceInstanceChecker**: checks whether the account of the source instance is available and whether the source instance is connected to the destination instance.</p>
         * <p>* **BenchTargetChecker**: checks whether the account of the destination instance is available and whether the source instance is connected to the destination instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The sequence number of the check item. Valid values: **0** to **10**.</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **SUCCESS**: The task is successful.</p>
         * <p>*   **IGNORED**: The task is ignored.</p>
         * <p>*   **RUNNING**: The task is running.</p>
         * <p>*   **EXCEPTION**: An error occurred.</p>
         */
        @NameInMap("Status")
        public String status;

        public static RunCloudBenchTaskResponseBodyDataPreCheckItem build(java.util.Map<String, ?> map) throws Exception {
            RunCloudBenchTaskResponseBodyDataPreCheckItem self = new RunCloudBenchTaskResponseBodyDataPreCheckItem();
            return TeaModel.build(map, self);
        }

        public RunCloudBenchTaskResponseBodyDataPreCheckItem setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public RunCloudBenchTaskResponseBodyDataPreCheckItem setDetails(String details) {
            this.details = details;
            return this;
        }
        public String getDetails() {
            return this.details;
        }

        public RunCloudBenchTaskResponseBodyDataPreCheckItem setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RunCloudBenchTaskResponseBodyDataPreCheckItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RunCloudBenchTaskResponseBodyDataPreCheckItem setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public RunCloudBenchTaskResponseBodyDataPreCheckItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class RunCloudBenchTaskResponseBodyData extends TeaModel {
        @NameInMap("PreCheckItem")
        public java.util.List<RunCloudBenchTaskResponseBodyDataPreCheckItem> preCheckItem;

        public static RunCloudBenchTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunCloudBenchTaskResponseBodyData self = new RunCloudBenchTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunCloudBenchTaskResponseBodyData setPreCheckItem(java.util.List<RunCloudBenchTaskResponseBodyDataPreCheckItem> preCheckItem) {
            this.preCheckItem = preCheckItem;
            return this;
        }
        public java.util.List<RunCloudBenchTaskResponseBodyDataPreCheckItem> getPreCheckItem() {
            return this.preCheckItem;
        }

    }

}
