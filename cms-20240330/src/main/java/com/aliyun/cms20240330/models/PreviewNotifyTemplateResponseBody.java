// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PreviewNotifyTemplateResponseBody extends TeaModel {
    @NameInMap("data")
    public PreviewNotifyTemplateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("msg")
    public String msg;

    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>452faed9-ab3b-4340-8a92-bc7d9b98f17a</p>
     */
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("failed")
        public java.util.Map<String, ?> failed;

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
