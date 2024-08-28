// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceInstancesRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete all the instances that fail to be created. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllFailed")
    public Boolean allFailed;

    /**
     * <p>The instances. Separate multiple instances with commas (,), such as <code>instanceId1,instanceId2</code>. For more information about how to query the instances, see <a href="https://help.aliyun.com/document_detail/412129.html">ListResourceInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-i-xxxxxxx,eas-i-xxxxxxx</p>
     */
    @NameInMap("InstanceList")
    public String instanceList;

    public static DeleteResourceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceInstancesRequest self = new DeleteResourceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceInstancesRequest setAllFailed(Boolean allFailed) {
        this.allFailed = allFailed;
        return this;
    }
    public Boolean getAllFailed() {
        return this.allFailed;
    }

    public DeleteResourceInstancesRequest setInstanceList(String instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public String getInstanceList() {
        return this.instanceList;
    }

}
