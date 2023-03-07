// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCommunityImagesRequest extends TeaModel {
    /**
     * <p>The tag of the base operating system (BOS).</p>
     */
    @NameInMap("BaseOsTag")
    public String baseOsTag;

    /**
     * <p>The ID of the cluster. If the cluster supports multiple operating systems, all community images in the region where the cluster resides are queried.</p>
     * <br>
     * <p>If you do not specify the cluster ID, the community images that are supported by all clusters are queried.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the Elastic Compute Service (ECS) instance. If you do not specify the instance type, the community images that are supported by all instance types are queried.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    public static ListCommunityImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommunityImagesRequest self = new ListCommunityImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListCommunityImagesRequest setBaseOsTag(String baseOsTag) {
        this.baseOsTag = baseOsTag;
        return this;
    }
    public String getBaseOsTag() {
        return this.baseOsTag;
    }

    public ListCommunityImagesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListCommunityImagesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
