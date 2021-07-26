// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateIpBlockRecordRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 用于保证请求的幂等性。由客户端生成该参数值，要保证在不同请求间唯一。只支持 ASCII 字符，且不能超过 64 个字符
    @NameInMap("ClientToken")
    public String clientToken;

    // 资源一级ID
    @NameInMap("IpBlockRecordId")
    public String ipBlockRecordId;

    // 工单状态
    @NameInMap("Status")
    public String status;

    public static UpdateIpBlockRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpBlockRecordRequest self = new UpdateIpBlockRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpBlockRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateIpBlockRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpBlockRecordRequest setIpBlockRecordId(String ipBlockRecordId) {
        this.ipBlockRecordId = ipBlockRecordId;
        return this;
    }
    public String getIpBlockRecordId() {
        return this.ipBlockRecordId;
    }

    public UpdateIpBlockRecordRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
