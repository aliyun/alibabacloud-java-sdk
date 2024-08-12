// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallSummariesShrinkRequest extends TeaModel {
    @NameInMap("ContactIdList")
    public String contactIdListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListCallSummariesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCallSummariesShrinkRequest self = new ListCallSummariesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCallSummariesShrinkRequest setContactIdListShrink(String contactIdListShrink) {
        this.contactIdListShrink = contactIdListShrink;
        return this;
    }
    public String getContactIdListShrink() {
        return this.contactIdListShrink;
    }

    public ListCallSummariesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
