// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PreviewNotifyTemplateResponseBody extends TeaModel {
    /**
     * <p>The rendering result object, which contains two mappings: success for successfully rendered items and failed for items that failed to render.</p>
     */
    @NameInMap("data")
    public PreviewNotifyTemplateResponseBodyData data;

    /**
     * <p>The processing result message. The value is success if the request is successful, or an error message if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("msg")
    public String msg;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>452faed9-ab3b-4340-8a92-bc7d9b98f17a</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static PreviewNotifyTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewNotifyTemplateResponseBody self = new PreviewNotifyTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewNotifyTemplateResponseBody setData(PreviewNotifyTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PreviewNotifyTemplateResponseBodyData getData() {
        return this.data;
    }

    public PreviewNotifyTemplateResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public PreviewNotifyTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewNotifyTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PreviewNotifyTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The mapping of failed rendering results. The key is the template identifier, and the value is the cause of the failure, such as a template syntax error or a reference to an undefined variable.</p>
         */
        @NameInMap("failed")
        public java.util.Map<String, ?> failed;

        /**
         * <p>The mapping of successful rendering results. The key is the template identifier, which corresponds to templates[].key in the request, and the value is the rendered string content.</p>
         */
        @NameInMap("success")
        public java.util.Map<String, ?> success;

        public static PreviewNotifyTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PreviewNotifyTemplateResponseBodyData self = new PreviewNotifyTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PreviewNotifyTemplateResponseBodyData setFailed(java.util.Map<String, ?> failed) {
            this.failed = failed;
            return this;
        }
        public java.util.Map<String, ?> getFailed() {
            return this.failed;
        }

        public PreviewNotifyTemplateResponseBodyData setSuccess(java.util.Map<String, ?> success) {
            this.success = success;
            return this;
        }
        public java.util.Map<String, ?> getSuccess() {
            return this.success;
        }

    }

}
