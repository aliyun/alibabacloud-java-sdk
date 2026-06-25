// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class IncreaseListRequest extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>bucketName</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The batch task ID.</p>
     * <blockquote>
     * <p>To obtain the batch task ID, call the <a href="https://help.aliyun.com/document_detail/377468.html">batch operation</a> first and retrieve the ID from the response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.
     * If you have purchased an Image Search instance, log on to the <a href="https://imagesearch.console.aliyun.com/">Image Search console</a> to view the instance name.
     * If you have not purchased an Image Search instance, refer to <a href="https://help.aliyun.com/document_detail/179178.html">Activate the service</a> and <a href="https://help.aliyun.com/document_detail/66569.html">Create an instance</a>.</p>
     * <blockquote>
     * <p>The instance name is not the instance ID. The instance name must be unique within the same region. Make sure you use the correct value.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The page number of the first page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The absolute path of the increment.meta file in OSS. The path must start with a forward slash (/) and must not end with a forward slash (/).</p>
     * 
     * <strong>example:</strong>
     * <p>/xxx/xxx</p>
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
