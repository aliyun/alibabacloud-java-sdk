// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddContainerAppRequest extends TeaModel {
    /**
     * <p>The type of the container. Set the value to singularity.</p>
     */
    @NameInMap("ContainerType")
    public String containerType;

    /**
     * <p>The description of the container.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The tags of the image.</p>
     * <br>
     * <p>The repository stores a type of images such as Ubuntu images. Tags are used to identify the images. Examples: 16.04, 17.04, and latest.</p>
     * <br>
     * <p>Default value: latest</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    /**
     * <p>The name of the container. The name must be 2 to 64 characters in length. It must start with a letter and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the repository. The image that has the same name as the repository is pulled.</p>
     * <br>
     * <p>For information about image names, visit [Docker Hub official website](https://hub.docker.com/search?q=\&type=image).</p>
     */
    @NameInMap("Repository")
    public String repository;

    public static AddContainerAppRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContainerAppRequest self = new AddContainerAppRequest();
        return TeaModel.build(map, self);
    }

    public AddContainerAppRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

    public AddContainerAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddContainerAppRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public AddContainerAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddContainerAppRequest setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

}
