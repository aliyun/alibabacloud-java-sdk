// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetLocalityRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;pageNumber&quot;:0,
     *   &quot;namespaceId&quot;:&quot;cn-hangzhou&quot;,
     *   &quot;enable&quot;:false,
     *   &quot;appId&quot;:&quot;hkhon1po62@3aa3582********&quot;,
     *   &quot;pageSize&quot;:0,
     *   &quot;region&quot;:&quot;cn-hangzhou&quot;,
     *   &quot;routeRules&quot;:[
     *     {
     *       &quot;threshold&quot;:0.2,
     *       &quot;tags&quot;:[]
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D3971C60-3F07-58B0-8EA0-A194********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetLocalityRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLocalityRuleResponseBody self = new GetLocalityRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLocalityRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetLocalityRuleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetLocalityRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLocalityRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLocalityRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLocalityRuleResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
