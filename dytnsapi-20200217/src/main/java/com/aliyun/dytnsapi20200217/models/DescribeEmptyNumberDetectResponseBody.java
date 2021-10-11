// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribeEmptyNumberDetectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public java.util.List<DescribeEmptyNumberDetectResponseBodyData> data;

    public static DescribeEmptyNumberDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmptyNumberDetectResponseBody self = new DescribeEmptyNumberDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEmptyNumberDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEmptyNumberDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEmptyNumberDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEmptyNumberDetectResponseBody setData(java.util.List<DescribeEmptyNumberDetectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeEmptyNumberDetectResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeEmptyNumberDetectResponseBodyData extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("Status")
        public String status;

        public static DescribeEmptyNumberDetectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEmptyNumberDetectResponseBodyData self = new DescribeEmptyNumberDetectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEmptyNumberDetectResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public DescribeEmptyNumberDetectResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
