// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLifecyclePoliciesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <strong>example:</strong>
     * <p>lc-xxx</p>
     */
    @NameInMap("LifecyclePolicyId")
    public String lifecyclePolicyId;

    /**
     * <p>The name of the lifecycle policy. The name must meet the following conventions:</p>
     * <p>The name must be 3 to 64 characters in length and must start with a letter. It can contain letters, digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>lifecyclepolicy_01</p>
     */
    @NameInMap("LifecyclePolicyName")
    public String lifecyclePolicyName;

    /**
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("LifecyclePolicyType")
    public String lifecyclePolicyType;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>/abc/</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The storage class.</p>
     * <ul>
     * <li>InfrequentAccess: the Infrequent Access (IA) storage class.</li>
     * <li>Archive: the Archive storage class.</li>
     * </ul>
     * <blockquote>
     * <p> If the StorageType parameter is not specified, data retrieval tasks of all types are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>InfrequentAccess</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static DescribeLifecyclePoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecyclePoliciesRequest self = new DescribeLifecyclePoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLifecyclePoliciesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeLifecyclePoliciesRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeLifecyclePoliciesRequest setLifecyclePolicyId(String lifecyclePolicyId) {
        this.lifecyclePolicyId = lifecyclePolicyId;
        return this;
    }
    public String getLifecyclePolicyId() {
        return this.lifecyclePolicyId;
    }

    public DescribeLifecyclePoliciesRequest setLifecyclePolicyName(String lifecyclePolicyName) {
        this.lifecyclePolicyName = lifecyclePolicyName;
        return this;
    }
    public String getLifecyclePolicyName() {
        return this.lifecyclePolicyName;
    }

    public DescribeLifecyclePoliciesRequest setLifecyclePolicyType(String lifecyclePolicyType) {
        this.lifecyclePolicyType = lifecyclePolicyType;
        return this;
    }
    public String getLifecyclePolicyType() {
        return this.lifecyclePolicyType;
    }

    public DescribeLifecyclePoliciesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLifecyclePoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLifecyclePoliciesRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribeLifecyclePoliciesRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
