// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeElasticsearchHealthResponseBody extends TeaModel {
    /**
     * <p>The response code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0731F217-2C8A-4D42-8BCD-5C352866E3B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The color that indicates the health status of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>GREEN</p>
     */
    @NameInMap("Result")
    public String result;

    public static DescribeElasticsearchHealthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticsearchHealthResponseBody self = new DescribeElasticsearchHealthResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticsearchHealthResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeElasticsearchHealthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeElasticsearchHealthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticsearchHealthResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
