// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunContractExtractResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public RunContractExtractResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Long httpStatusCode;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C844BE6B-33A9-5AC4-A1AE-97B131849E0F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RunContractExtractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunContractExtractResponseBody self = new RunContractExtractResponseBody();
        return TeaModel.build(map, self);
    }

    public RunContractExtractResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunContractExtractResponseBody setData(RunContractExtractResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunContractExtractResponseBodyData getData() {
        return this.data;
    }

    public RunContractExtractResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RunContractExtractResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunContractExtractResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunContractExtractResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RunContractExtractResponseBodyDataExtractResultValue extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HT-2022-0001</p>
         */
        @NameInMap("data")
        public String data;

        @NameInMap("originalText")
        public String originalText;

        public static RunContractExtractResponseBodyDataExtractResultValue build(java.util.Map<String, ?> map) throws Exception {
            RunContractExtractResponseBodyDataExtractResultValue self = new RunContractExtractResponseBodyDataExtractResultValue();
            return TeaModel.build(map, self);
        }

        public RunContractExtractResponseBodyDataExtractResultValue setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public RunContractExtractResponseBodyDataExtractResultValue setOriginalText(String originalText) {
            this.originalText = originalText;
            return this;
        }
        public String getOriginalText() {
            return this.originalText;
        }

    }

    public static class RunContractExtractResponseBodyDataExtractResult extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("extractItem")
        public String extractItem;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("option")
        public String option;

        @NameInMap("value")
        public java.util.List<RunContractExtractResponseBodyDataExtractResultValue> value;

        public static RunContractExtractResponseBodyDataExtractResult build(java.util.Map<String, ?> map) throws Exception {
            RunContractExtractResponseBodyDataExtractResult self = new RunContractExtractResponseBodyDataExtractResult();
            return TeaModel.build(map, self);
        }

        public RunContractExtractResponseBodyDataExtractResult setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public RunContractExtractResponseBodyDataExtractResult setExtractItem(String extractItem) {
            this.extractItem = extractItem;
            return this;
        }
        public String getExtractItem() {
            return this.extractItem;
        }

        public RunContractExtractResponseBodyDataExtractResult setOption(String option) {
            this.option = option;
            return this;
        }
        public String getOption() {
            return this.option;
        }

        public RunContractExtractResponseBodyDataExtractResult setValue(java.util.List<RunContractExtractResponseBodyDataExtractResultValue> value) {
            this.value = value;
            return this;
        }
        public java.util.List<RunContractExtractResponseBodyDataExtractResultValue> getValue() {
            return this.value;
        }

    }

    public static class RunContractExtractResponseBodyData extends TeaModel {
        @NameInMap("contractText")
        public String contractText;

        @NameInMap("extractResult")
        public java.util.List<RunContractExtractResponseBodyDataExtractResult> extractResult;

        public static RunContractExtractResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunContractExtractResponseBodyData self = new RunContractExtractResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunContractExtractResponseBodyData setContractText(String contractText) {
            this.contractText = contractText;
            return this;
        }
        public String getContractText() {
            return this.contractText;
        }

        public RunContractExtractResponseBodyData setExtractResult(java.util.List<RunContractExtractResponseBodyDataExtractResult> extractResult) {
            this.extractResult = extractResult;
            return this;
        }
        public java.util.List<RunContractExtractResponseBodyDataExtractResult> getExtractResult() {
            return this.extractResult;
        }

    }

}
