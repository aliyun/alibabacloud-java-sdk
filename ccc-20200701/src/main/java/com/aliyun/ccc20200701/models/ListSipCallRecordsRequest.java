// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSipCallRecordsRequest extends TeaModel {
    @NameInMap("ContactIdList")
    public String contactIdList;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ListSipCallRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSipCallRecordsRequest self = new ListSipCallRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListSipCallRecordsRequest setContactIdList(String contactIdList) {
        this.contactIdList = contactIdList;
        return this;
    }
    public String getContactIdList() {
        return this.contactIdList;
    }

    public ListSipCallRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
