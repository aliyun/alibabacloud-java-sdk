// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InvokeEsRequestResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8E5A2C41-D96B-4308-AF72-5C0B14E6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response content returned as-is from ES. The structure is determined by the ES API being called.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;esResult&quot;:{&quot;took&quot;:5,&quot;timed_out&quot;:false,&quot;hits&quot;:{&quot;total&quot;:{&quot;value&quot;:1,&quot;relation&quot;:&quot;eq&quot;},&quot;max_score&quot;:1.0,&quot;hits&quot;:[{&quot;_index&quot;:&quot;my-index&quot;,&quot;_id&quot;:&quot;1&quot;,&quot;_score&quot;:1.0,&quot;_source&quot;:{&quot;title&quot;:&quot;Wireless Bluetooth Headphones&quot;}}]}}}</p>
     */
    @NameInMap("Result")
    public Object result;

    public static InvokeEsRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeEsRequestResponseBody self = new InvokeEsRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeEsRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeEsRequestResponseBody setResult(Object result) {
        this.result = result;
        return this;
    }
    public Object getResult() {
        return this.result;
    }

}
