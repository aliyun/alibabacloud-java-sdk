// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DeleteReservedNodePoolRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>rnp-cdx****</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteReservedNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteReservedNodePoolRequest self = new DeleteReservedNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public DeleteReservedNodePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteReservedNodePoolRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
