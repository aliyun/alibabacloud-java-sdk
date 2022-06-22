// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DescribePluginRateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePluginRateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribePluginRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginRateResponseBody self = new DescribePluginRateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePluginRateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePluginRateResponseBody setData(DescribePluginRateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePluginRateResponseBodyData getData() {
        return this.data;
    }

    public DescribePluginRateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePluginRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePluginRateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribePluginRateResponseBodyData extends TeaModel {
        @NameInMap("ecsNumber")
        public Integer ecsNumber;

        @NameInMap("onLinePluginNumber")
        public Integer onLinePluginNumber;

        public static DescribePluginRateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginRateResponseBodyData self = new DescribePluginRateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePluginRateResponseBodyData setEcsNumber(Integer ecsNumber) {
            this.ecsNumber = ecsNumber;
            return this;
        }
        public Integer getEcsNumber() {
            return this.ecsNumber;
        }

        public DescribePluginRateResponseBodyData setOnLinePluginNumber(Integer onLinePluginNumber) {
            this.onLinePluginNumber = onLinePluginNumber;
            return this;
        }
        public Integer getOnLinePluginNumber() {
            return this.onLinePluginNumber;
        }

    }

}
