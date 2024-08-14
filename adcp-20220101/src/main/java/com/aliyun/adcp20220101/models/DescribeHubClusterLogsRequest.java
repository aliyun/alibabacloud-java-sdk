// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterLogsRequest extends TeaModel {
    /**
     * <p>The ID of the Fleet instance. You can call the <a href="https://help.aliyun.com/document_detail/424404.html">DescribeHubClusters</a> operation to query the created Fleet instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c9cb1d933b2ab47ff9cd25571477dc8f2</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeHubClusterLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClusterLogsRequest self = new DescribeHubClusterLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHubClusterLogsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
