// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryAppTopologyResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned struct.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Data&quot;: {
     *     &quot;nodes&quot;: [
     *       {
     *         &quot;data&quot;: {
     *           &quot;duration&quot;: 0.2254335260115607,
     *           &quot;requests&quot;: 1211,
     *           &quot;type&quot;: &quot;MYSQL&quot;,
     *           &quot;errors&quot;: 0
     *         },
     *         &quot;id&quot;: &quot;ggxw4lnjuz@c0507xxxx##MYSQL&quot;,
     *         &quot;label&quot;: &quot;mysql-pod:3306(cart_db)&quot;
     *       }
     *     ],
     *     &quot;edges&quot;: [
     *       {
     *         &quot;data&quot;: {
     *           &quot;duration&quot;: 0.03333333333333333,
     *           &quot;requests&quot;: 600,
     *           &quot;type&quot;: &quot;UNKNOWN&quot;,
     *           &quot;errors&quot;: 0
     *         },
     *         &quot;id&quot;: &quot;1974097372&quot;,
     *         &quot;source&quot;: &quot;ggxw4lnjuz@456xxxxx&quot;,
     *         &quot;target&quot;: &quot;ggxw4lnjuz@c0507xxxx&quot;
     *       }
     *     ]
     *   }</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal error. Please try again. Contact the DingTalk service account if the issue                              persists after multiple retries.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAppTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppTopologyResponseBody self = new QueryAppTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppTopologyResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryAppTopologyResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public QueryAppTopologyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAppTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppTopologyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
