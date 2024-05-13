// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetEarlyMediaRecordingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetEarlyMediaRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEarlyMediaRecordingRequest self = new GetEarlyMediaRecordingRequest();
        return TeaModel.build(map, self);
    }

    public GetEarlyMediaRecordingRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public GetEarlyMediaRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
