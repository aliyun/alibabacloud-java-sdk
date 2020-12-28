// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationStatusRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CommandId")
    public String commandId;

    public static ListInvocationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInvocationStatusRequest self = new ListInvocationStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListInvocationStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListInvocationStatusRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

}
