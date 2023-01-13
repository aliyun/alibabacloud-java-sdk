// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribeEmptyNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeEmptyNumberResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEmptyNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmptyNumberResponseBody self = new DescribeEmptyNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEmptyNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEmptyNumberResponseBody setData(DescribeEmptyNumberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEmptyNumberResponseBodyData getData() {
        return this.data;
    }

    public DescribeEmptyNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEmptyNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEmptyNumberResponseBodyData extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("Status")
        public String status;

        public static DescribeEmptyNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEmptyNumberResponseBodyData self = new DescribeEmptyNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEmptyNumberResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public DescribeEmptyNumberResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
