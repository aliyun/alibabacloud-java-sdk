// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIProjectConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public UpdateDIProjectConfigResponseData data;

    public static UpdateDIProjectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIProjectConfigResponse self = new UpdateDIProjectConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDIProjectConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDIProjectConfigResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateDIProjectConfigResponse setData(UpdateDIProjectConfigResponseData data) {
        this.data = data;
        return this;
    }
    public UpdateDIProjectConfigResponseData getData() {
        return this.data;
    }

    public static class UpdateDIProjectConfigResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static UpdateDIProjectConfigResponseData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIProjectConfigResponseData self = new UpdateDIProjectConfigResponseData();
            return TeaModel.build(map, self);
        }

        public UpdateDIProjectConfigResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
