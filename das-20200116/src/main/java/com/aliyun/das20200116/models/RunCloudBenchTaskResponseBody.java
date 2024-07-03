// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class RunCloudBenchTaskResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <blockquote>
     * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The detailed information of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Data&quot;: { &quot;total&quot;: 1, &quot;list&quot;:[...] }, &quot;Code&quot;: 200, &quot;Success&quot;: true }</p>
         */
        @NameInMap("Details")
        public String details;

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the check item. Valid values:</p>
         * <ul>
         * <li><strong>SqlArchiveStatusChecker</strong>: checks whether SQL Explorer is available.</li>
         * <li><strong>BenchClientEnvChecker</strong>: checks whether the runtime environment for programs on the stress testing client is available.</li>
         * <li><strong>SpecChecker</strong>: checks whether the destination instance type and the instance type of the stress testing client support this API operation.</li>
         * <li><strong>SourceInstanceChecker</strong>: checks whether the account of the source instance is available and whether the source instance is connected to the destination instance.</li>
         * <li><strong>BenchTargetChecker</strong>: checks whether the account of the destination instance is available and whether the source instance is connected to the destination instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BenchTargetChecker</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The sequence number of the check item. Valid values: <strong>0</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>SUCCESS</strong>: The task is successful.</li>
         * <li><strong>IGNORED</strong>: The task is ignored.</li>
         * <li><strong>RUNNING</strong>: The task is running.</li>
         * <li><strong>EXCEPTION</strong>: An error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
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
