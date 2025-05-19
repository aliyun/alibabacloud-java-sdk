// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetLineSplitResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resource")
    public GetLineSplitResultResponseBodyResource resource;

    @NameInMap("Success")
    public Boolean success;

    public static GetLineSplitResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLineSplitResultResponseBody self = new GetLineSplitResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLineSplitResultResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetLineSplitResultResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetLineSplitResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLineSplitResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLineSplitResultResponseBody setResource(GetLineSplitResultResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public GetLineSplitResultResponseBodyResource getResource() {
        return this.resource;
    }

    public GetLineSplitResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLineSplitResultResponseBodyResource extends TeaModel {
        @NameInMap("AdditionalRegex")
        public String additionalRegex;

        @NameInMap("EndSplitSymbol")
        public String endSplitSymbol;

        @NameInMap("Regex")
        public String regex;

        @NameInMap("RegexSplitResult")
        public java.util.List<String> regexSplitResult;

        @NameInMap("StartSplitSymbol")
        public String startSplitSymbol;

        @NameInMap("StartSplitSymbolIndex")
        public Long startSplitSymbolIndex;

        public static GetLineSplitResultResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            GetLineSplitResultResponseBodyResource self = new GetLineSplitResultResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public GetLineSplitResultResponseBodyResource setAdditionalRegex(String additionalRegex) {
            this.additionalRegex = additionalRegex;
            return this;
        }
        public String getAdditionalRegex() {
            return this.additionalRegex;
        }

        public GetLineSplitResultResponseBodyResource setEndSplitSymbol(String endSplitSymbol) {
            this.endSplitSymbol = endSplitSymbol;
            return this;
        }
        public String getEndSplitSymbol() {
            return this.endSplitSymbol;
        }

        public GetLineSplitResultResponseBodyResource setRegex(String regex) {
            this.regex = regex;
            return this;
        }
        public String getRegex() {
            return this.regex;
        }

        public GetLineSplitResultResponseBodyResource setRegexSplitResult(java.util.List<String> regexSplitResult) {
            this.regexSplitResult = regexSplitResult;
            return this;
        }
        public java.util.List<String> getRegexSplitResult() {
            return this.regexSplitResult;
        }

        public GetLineSplitResultResponseBodyResource setStartSplitSymbol(String startSplitSymbol) {
            this.startSplitSymbol = startSplitSymbol;
            return this;
        }
        public String getStartSplitSymbol() {
            return this.startSplitSymbol;
        }

        public GetLineSplitResultResponseBodyResource setStartSplitSymbolIndex(Long startSplitSymbolIndex) {
            this.startSplitSymbolIndex = startSplitSymbolIndex;
            return this;
        }
        public Long getStartSplitSymbolIndex() {
            return this.startSplitSymbolIndex;
        }

    }

}
