// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateIpRecordRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 用于保证请求的幂等性。由客户端生成该参数值，要保证在不同请求间唯一。只支持 ASCII 字符，且不能超过 64 个字符
    @NameInMap("ClientToken")
    public String clientToken;

    // 资源一级ID
    @NameInMap("IpRecordId")
    public String ipRecordId;

    // 工单状态 running complete fail
    @NameInMap("Status")
    public String status;

    public static UpdateIpRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpRecordRequest self = new UpdateIpRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateIpRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpRecordRequest setIpRecordId(String ipRecordId) {
        this.ipRecordId = ipRecordId;
        return this;
    }
    public String getIpRecordId() {
        return this.ipRecordId;
    }

    public UpdateIpRecordRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
