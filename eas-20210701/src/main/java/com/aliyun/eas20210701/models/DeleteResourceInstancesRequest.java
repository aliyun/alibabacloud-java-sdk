// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceInstancesRequest extends TeaModel {
    @NameInMap("AllFailed")
    public Boolean allFailed;

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
