// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ReleaseDdosOriginInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Origin instance that you want to release.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosorigin_cn-pe335v7gs01</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ReleaseDdosOriginInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDdosOriginInstanceRequest self = new ReleaseDdosOriginInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseDdosOriginInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
