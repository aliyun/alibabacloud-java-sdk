// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetApiPathFieldTemplateResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetApiPathFieldTemplateResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetApiPathFieldTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiPathFieldTemplateResponseBody self = new GetApiPathFieldTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiPathFieldTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApiPathFieldTemplateResponseBody setData(GetApiPathFieldTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetApiPathFieldTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetApiPathFieldTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApiPathFieldTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApiPathFieldTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The description text of the field template.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAI chat completion API..</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The set of fields defined by the field template, grouped by mapping key. Each group contains a set of template field items.</p>
         */
        @NameInMap("fieldPaths")
        public java.util.Map<String, java.util.List<DataFieldPathsValue>> fieldPaths;

        /**
         * <p>The API request path corresponding to the field template.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The API protocol applicable to the field template, such as openai.</p>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The name of the field template.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAI Chat Completions</p>
         */
        @NameInMap("templateName")
        public String templateName;

        public static GetApiPathFieldTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApiPathFieldTemplateResponseBodyData self = new GetApiPathFieldTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApiPathFieldTemplateResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApiPathFieldTemplateResponseBodyData setFieldPaths(java.util.Map<String, java.util.List<DataFieldPathsValue>> fieldPaths) {
            this.fieldPaths = fieldPaths;
            return this;
        }
        public java.util.Map<String, java.util.List<DataFieldPathsValue>> getFieldPaths() {
            return this.fieldPaths;
        }

        public GetApiPathFieldTemplateResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetApiPathFieldTemplateResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetApiPathFieldTemplateResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
