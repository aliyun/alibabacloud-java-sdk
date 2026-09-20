// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneClusterRequest extends TeaModel {
    /**
     * <p>The ID of the multi-zone instance. You can call <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> to obtain the list. The multi-zone instance has <strong>DbType</strong> set to hbaseue and <strong>ModuleStackVersion</strong> set to 2.0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-t4nn71xa0yn****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeMultiZoneClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiZoneClusterRequest self = new DescribeMultiZoneClusterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMultiZoneClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
