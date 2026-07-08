// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptInfoResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetPptInfoResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>错误消息</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPptInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPptInfoResponseBody self = new GetPptInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPptInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPptInfoResponseBody setData(GetPptInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPptInfoResponseBodyData getData() {
        return this.data;
    }

    public GetPptInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPptInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPptInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPptInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPptInfoResponseBodyData extends TeaModel {
        /**
         * <p>Download links for the exported files.</p>
         */
        @NameInMap("ExportFileLink")
        public java.util.List<String> exportFileLink;

        /**
         * <p>The ID of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxx-xx</p>
         */
        @NameInMap("ExportTaskId")
        public String exportTaskId;

        /**
         * <p>The URL of the cover image for the PPT artifact.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://a.com/xxx.jpeg">http://a.com/xxx.jpeg</a></p>
         */
        @NameInMap("PptArtifactCover")
        public String pptArtifactCover;

        /**
         * <p>The ID of the PPT artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>5423431</p>
         */
        @NameInMap("PptArtifactId")
        public String pptArtifactId;

        /**
         * <p>The ID of the PPT process.</p>
         * 
         * <strong>example:</strong>
         * <p>11231232</p>
         */
        @NameInMap("PptProcessId")
        public String pptProcessId;

        /**
         * <p>The query for the PPT task.</p>
         * 
         * <strong>example:</strong>
         * <p>关于班会主题的PPT</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxx-xx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetPptInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPptInfoResponseBodyData self = new GetPptInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPptInfoResponseBodyData setExportFileLink(java.util.List<String> exportFileLink) {
            this.exportFileLink = exportFileLink;
            return this;
        }
        public java.util.List<String> getExportFileLink() {
            return this.exportFileLink;
        }

        public GetPptInfoResponseBodyData setExportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }
        public String getExportTaskId() {
            return this.exportTaskId;
        }

        public GetPptInfoResponseBodyData setPptArtifactCover(String pptArtifactCover) {
            this.pptArtifactCover = pptArtifactCover;
            return this;
        }
        public String getPptArtifactCover() {
            return this.pptArtifactCover;
        }

        public GetPptInfoResponseBodyData setPptArtifactId(String pptArtifactId) {
            this.pptArtifactId = pptArtifactId;
            return this;
        }
        public String getPptArtifactId() {
            return this.pptArtifactId;
        }

        public GetPptInfoResponseBodyData setPptProcessId(String pptProcessId) {
            this.pptProcessId = pptProcessId;
            return this;
        }
        public String getPptProcessId() {
            return this.pptProcessId;
        }

        public GetPptInfoResponseBodyData setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public GetPptInfoResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
