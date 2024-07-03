// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventContentResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the notification events.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;taskId\&quot;:\&quot;7e1ba595-0889-48ff-a6ff-010f54991d****\&quot;,\&quot;taskType\&quot;:\&quot;SQL_OPTIMIZE\&quot;,\&quot;advisorId\&quot;:\&quot;636dc5f34664dd56ff0****\&quot;,\&quot;sqlId\&quot;:\&quot;e2b1d6c1ee1bb29555a828b59f16****\&quot;,\&quot;indexAdviceCount\&quot;:1,\&quot;indexAdvices\&quot;:[{\&quot;schemaName\&quot;:\&quot;das\&quot;,\&quot;tableName\&quot;:\&quot;students\&quot;,\&quot;indexName\&quot;:\&quot;idx_name\&quot;,\&quot;columns\&quot;:[\&quot;name\&quot;],\&quot;unique\&quot;:false,\&quot;ddlAddIndex\&quot;:\&quot;ALTER TABLE <code>das</code>.<code>students</code> ADD INDEX <code>idx_name</code> (<code>name</code>)\&quot;,\&quot;priority\&quot;:0,\&quot;optimizeId\&quot;:\&quot;96232794517277511\&quot;}],\&quot;tuningAdvices\&quot;:[],\&quot;improvement\&quot;:8127.25,\&quot;supportLevel\&quot;:3,\&quot;priority\&quot;:\&quot;HIGH\&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
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
    public String success;

    public static GetAutonomousNotifyEventContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutonomousNotifyEventContentResponseBody self = new GetAutonomousNotifyEventContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutonomousNotifyEventContentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAutonomousNotifyEventContentResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAutonomousNotifyEventContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutonomousNotifyEventContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutonomousNotifyEventContentResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
