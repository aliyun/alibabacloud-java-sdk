// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCustomImagesRequest extends TeaModel {
    /**
     * <p>The image tag of the base operating system. The tag is used only by the management node.</p>
     */
    @NameInMap("BaseOsTag")
    public String baseOsTag;

    /**
     * <p>The ID of the cluster where the application resides. If the cluster supports multiple operating systems, all the images in the region where the cluster resides are queried.</p>
     * <br>
     * <p>By default, if you do not specify the cluster ID, the images that are supported by all the clusters is queried.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The source of the image. Valid values:</p>
     * <br>
     * <p>*   self: custom image</p>
     * <p>*   others: shared image</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>Specify the type of the instance. By default, if you do not specify the type of the instance, the list of images that are supported by all the instance types are queried.</p>
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
