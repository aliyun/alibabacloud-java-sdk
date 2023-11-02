// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleTestResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeCustomizeRuleTestResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCustomizeRuleTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeRuleTestResponseBody self = new DescribeCustomizeRuleTestResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeRuleTestResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCustomizeRuleTestResponseBody setData(DescribeCustomizeRuleTestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCustomizeRuleTestResponseBodyData getData() {
        return this.data;
    }

    public DescribeCustomizeRuleTestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomizeRuleTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomizeRuleTestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomizeRuleTestResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("SimulateData")
        public String simulateData;

        @NameInMap("Status")
        public Integer status;

        public static DescribeCustomizeRuleTestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomizeRuleTestResponseBodyData self = new DescribeCustomizeRuleTestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCustomizeRuleTestResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCustomizeRuleTestResponseBodyData setSimulateData(String simulateData) {
            this.simulateData = simulateData;
            return this;
        }
        public String getSimulateData() {
            return this.simulateData;
        }

        public DescribeCustomizeRuleTestResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
