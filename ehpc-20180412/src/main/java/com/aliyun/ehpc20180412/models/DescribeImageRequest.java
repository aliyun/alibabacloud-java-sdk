// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImageRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Repository")
    public String repository;

    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("ContainerType")
    public String containerType;

    public static DescribeImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRequest self = new DescribeImageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeImageRequest setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

    public DescribeImageRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DescribeImageRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

}
