// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappBindWabaResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).</p>
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
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
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
         */
        @NameInMap("CustSpaceId")
        public String custSpaceId;

        /**
         * <p>The ID of the WhatsApp Business account.</p>
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
