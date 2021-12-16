// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetMultiChannelRecordingRequest extends TeaModel {
    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetMultiChannelRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultiChannelRecordingRequest self = new GetMultiChannelRecordingRequest();
        return TeaModel.build(map, self);
    }

    public GetMultiChannelRecordingRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public GetMultiChannelRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
