// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListUmengAppkeysResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public java.util.List<ListUmengAppkeysResponseBodyResult> result;

    public static ListUmengAppkeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUmengAppkeysResponseBody self = new ListUmengAppkeysResponseBody();
        return TeaModel.build(map, self);
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

    public ListUmengAppkeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUmengAppkeysResponseBody setResult(java.util.List<ListUmengAppkeysResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListUmengAppkeysResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListUmengAppkeysResponseBodyResult extends TeaModel {
        @NameInMap("Platform")
        public String platform;

        @NameInMap("Name")
        public String name;

        @NameInMap("Appkey")
        public String appkey;

        public static ListUmengAppkeysResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListUmengAppkeysResponseBodyResult self = new ListUmengAppkeysResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListUmengAppkeysResponseBodyResult setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListUmengAppkeysResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUmengAppkeysResponseBodyResult setAppkey(String appkey) {
            this.appkey = appkey;
            return this;
        }
        public String getAppkey() {
            return this.appkey;
        }

    }

}
