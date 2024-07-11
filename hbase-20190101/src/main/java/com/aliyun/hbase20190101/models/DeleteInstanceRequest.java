// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp16o0pd52e3y****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ImmediateDeleteFlag")
    public Boolean immediateDeleteFlag;

    public static DeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceRequest self = new DeleteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteInstanceRequest setImmediateDeleteFlag(Boolean immediateDeleteFlag) {
        this.immediateDeleteFlag = immediateDeleteFlag;
        return this;
    }
    public Boolean getImmediateDeleteFlag() {
        return this.immediateDeleteFlag;
    }

}
