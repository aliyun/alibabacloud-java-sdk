// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCustomImagesRequest extends TeaModel {
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("BaseOsTag")
    public String baseOsTag;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("ClusterId")
    public String clusterId;

    public static ListCustomImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomImagesRequest self = new ListCustomImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomImagesRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public ListCustomImagesRequest setBaseOsTag(String baseOsTag) {
        this.baseOsTag = baseOsTag;
        return this;
    }
    public String getBaseOsTag() {
        return this.baseOsTag;
    }

    public ListCustomImagesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListCustomImagesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
