// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopPolicysResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<ModifyDesktopPolicysResponseBodyResults> results;

    public static ModifyDesktopPolicysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopPolicysResponseBody self = new ModifyDesktopPolicysResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopPolicysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDesktopPolicysResponseBody setResults(java.util.List<ModifyDesktopPolicysResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ModifyDesktopPolicysResponseBodyResults> getResults() {
        return this.results;
    }

    public static class ModifyDesktopPolicysResponseBodyResults extends TeaModel {
        @NameInMap("Success")
        public String success;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("DesktopId")
        public String desktopId;

        public static ModifyDesktopPolicysResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ModifyDesktopPolicysResponseBodyResults self = new ModifyDesktopPolicysResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ModifyDesktopPolicysResponseBodyResults setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

        public ModifyDesktopPolicysResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyDesktopPolicysResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ModifyDesktopPolicysResponseBodyResults setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

    }

}
