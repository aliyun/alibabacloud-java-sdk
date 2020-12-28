// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteImageRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Repository")
    public String repository;

    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("ContainerType")
    public String containerType;

    public static DeleteImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageRequest self = new DeleteImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteImageRequest setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

    public DeleteImageRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DeleteImageRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

}
