// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SyncMerchantInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Model")
    @Validation(required = true)
    public SyncMerchantInfoResponseModel model;

    public static SyncMerchantInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncMerchantInfoResponse self = new SyncMerchantInfoResponse();
        return TeaModel.build(map, self);
    }

    public SyncMerchantInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncMerchantInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncMerchantInfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncMerchantInfoResponse setModel(SyncMerchantInfoResponseModel model) {
        this.model = model;
        return this;
    }
    public SyncMerchantInfoResponseModel getModel() {
        return this.model;
    }

    public static class SyncMerchantInfoResponseModel extends TeaModel {
        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static SyncMerchantInfoResponseModel build(java.util.Map<String, ?> map) throws Exception {
            SyncMerchantInfoResponseModel self = new SyncMerchantInfoResponseModel();
            return TeaModel.build(map, self);
        }

        public SyncMerchantInfoResponseModel setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public SyncMerchantInfoResponseModel setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public SyncMerchantInfoResponseModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
