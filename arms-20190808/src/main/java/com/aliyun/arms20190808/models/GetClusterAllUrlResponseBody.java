// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetClusterAllUrlResponseBody extends TeaModel {
    /**
     * <p>Status code. 200 means success, other status codes are exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;RequestId&quot;: &quot;41877338-646B-5DD6-BFBE-F89F1E7245AD&quot;,
     *   &quot;Data&quot;: &quot;{\&quot;clusterType\&quot;:\&quot;ManagedKubernetes\&quot;,\&quot;remoteWriteUrl\&quot;:\&quot;http:/&quot; }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The prompt information of the returned result.</p>
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
     * <p>40B10E04-81E8-4643-970D-F1B38F2E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the query is successful:</p>
     * <ul>
     * <li>true: success</li>
     * <li>false: failure</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetClusterAllUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterAllUrlResponseBody self = new GetClusterAllUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterAllUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetClusterAllUrlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetClusterAllUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetClusterAllUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterAllUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
