// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAggregateFunctionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeAggregateFunctionResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAggregateFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAggregateFunctionResponseBody self = new DescribeAggregateFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAggregateFunctionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAggregateFunctionResponseBody setData(java.util.List<DescribeAggregateFunctionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAggregateFunctionResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAggregateFunctionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAggregateFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAggregateFunctionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAggregateFunctionResponseBodyData extends TeaModel {
        /**
         * <p>The aggregate function.</p>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The display name of the aggregate function.</p>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        public static DescribeAggregateFunctionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAggregateFunctionResponseBodyData self = new DescribeAggregateFunctionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAggregateFunctionResponseBodyData setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public DescribeAggregateFunctionResponseBodyData setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

    }

}
