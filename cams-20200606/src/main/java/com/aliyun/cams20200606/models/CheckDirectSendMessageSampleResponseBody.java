// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckDirectSendMessageSampleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CheckDirectSendMessageSampleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckDirectSendMessageSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDirectSendMessageSampleResponseBody self = new CheckDirectSendMessageSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDirectSendMessageSampleResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CheckDirectSendMessageSampleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckDirectSendMessageSampleResponseBody setData(CheckDirectSendMessageSampleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckDirectSendMessageSampleResponseBodyData getData() {
        return this.data;
    }

    public CheckDirectSendMessageSampleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckDirectSendMessageSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDirectSendMessageSampleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckDirectSendMessageSampleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static CheckDirectSendMessageSampleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckDirectSendMessageSampleResponseBodyData self = new CheckDirectSendMessageSampleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckDirectSendMessageSampleResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CheckDirectSendMessageSampleResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
