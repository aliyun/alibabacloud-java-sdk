// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptArtifactExportResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPptArtifactExportResultResponseBodyData data;

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

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPptArtifactExportResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPptArtifactExportResultResponseBody self = new GetPptArtifactExportResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPptArtifactExportResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPptArtifactExportResultResponseBody setData(GetPptArtifactExportResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPptArtifactExportResultResponseBodyData getData() {
        return this.data;
    }

    public GetPptArtifactExportResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPptArtifactExportResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPptArtifactExportResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPptArtifactExportResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPptArtifactExportResultResponseBodyData extends TeaModel {
        @NameInMap("ExportFileLink")
        public java.util.List<String> exportFileLink;

        public static GetPptArtifactExportResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPptArtifactExportResultResponseBodyData self = new GetPptArtifactExportResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPptArtifactExportResultResponseBodyData setExportFileLink(java.util.List<String> exportFileLink) {
            this.exportFileLink = exportFileLink;
            return this;
        }
        public java.util.List<String> getExportFileLink() {
            return this.exportFileLink;
        }

    }

}
