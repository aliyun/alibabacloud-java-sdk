// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PublishContactFlowVersionRequest extends TeaModel {
    @NameInMap("ContactFlowVersionId")
    public String contactFlowVersionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UseTianGong")
    public Boolean useTianGong;

    public static PublishContactFlowVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishContactFlowVersionRequest self = new PublishContactFlowVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishContactFlowVersionRequest setContactFlowVersionId(String contactFlowVersionId) {
        this.contactFlowVersionId = contactFlowVersionId;
        return this;
    }
    public String getContactFlowVersionId() {
        return this.contactFlowVersionId;
    }

    public PublishContactFlowVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PublishContactFlowVersionRequest setUseTianGong(Boolean useTianGong) {
        this.useTianGong = useTianGong;
        return this;
    }
    public Boolean getUseTianGong() {
        return this.useTianGong;
    }

}
