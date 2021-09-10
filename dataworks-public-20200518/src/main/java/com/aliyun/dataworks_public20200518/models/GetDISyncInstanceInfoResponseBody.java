// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncInstanceInfoResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetDISyncInstanceInfoResponseBodyData data;

    public static GetDISyncInstanceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncInstanceInfoResponseBody self = new GetDISyncInstanceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDISyncInstanceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDISyncInstanceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDISyncInstanceInfoResponseBody setData(GetDISyncInstanceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDISyncInstanceInfoResponseBodyData getData() {
        return this.data;
    }

    public static class GetDISyncInstanceInfoResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        public static GetDISyncInstanceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncInstanceInfoResponseBodyData self = new GetDISyncInstanceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDISyncInstanceInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncInstanceInfoResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDISyncInstanceInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
