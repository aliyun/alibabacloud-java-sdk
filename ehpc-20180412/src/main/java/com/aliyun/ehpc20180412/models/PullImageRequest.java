// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class PullImageRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Repository")
    public String repository;

    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("ContainerType")
    public String containerType;

    public static PullImageRequest build(java.util.Map<String, ?> map) throws Exception {
        PullImageRequest self = new PullImageRequest();
        return TeaModel.build(map, self);
    }

    public PullImageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public PullImageRequest setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

    public PullImageRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public PullImageRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

}
