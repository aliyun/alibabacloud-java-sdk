// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ListMonoRecordingsRequest extends TeaModel {
    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMonoRecordingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMonoRecordingsRequest self = new ListMonoRecordingsRequest();
        return TeaModel.build(map, self);
    }

    public ListMonoRecordingsRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ListMonoRecordingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
