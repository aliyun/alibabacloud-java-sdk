// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationStatusRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The command ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87388.html">ListCommands</a> operation to query the command ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-hz01v8x80o3****</p>
     */
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
