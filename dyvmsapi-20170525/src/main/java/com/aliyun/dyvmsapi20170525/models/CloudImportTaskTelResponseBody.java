// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudImportTaskTelResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudImportTaskTelResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudImportTaskTelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudImportTaskTelResponseBody self = new CloudImportTaskTelResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudImportTaskTelResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudImportTaskTelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudImportTaskTelResponseBody setData(CloudImportTaskTelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudImportTaskTelResponseBodyData getData() {
        return this.data;
    }

    public CloudImportTaskTelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudImportTaskTelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudImportTaskTelResponseBodyData extends TeaModel {
        /**
         * <p>批次Id</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>请求号码总数</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ImportTotal")
        public String importTotal;

        /**
         * <p>非法号码数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InvalidTotal")
        public String invalidTotal;

        /**
         * <p>成功导入号码数</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SuccessTotal")
        public String successTotal;

        /**
         * <p>任务Id</p>
         * 
         * <strong>example:</strong>
         * <p>13322333</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CloudImportTaskTelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudImportTaskTelResponseBodyData self = new CloudImportTaskTelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudImportTaskTelResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public CloudImportTaskTelResponseBodyData setImportTotal(String importTotal) {
            this.importTotal = importTotal;
            return this;
        }
        public String getImportTotal() {
            return this.importTotal;
        }

        public CloudImportTaskTelResponseBodyData setInvalidTotal(String invalidTotal) {
            this.invalidTotal = invalidTotal;
            return this;
        }
        public String getInvalidTotal() {
            return this.invalidTotal;
        }

        public CloudImportTaskTelResponseBodyData setSuccessTotal(String successTotal) {
            this.successTotal = successTotal;
            return this;
        }
        public String getSuccessTotal() {
            return this.successTotal;
        }

        public CloudImportTaskTelResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
