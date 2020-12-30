// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecordingsByContactIdRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ContactId")
    public String contactId;

    public static ListRecordingsByContactIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecordingsByContactIdRequest self = new ListRecordingsByContactIdRequest();
        return TeaModel.build(map, self);
    }

    public ListRecordingsByContactIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRecordingsByContactIdRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

}
