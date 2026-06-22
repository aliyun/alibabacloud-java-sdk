// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckDirectSendMessageSampleResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code of the request.</p>
     * <ul>
     * <li><p><code>OK</code> indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://www.alibabacloud.com/help/zh/cams/latest/api-error-codes">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public CheckDirectSendMessageSampleResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Use this ID to trace logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The category of the WhatsApp template. Valid values:</p>
         * <ul>
         * <li><p><strong>UTILITY</strong>: A template related to a specific, agreed-upon transaction.</p>
         * </li>
         * <li><p><strong>MARKETING</strong>: A template for promotional or marketing purposes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Whether the validation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The validation succeeded.</p>
         * </li>
         * <li><p>false: The validation failed.</p>
         * </li>
         * </ul>
         * 
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
