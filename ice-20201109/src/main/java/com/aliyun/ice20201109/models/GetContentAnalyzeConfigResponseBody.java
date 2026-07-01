// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetContentAnalyzeConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration for Intelligent Content Analysis.</p>
     */
    @NameInMap("ContentAnalyzeConfig")
    public GetContentAnalyzeConfigResponseBodyContentAnalyzeConfig contentAnalyzeConfig;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>Specifies if Intelligent Content Analysis starts automatically after a Media Asset is registered.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enabled.</p>
         * </li>
         * <li><p><code>false</code>: Disabled. (default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Auto")
        public Boolean auto;

        /**
         * <p>The repository type for saving analysis results. This parameter is valid only when <code>Auto</code> is set to <code>true</code>. The default is an empty string.</p>
         * <ul>
         * <li><p><code>TEXT</code>: Label</p>
         * </li>
         * <li><p><code>FACE</code>: Face</p>
         * </li>
         * <li><p><code>DNA</code>: Image DNA</p>
         * </li>
         * </ul>
         * <p>You can specify multiple values, separated by commas (,). If this parameter is left empty, the analysis results are not saved to any search repository and cannot be used for content search.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT,FACE</p>
         */
        @NameInMap("SaveType")
        public String saveType;

        /**
         * <p>The ID of the Intelligent Content Analysis template. Each template includes the following AI capabilities:</p>
         * <ul>
         * <li><p><code>S00000101-100040</code>: Text Recognition</p>
         * </li>
         * <li><p><code>S00000101-100060</code>: Video Classification and Face Recognition</p>
         * </li>
         * <li><p><code>S00000101-100070</code>: Text Recognition, Video Classification, and Face Recognition</p>
         * </li>
         * </ul>
         * 
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
