// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIProjectConfigResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public UpdateDIProjectConfigResponseBodyData data;

    public static UpdateDIProjectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIProjectConfigResponseBody self = new UpdateDIProjectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDIProjectConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateDIProjectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDIProjectConfigResponseBody setData(UpdateDIProjectConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDIProjectConfigResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateDIProjectConfigResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        public static UpdateDIProjectConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIProjectConfigResponseBodyData self = new UpdateDIProjectConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDIProjectConfigResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
