// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetContentAnalyzeConfigResponseBody extends TeaModel {
    @NameInMap("ContentAnalyzeConfig")
    public GetContentAnalyzeConfigResponseBodyContentAnalyzeConfig contentAnalyzeConfig;

    /**
     * <strong>example:</strong>
     * <p>31FEC819-2344-5771-9366-9172DB0D26C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetContentAnalyzeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContentAnalyzeConfigResponseBody self = new GetContentAnalyzeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContentAnalyzeConfigResponseBody setContentAnalyzeConfig(GetContentAnalyzeConfigResponseBodyContentAnalyzeConfig contentAnalyzeConfig) {
        this.contentAnalyzeConfig = contentAnalyzeConfig;
        return this;
    }
    public GetContentAnalyzeConfigResponseBodyContentAnalyzeConfig getContentAnalyzeConfig() {
        return this.contentAnalyzeConfig;
    }

    public GetContentAnalyzeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetContentAnalyzeConfigResponseBodyContentAnalyzeConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Auto")
        public Boolean auto;

        /**
         * <strong>example:</strong>
         * <p>TEXT,FACE</p>
         */
        @NameInMap("SaveType")
        public String saveType;

        /**
         * <strong>example:</strong>
         * <p>S00000101-100070</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static GetContentAnalyzeConfigResponseBodyContentAnalyzeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetContentAnalyzeConfigResponseBodyContentAnalyzeConfig self = new GetContentAnalyzeConfigResponseBodyContentAnalyzeConfig();
            return TeaModel.build(map, self);
        }

        public GetContentAnalyzeConfigResponseBodyContentAnalyzeConfig setAuto(Boolean auto) {
            this.auto = auto;
            return this;
        }
        public Boolean getAuto() {
            return this.auto;
        }

        public GetContentAnalyzeConfigResponseBodyContentAnalyzeConfig setSaveType(String saveType) {
            this.saveType = saveType;
            return this;
        }
        public String getSaveType() {
            return this.saveType;
        }

        public GetContentAnalyzeConfigResponseBodyContentAnalyzeConfig setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
