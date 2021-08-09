// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIProjectConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public ListDIProjectConfigResponseData data;

    public static ListDIProjectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDIProjectConfigResponse self = new ListDIProjectConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListDIProjectConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDIProjectConfigResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDIProjectConfigResponse setData(ListDIProjectConfigResponseData data) {
        this.data = data;
        return this;
    }
    public ListDIProjectConfigResponseData getData() {
        return this.data;
    }

    public static class ListDIProjectConfigResponseData extends TeaModel {
        @NameInMap("Config")
        @Validation(required = true)
        public String config;

        public static ListDIProjectConfigResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDIProjectConfigResponseData self = new ListDIProjectConfigResponseData();
            return TeaModel.build(map, self);
        }

        public ListDIProjectConfigResponseData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

}
