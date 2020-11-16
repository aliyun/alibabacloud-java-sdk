// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopPolicysResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Results")
    @Validation(required = true)
    public java.util.List<ModifyDesktopPolicysResponseResults> results;

    public static ModifyDesktopPolicysResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopPolicysResponse self = new ModifyDesktopPolicysResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopPolicysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDesktopPolicysResponse setResults(java.util.List<ModifyDesktopPolicysResponseResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ModifyDesktopPolicysResponseResults> getResults() {
        return this.results;
    }

    public static class ModifyDesktopPolicysResponseResults extends TeaModel {
        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        @NameInMap("Success")
        @Validation(required = true)
        public String success;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static ModifyDesktopPolicysResponseResults build(java.util.Map<String, ?> map) throws Exception {
            ModifyDesktopPolicysResponseResults self = new ModifyDesktopPolicysResponseResults();
            return TeaModel.build(map, self);
        }

        public ModifyDesktopPolicysResponseResults setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public ModifyDesktopPolicysResponseResults setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

        public ModifyDesktopPolicysResponseResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModifyDesktopPolicysResponseResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
