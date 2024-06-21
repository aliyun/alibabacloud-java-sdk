// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SyncRecordingRulesResponseBody extends TeaModel {
    /**
     * <p>状态码。200表示成功。</p>
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
     * <p>{ &quot;data&quot;:[ &quot;c06ca68cd16f14f52bb07772eda\<em>\</em>\<em>&quot;, &quot;c33dd70a0ac184c1b879d807ab2\</em>\<em>\</em>&quot;, &quot;c384cf7e4dcb543e6ac8c7d4dd3\<em>\</em>\<em>&quot;, &quot;ce30f833bc4a04a56a06b070319\</em>\<em>\</em>&quot; ], &quot;message&quot;:&quot;IDs of Clusters to which the aggregation rule failed to be synchronized&quot;, &quot;success&quot;:true }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>返回结果的提示信息。</p>
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
     * <p>1A9C645C-C83F-4C9D-8CCB-29BEC9E1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SyncRecordingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncRecordingRulesResponseBody self = new SyncRecordingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncRecordingRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SyncRecordingRulesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SyncRecordingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncRecordingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
