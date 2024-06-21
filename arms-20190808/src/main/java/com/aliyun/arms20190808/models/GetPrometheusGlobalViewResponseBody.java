// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusGlobalViewResponseBody extends TeaModel {
    /**
     * <p>Status code. 200 is success, other status codes are exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The struct returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;clusterId&quot;:&quot;The ID of the global aggregation instance.&quot;, &quot;groupName&quot;:&quot;The name of the global aggregation instance.&quot;, &quot;dataSources&quot;:[ { &quot;sourceName&quot;:&quot;The name of the data source.- ArmsPrometheus No.1&quot;, &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;, &quot;userId&quot;:&quot;UserID&quot;, &quot;clusterId&quot;:&quot;ClusterId&quot; }, // more datasources ] }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Returns a hint message for the result.</p>
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
     * <p>743AD493-D006-53BD-AAEC-DDCE7FB68EA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusGlobalViewResponseBody self = new GetPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrometheusGlobalViewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetPrometheusGlobalViewResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetPrometheusGlobalViewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
