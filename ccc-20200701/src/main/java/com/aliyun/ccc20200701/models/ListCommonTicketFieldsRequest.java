// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCommonTicketFieldsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListCommonTicketFieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommonTicketFieldsRequest self = new ListCommonTicketFieldsRequest();
        return TeaModel.build(map, self);
    }

    public ListCommonTicketFieldsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
