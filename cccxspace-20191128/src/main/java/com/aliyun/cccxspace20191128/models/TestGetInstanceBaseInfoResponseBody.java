// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class TestGetInstanceBaseInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TestGetInstanceBaseInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static TestGetInstanceBaseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestGetInstanceBaseInfoResponseBody self = new TestGetInstanceBaseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public TestGetInstanceBaseInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TestGetInstanceBaseInfoResponseBody setData(TestGetInstanceBaseInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TestGetInstanceBaseInfoResponseBodyData getData() {
        return this.data;
    }

    public TestGetInstanceBaseInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TestGetInstanceBaseInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TestGetInstanceBaseInfoResponseBodyData extends TeaModel {
        @NameInMap("exts")
        public String exts;

        public static TestGetInstanceBaseInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestGetInstanceBaseInfoResponseBodyData self = new TestGetInstanceBaseInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestGetInstanceBaseInfoResponseBodyData setExts(String exts) {
            this.exts = exts;
            return this;
        }
        public String getExts() {
            return this.exts;
        }

    }

}
