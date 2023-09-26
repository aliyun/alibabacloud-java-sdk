// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeApiQpsResponseBody extends TeaModel {
    @NameInMap("Fails")
    public DescribeApiQpsResponseBodyFails fails;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Successes")
    public DescribeApiQpsResponseBodySuccesses successes;

    public static DescribeApiQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiQpsResponseBody self = new DescribeApiQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiQpsResponseBody setFails(DescribeApiQpsResponseBodyFails fails) {
        this.fails = fails;
        return this;
    }
    public DescribeApiQpsResponseBodyFails getFails() {
        return this.fails;
    }

    public DescribeApiQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiQpsResponseBody setSuccesses(DescribeApiQpsResponseBodySuccesses successes) {
        this.successes = successes;
        return this;
    }
    public DescribeApiQpsResponseBodySuccesses getSuccesses() {
        return this.successes;
    }

    public static class DescribeApiQpsResponseBodyFailsFail extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Value")
        public String value;

        public static DescribeApiQpsResponseBodyFailsFail build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiQpsResponseBodyFailsFail self = new DescribeApiQpsResponseBodyFailsFail();
            return TeaModel.build(map, self);
        }

        public DescribeApiQpsResponseBodyFailsFail setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeApiQpsResponseBodyFailsFail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApiQpsResponseBodyFails extends TeaModel {
        @NameInMap("Fail")
        public java.util.List<DescribeApiQpsResponseBodyFailsFail> fail;

        public static DescribeApiQpsResponseBodyFails build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiQpsResponseBodyFails self = new DescribeApiQpsResponseBodyFails();
            return TeaModel.build(map, self);
        }

        public DescribeApiQpsResponseBodyFails setFail(java.util.List<DescribeApiQpsResponseBodyFailsFail> fail) {
            this.fail = fail;
            return this;
        }
        public java.util.List<DescribeApiQpsResponseBodyFailsFail> getFail() {
            return this.fail;
        }

    }

    public static class DescribeApiQpsResponseBodySuccessesSuccess extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Value")
        public String value;

        public static DescribeApiQpsResponseBodySuccessesSuccess build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiQpsResponseBodySuccessesSuccess self = new DescribeApiQpsResponseBodySuccessesSuccess();
            return TeaModel.build(map, self);
        }

        public DescribeApiQpsResponseBodySuccessesSuccess setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeApiQpsResponseBodySuccessesSuccess setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApiQpsResponseBodySuccesses extends TeaModel {
        @NameInMap("Success")
        public java.util.List<DescribeApiQpsResponseBodySuccessesSuccess> success;

        public static DescribeApiQpsResponseBodySuccesses build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiQpsResponseBodySuccesses self = new DescribeApiQpsResponseBodySuccesses();
            return TeaModel.build(map, self);
        }

        public DescribeApiQpsResponseBodySuccesses setSuccess(java.util.List<DescribeApiQpsResponseBodySuccessesSuccess> success) {
            this.success = success;
            return this;
        }
        public java.util.List<DescribeApiQpsResponseBodySuccessesSuccess> getSuccess() {
            return this.success;
        }

    }

}
