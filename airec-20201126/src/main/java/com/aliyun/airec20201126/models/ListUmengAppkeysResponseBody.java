// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListUmengAppkeysResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListUmengAppkeysResponseBodyResult> result;

    public static ListUmengAppkeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUmengAppkeysResponseBody self = new ListUmengAppkeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUmengAppkeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUmengAppkeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUmengAppkeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUmengAppkeysResponseBody setResult(java.util.List<ListUmengAppkeysResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListUmengAppkeysResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListUmengAppkeysResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5ddcf39f57729e708b00000e</p>
         */
        @NameInMap("appkey")
        public String appkey;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ios</p>
         */
        @NameInMap("platform")
        public String platform;

        public static ListUmengAppkeysResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListUmengAppkeysResponseBodyResult self = new ListUmengAppkeysResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListUmengAppkeysResponseBodyResult setAppkey(String appkey) {
            this.appkey = appkey;
            return this;
        }
        public String getAppkey() {
            return this.appkey;
        }

        public ListUmengAppkeysResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUmengAppkeysResponseBodyResult setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

    }

}
