// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms_export20211101.models;

import com.aliyun.tea.*;

public class CursorResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CursorResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CursorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CursorResponseBody self = new CursorResponseBody();
        return TeaModel.build(map, self);
    }

    public CursorResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CursorResponseBody setData(CursorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CursorResponseBodyData getData() {
        return this.data;
    }

    public CursorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CursorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CursorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CursorResponseBodyData extends TeaModel {
        @NameInMap("Cursor")
        public String cursor;

        public static CursorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CursorResponseBodyData self = new CursorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CursorResponseBodyData setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        public String getCursor() {
            return this.cursor;
        }

    }

}
