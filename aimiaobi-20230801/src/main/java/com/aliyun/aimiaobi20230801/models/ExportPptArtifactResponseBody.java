// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportPptArtifactResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ExportPptArtifactResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>错误消息</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ExportPptArtifactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportPptArtifactResponseBody self = new ExportPptArtifactResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportPptArtifactResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportPptArtifactResponseBody setData(ExportPptArtifactResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportPptArtifactResponseBodyData getData() {
        return this.data;
    }

    public ExportPptArtifactResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportPptArtifactResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportPptArtifactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportPptArtifactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExportPptArtifactResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>adb8146b-146b-4206-bd40-19f591e85293</p>
         */
        @NameInMap("ExportTaskId")
        public String exportTaskId;

        public static ExportPptArtifactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportPptArtifactResponseBodyData self = new ExportPptArtifactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportPptArtifactResponseBodyData setExportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }
        public String getExportTaskId() {
            return this.exportTaskId;
        }

    }

}
