// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotv2AllListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the robot communication script, in the JSON format.</p>
     * <ul>
     * <li><strong>id</strong>: the ID of the robot communication script.</li>
     * <li><strong>robotName</strong>: the name of the robot communication script.</li>
     * <li><strong>robotType</strong>: the type of the robot communication script.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;id&quot;:100000007****,&quot;robotName&quot;:&quot;Robot&quot;,&quot;robotType&quot;:&quot;CUSTOM&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryRobotv2AllListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotv2AllListResponseBody self = new QueryRobotv2AllListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRobotv2AllListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRobotv2AllListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryRobotv2AllListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRobotv2AllListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
