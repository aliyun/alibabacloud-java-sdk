// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CustomFindOrderStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObj")
    public CustomFindOrderStatusResponseBodyResultObj resultObj;

    @NameInMap("Success")
    public Boolean success;

    public static CustomFindOrderStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CustomFindOrderStatusResponseBody self = new CustomFindOrderStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CustomFindOrderStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CustomFindOrderStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CustomFindOrderStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CustomFindOrderStatusResponseBody setResultObj(CustomFindOrderStatusResponseBodyResultObj resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public CustomFindOrderStatusResponseBodyResultObj getResultObj() {
        return this.resultObj;
    }

    public CustomFindOrderStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CustomFindOrderStatusResponseBodyResultObj extends TeaModel {
        @NameInMap("Status")
        public String status;

        public static CustomFindOrderStatusResponseBodyResultObj build(java.util.Map<String, ?> map) throws Exception {
            CustomFindOrderStatusResponseBodyResultObj self = new CustomFindOrderStatusResponseBodyResultObj();
            return TeaModel.build(map, self);
        }

        public CustomFindOrderStatusResponseBodyResultObj setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
