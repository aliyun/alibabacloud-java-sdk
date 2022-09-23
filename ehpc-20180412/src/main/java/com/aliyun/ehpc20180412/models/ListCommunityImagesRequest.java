// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCommunityImagesRequest extends TeaModel {
    @NameInMap("BaseOsTag")
    public String baseOsTag;

    @NameInMap("ClusterId")
    public String clusterId;

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
