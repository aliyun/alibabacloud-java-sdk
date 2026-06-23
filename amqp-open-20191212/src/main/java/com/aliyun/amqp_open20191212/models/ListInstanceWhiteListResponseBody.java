// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListInstanceWhiteListResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of <code>200</code> indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data, which is an array of whitelist entries. Each object in the array contains an <code>id</code> (a sequence number used for deletion) and a <code>value</code> (the actual entry, such as an IP address range or a VPC ID).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Data&quot;: [
     *     {
     *       &quot;id&quot;: 454,
     *       &quot;value&quot;: &quot;10.1.2.1/30&quot;
     *     }
     *   ]</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>The error message returned on a failed request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx failed,xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6DC68EC9-0E76-5435-B8C0-FF9492B4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP status code. A value of <code>200</code> indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public String statusCode;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListInstanceWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceWhiteListResponseBody self = new ListInstanceWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceWhiteListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceWhiteListResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ListInstanceWhiteListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceWhiteListResponseBody setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceWhiteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
