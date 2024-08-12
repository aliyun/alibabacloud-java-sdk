// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallSummariesRequest extends TeaModel {
    @NameInMap("ContactIdList")
    public java.util.List<String> contactIdList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListCallSummariesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCallSummariesRequest self = new ListCallSummariesRequest();
        return TeaModel.build(map, self);
    }

    public ListCallSummariesRequest setContactIdList(java.util.List<String> contactIdList) {
        this.contactIdList = contactIdList;
        return this;
    }
    public java.util.List<String> getContactIdList() {
        return this.contactIdList;
    }

    public ListCallSummariesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
