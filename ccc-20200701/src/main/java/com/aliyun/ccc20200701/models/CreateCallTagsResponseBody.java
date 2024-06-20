// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCallTagsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<CreateCallTagsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCallTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCallTagsResponseBody self = new CreateCallTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCallTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCallTagsResponseBody setData(java.util.List<CreateCallTagsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateCallTagsResponseBodyData> getData() {
        return this.data;
    }

    public CreateCallTagsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateCallTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCallTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCallTagsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TagC</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <strong>example:</strong>
         * <p>CALL_TAG_NAME_DUPLICATED</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static CreateCallTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCallTagsResponseBodyData self = new CreateCallTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCallTagsResponseBodyData setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public CreateCallTagsResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
