// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIProjectConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDIProjectConfigResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDIProjectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDIProjectConfigResponseBody self = new ListDIProjectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDIProjectConfigResponseBody setData(ListDIProjectConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDIProjectConfigResponseBodyData getData() {
        return this.data;
    }

    public ListDIProjectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDIProjectConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDIProjectConfigResponseBodyData extends TeaModel {
        @NameInMap("Config")
        public String config;

        public static ListDIProjectConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDIProjectConfigResponseBodyData self = new ListDIProjectConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDIProjectConfigResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

}
