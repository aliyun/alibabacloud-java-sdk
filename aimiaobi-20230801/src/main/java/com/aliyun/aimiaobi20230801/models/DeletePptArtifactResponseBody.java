// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeletePptArtifactResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeletePptArtifactResponseBodyData data;

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

    public static DeletePptArtifactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePptArtifactResponseBody self = new DeletePptArtifactResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePptArtifactResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeletePptArtifactResponseBody setData(DeletePptArtifactResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeletePptArtifactResponseBodyData getData() {
        return this.data;
    }

    public DeletePptArtifactResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeletePptArtifactResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeletePptArtifactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePptArtifactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeletePptArtifactResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5233498</p>
         */
        @NameInMap("PptArtifactId")
        public Integer pptArtifactId;

        public static DeletePptArtifactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeletePptArtifactResponseBodyData self = new DeletePptArtifactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeletePptArtifactResponseBodyData setPptArtifactId(Integer pptArtifactId) {
            this.pptArtifactId = pptArtifactId;
            return this;
        }
        public Integer getPptArtifactId() {
            return this.pptArtifactId;
        }

    }

}
