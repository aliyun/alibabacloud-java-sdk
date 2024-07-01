// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkCodeOutputResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * <ul>
     * <li>If the request was successful, <strong>Success</strong> is returned.</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The execution result, which is in the format of JSON objects.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;schema\&quot;:[\&quot;id\&quot;,\&quot;name\&quot;,\&quot;age\&quot;],\&quot;data\&quot;:[\&quot;{\\\&quot;id\\\&quot;:10,\\\&quot;name\\\&quot;:\\\&quot;z\\\&quot;,\\\&quot;age\\\&quot;:123}\&quot;,\&quot;{\\\&quot;id\\\&quot;:2,\\\&quot;name\\\&quot;:\\\&quot;b\\\&quot;,\\\&quot;age\\\&quot;:17}\&quot;,\&quot;{\\\&quot;id\\\&quot;:1,\\\&quot;name\\\&quot;:\\\&quot;a\\\&quot;,\\\&quot;age\\\&quot;:15}\&quot;,\&quot;{\\\&quot;id\\\&quot;:3,\\\&quot;name\\\&quot;:\\\&quot;c\\\&quot;,\\\&quot;age\\\&quot;:222}\&quot;,\&quot;{\\\&quot;id\\\&quot;:10,\\\&quot;name\\\&quot;:\\\&quot;z\\\&quot;,\\\&quot;age\\\&quot;:123}\&quot;],\&quot;haveRows\&quot;:true,\&quot;rowNumber\&quot;:6}&quot;</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSparkCodeOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkCodeOutputResponseBody self = new DescribeSparkCodeOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSparkCodeOutputResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSparkCodeOutputResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public DescribeSparkCodeOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSparkCodeOutputResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
