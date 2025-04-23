// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class PullImageRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-nkKsP3****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the image. Default value: shifter.</p>
     * 
     * <strong>example:</strong>
     * <p>shifter</p>
     */
    @NameInMap("ContainerType")
    public String containerType;

    /**
     * <p>The tag of the image. Default value: latest.</p>
     * 
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    /**
     * <p>The name of the repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>centos</p>
     */
    @NameInMap("Repository")
    public String repository;

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

    public PullImageRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

    public PullImageRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public PullImageRequest setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

}
