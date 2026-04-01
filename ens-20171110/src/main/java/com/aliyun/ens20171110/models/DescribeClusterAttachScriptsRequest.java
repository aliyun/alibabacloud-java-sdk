// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClusterAttachScriptsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-11111111</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np68mi5y1dd748ky37ojo2kqdrz</p>
     */
    @NameInMap("NodepoolId")
    public String nodepoolId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;key1\&quot;:\&quot;val1\&quot;}</p>
     */
    @NameInMap("Options")
    public String options;

    public static DescribeClusterAttachScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAttachScriptsRequest self = new DescribeClusterAttachScriptsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAttachScriptsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterAttachScriptsRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public DescribeClusterAttachScriptsRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

}
