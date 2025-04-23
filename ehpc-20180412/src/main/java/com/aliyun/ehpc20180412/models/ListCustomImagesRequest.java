// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCustomImagesRequest extends TeaModel {
    /**
     * <p>The image tag of the operating system. The tag is used only for management nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>CentOS_7.2_64</p>
     */
    @NameInMap("BaseOsTag")
    public String baseOsTag;

    /**
     * <p>The cluster ID.</p>
     * <ul>
     * <li>If you specify a value for this parameter, all community images in the region where the cluster resides are queried.</li>
     * <li>If you do not specify a value for this parameter, the community images that are supported by all clusters are queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The image source. Valid values:</p>
     * <ul>
     * <li>self: custom image</li>
     * <li>others: shared image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>self</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The instance type of the Elastic Compute Service (ECS) instance. If you do not specify the instance type, the community images that are supported by all instance types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.n1.tiny</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    public static ListCustomImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomImagesRequest self = new ListCustomImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomImagesRequest setBaseOsTag(String baseOsTag) {
        this.baseOsTag = baseOsTag;
        return this;
    }
    public String getBaseOsTag() {
        return this.baseOsTag;
    }

    public ListCustomImagesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListCustomImagesRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public ListCustomImagesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
