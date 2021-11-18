// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListCallEventDetailByContactIdRequest extends TeaModel {
    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ListCallEventDetailByContactIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCallEventDetailByContactIdRequest self = new ListCallEventDetailByContactIdRequest();
        return TeaModel.build(map, self);
    }

    public ListCallEventDetailByContactIdRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ListCallEventDetailByContactIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
