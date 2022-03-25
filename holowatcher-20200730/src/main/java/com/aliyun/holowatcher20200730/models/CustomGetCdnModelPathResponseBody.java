// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CustomGetCdnModelPathResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObj")
    public CustomGetCdnModelPathResponseBodyResultObj resultObj;

    @NameInMap("Success")
    public Boolean success;

    public static CustomGetCdnModelPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CustomGetCdnModelPathResponseBody self = new CustomGetCdnModelPathResponseBody();
        return TeaModel.build(map, self);
    }

    public CustomGetCdnModelPathResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CustomGetCdnModelPathResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CustomGetCdnModelPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CustomGetCdnModelPathResponseBody setResultObj(CustomGetCdnModelPathResponseBodyResultObj resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public CustomGetCdnModelPathResponseBodyResultObj getResultObj() {
        return this.resultObj;
    }

    public CustomGetCdnModelPathResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CustomGetCdnModelPathResponseBodyResultObj extends TeaModel {
        @NameInMap("Path")
        public String path;

        public static CustomGetCdnModelPathResponseBodyResultObj build(java.util.Map<String, ?> map) throws Exception {
            CustomGetCdnModelPathResponseBodyResultObj self = new CustomGetCdnModelPathResponseBodyResultObj();
            return TeaModel.build(map, self);
        }

        public CustomGetCdnModelPathResponseBodyResultObj setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
