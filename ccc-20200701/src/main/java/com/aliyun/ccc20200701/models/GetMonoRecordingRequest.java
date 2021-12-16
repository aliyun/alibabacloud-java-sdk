// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetMonoRecordingRequest extends TeaModel {
    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetMonoRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMonoRecordingRequest self = new GetMonoRecordingRequest();
        return TeaModel.build(map, self);
    }

    public GetMonoRecordingRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public GetMonoRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
