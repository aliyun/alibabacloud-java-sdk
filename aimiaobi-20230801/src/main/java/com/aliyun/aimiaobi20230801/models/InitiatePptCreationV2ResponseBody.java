// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InitiatePptCreationV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InitiatePptCreationV2ResponseBodyData data;

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

    public static InitiatePptCreationV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitiatePptCreationV2ResponseBody self = new InitiatePptCreationV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public InitiatePptCreationV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitiatePptCreationV2ResponseBody setData(InitiatePptCreationV2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InitiatePptCreationV2ResponseBodyData getData() {
        return this.data;
    }

    public InitiatePptCreationV2ResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public InitiatePptCreationV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitiatePptCreationV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitiatePptCreationV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InitiatePptCreationV2ResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>S1X5ecouBztZelaQ</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <strong>example:</strong>
         * <p>66b25058-d735-47e5-a534-5da93453d3df</p>
         */
        @NameInMap("ExportTaskId")
        public String exportTaskId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://a.com/xxx.png">http://a.com/xxx.png</a></p>
         */
        @NameInMap("PptArtifactCover")
        public String pptArtifactCover;

        /**
         * <strong>example:</strong>
         * <p>53059801</p>
         */
        @NameInMap("PptArtifactId")
        public String pptArtifactId;

        /**
         * <strong>example:</strong>
         * <p>8485143</p>
         */
        @NameInMap("PptProcessId")
        public String pptProcessId;

        /**
         * <strong>example:</strong>
         * <p>dBBGvT0Toje5887Qw+/IwwMNYfk=</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static InitiatePptCreationV2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitiatePptCreationV2ResponseBodyData self = new InitiatePptCreationV2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitiatePptCreationV2ResponseBodyData setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public InitiatePptCreationV2ResponseBodyData setExportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }
        public String getExportTaskId() {
            return this.exportTaskId;
        }

        public InitiatePptCreationV2ResponseBodyData setPptArtifactCover(String pptArtifactCover) {
            this.pptArtifactCover = pptArtifactCover;
            return this;
        }
        public String getPptArtifactCover() {
            return this.pptArtifactCover;
        }

        public InitiatePptCreationV2ResponseBodyData setPptArtifactId(String pptArtifactId) {
            this.pptArtifactId = pptArtifactId;
            return this;
        }
        public String getPptArtifactId() {
            return this.pptArtifactId;
        }

        public InitiatePptCreationV2ResponseBodyData setPptProcessId(String pptProcessId) {
            this.pptProcessId = pptProcessId;
            return this;
        }
        public String getPptProcessId() {
            return this.pptProcessId;
        }

        public InitiatePptCreationV2ResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
