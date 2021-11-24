// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateAppTemplateConfigResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public UpdateAppTemplateConfigResponseBodyResult result;

    public static UpdateAppTemplateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppTemplateConfigResponseBody self = new UpdateAppTemplateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppTemplateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAppTemplateConfigResponseBody setResult(UpdateAppTemplateConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateAppTemplateConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateAppTemplateConfigResponseBodyResultConfigLogs extends TeaModel {
        // 日志标示
        @NameInMap("Code")
        public String code;

        // 日志内容
        @NameInMap("Message")
        public String message;

        public static UpdateAppTemplateConfigResponseBodyResultConfigLogs build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppTemplateConfigResponseBodyResultConfigLogs self = new UpdateAppTemplateConfigResponseBodyResultConfigLogs();
            return TeaModel.build(map, self);
        }

        public UpdateAppTemplateConfigResponseBodyResultConfigLogs setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateAppTemplateConfigResponseBodyResultConfigLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class UpdateAppTemplateConfigResponseBodyResult extends TeaModel {
        // 配置日志列表
        @NameInMap("ConfigLogs")
        public java.util.List<UpdateAppTemplateConfigResponseBodyResultConfigLogs> configLogs;

        public static UpdateAppTemplateConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppTemplateConfigResponseBodyResult self = new UpdateAppTemplateConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateAppTemplateConfigResponseBodyResult setConfigLogs(java.util.List<UpdateAppTemplateConfigResponseBodyResultConfigLogs> configLogs) {
            this.configLogs = configLogs;
            return this;
        }
        public java.util.List<UpdateAppTemplateConfigResponseBodyResultConfigLogs> getConfigLogs() {
            return this.configLogs;
        }

    }

}
