// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ScaleClusterNodePoolRequest extends TeaModel {
    @NameInMap("Body")
    public ScaleClusterNodePoolRequestBody body;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np2201da356f5245cf8faa522a8a4c8224</p>
     */
    @NameInMap("NodepoolId")
    public String nodepoolId;

    public static ScaleClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleClusterNodePoolRequest self = new ScaleClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public ScaleClusterNodePoolRequest setBody(ScaleClusterNodePoolRequestBody body) {
        this.body = body;
        return this;
    }
    public ScaleClusterNodePoolRequestBody getBody() {
        return this.body;
    }

    public ScaleClusterNodePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ScaleClusterNodePoolRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public static class ScaleClusterNodePoolRequestBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static ScaleClusterNodePoolRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterNodePoolRequestBody self = new ScaleClusterNodePoolRequestBody();
            return TeaModel.build(map, self);
        }

        public ScaleClusterNodePoolRequestBody setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
