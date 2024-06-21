// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappBindWabaResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <ul>
     * <li>A value of OK indicates that the call is successful.</li>
     * <li>Other values indicate that the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ChatappBindWabaResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChatappBindWabaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatappBindWabaResponseBody self = new ChatappBindWabaResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatappBindWabaResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ChatappBindWabaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChatappBindWabaResponseBody setData(ChatappBindWabaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChatappBindWabaResponseBodyData getData() {
        return this.data;
    }

    public ChatappBindWabaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChatappBindWabaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChatappBindWabaResponseBodyData extends TeaModel {
        /**
         * <p>The space ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>C02029392939939</p>
         */
        @NameInMap("CustSpaceId")
        public String custSpaceId;

        /**
         * <p>The ID of the WhatsApp Business account.</p>
         * 
         * <strong>example:</strong>
         * <p>2939828282</p>
         */
        @NameInMap("WabaId")
        public String wabaId;

        public static ChatappBindWabaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChatappBindWabaResponseBodyData self = new ChatappBindWabaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChatappBindWabaResponseBodyData setCustSpaceId(String custSpaceId) {
            this.custSpaceId = custSpaceId;
            return this;
        }
        public String getCustSpaceId() {
            return this.custSpaceId;
        }

        public ChatappBindWabaResponseBodyData setWabaId(String wabaId) {
            this.wabaId = wabaId;
            return this;
        }
        public String getWabaId() {
            return this.wabaId;
        }

    }

}
