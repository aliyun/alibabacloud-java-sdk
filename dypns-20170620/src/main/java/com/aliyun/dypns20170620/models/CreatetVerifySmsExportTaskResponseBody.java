// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreatetVerifySmsExportTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreatetVerifySmsExportTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2E7CA885-8D97-C497-A02C-2D31214D3285</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreatetVerifySmsExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatetVerifySmsExportTaskResponseBody self = new CreatetVerifySmsExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatetVerifySmsExportTaskResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreatetVerifySmsExportTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatetVerifySmsExportTaskResponseBody setData(CreatetVerifySmsExportTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatetVerifySmsExportTaskResponseBodyData getData() {
        return this.data;
    }

    public CreatetVerifySmsExportTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatetVerifySmsExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatetVerifySmsExportTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatetVerifySmsExportTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static CreatetVerifySmsExportTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatetVerifySmsExportTaskResponseBodyData self = new CreatetVerifySmsExportTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatetVerifySmsExportTaskResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
