// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class SubmitFlowResponseBody extends TeaModel {
    // 过期参数。
    @NameInMap("Data")
    public String data;

    // 工作流实例ID。
    @NameInMap("Id")
    public String id;

    // 过期参数。
    @NameInMap("InstanceId")
    public String instanceId;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitFlowResponseBody self = new SubmitFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitFlowResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SubmitFlowResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SubmitFlowResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SubmitFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
