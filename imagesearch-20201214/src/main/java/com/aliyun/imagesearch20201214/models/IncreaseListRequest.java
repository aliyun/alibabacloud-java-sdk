// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class IncreaseListRequest extends TeaModel {
    /**
     * <p>The name of the Object Storage Service (OSS) bucket.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The ID of the batch task.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of images to return on each page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The absolute path to the increment.meta file in the bucket. The path must start with a forward slash (/) and cannot end with a forward slash (/).</p>
     */
    @NameInMap("Path")
    public String path;

    public static IncreaseListRequest build(java.util.Map<String, ?> map) throws Exception {
        IncreaseListRequest self = new IncreaseListRequest();
        return TeaModel.build(map, self);
    }

    public IncreaseListRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public IncreaseListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public IncreaseListRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public IncreaseListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public IncreaseListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public IncreaseListRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
