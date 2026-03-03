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
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Details")
        public String details;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Order")
        public Integer order;

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
