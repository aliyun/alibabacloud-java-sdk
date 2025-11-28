// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateBroadcastStickerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateBroadcastStickerResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7239F9E5-A4DB-55BA-B701-0CE47DBDB0A8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateBroadcastStickerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBroadcastStickerResponseBody self = new CreateBroadcastStickerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBroadcastStickerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateBroadcastStickerResponseBody setData(CreateBroadcastStickerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateBroadcastStickerResponseBodyData getData() {
        return this.data;
    }

    public CreateBroadcastStickerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateBroadcastStickerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateBroadcastStickerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBroadcastStickerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateBroadcastStickerResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>M1lhKArheOyYdeYybDFqS1-Q</p>
         */
        @NameInMap("id")
        public String id;

        public static CreateBroadcastStickerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateBroadcastStickerResponseBodyData self = new CreateBroadcastStickerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateBroadcastStickerResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
