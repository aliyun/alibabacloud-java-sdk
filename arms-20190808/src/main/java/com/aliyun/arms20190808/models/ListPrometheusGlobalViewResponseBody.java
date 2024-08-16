// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusGlobalViewResponseBody extends TeaModel {
    /**
     * <p>Status code. Description 200 means success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The list of global aggregation instances. The value of this parameter is a string in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[ {groupName: &quot;the name of the global aggregation instance&quot;, clusterId: &quot;global-v2-clusterid&quot;, endpoint: &quot;cn-hangzhou&quot;}, // ..... more items ]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>More information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>DBDCE95A-A0DD-5FC5-97CC-EEFC3D814385</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusGlobalViewResponseBody self = new ListPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusGlobalViewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPrometheusGlobalViewResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListPrometheusGlobalViewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
