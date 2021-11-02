// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SyncMerchantInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public SyncMerchantInfoResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    public static SyncMerchantInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncMerchantInfoResponseBody self = new SyncMerchantInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncMerchantInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncMerchantInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncMerchantInfoResponseBody setModel(SyncMerchantInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public SyncMerchantInfoResponseBodyModel getModel() {
        return this.model;
    }

    public SyncMerchantInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SyncMerchantInfoResponseBodyModel extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Url")
        public String url;

        public static SyncMerchantInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            SyncMerchantInfoResponseBodyModel self = new SyncMerchantInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public SyncMerchantInfoResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SyncMerchantInfoResponseBodyModel setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public SyncMerchantInfoResponseBodyModel setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
