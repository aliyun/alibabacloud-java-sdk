// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLifecyclePoliciesRequest extends TeaModel {
    /**
     * <p>The description of the policy.</p>
     * <blockquote>
     * <p>This parameter is supported only by CPFS for Lingjun.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
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
     * <p>The ID of the lifecycle policy.</p>
     * 
     * <strong>example:</strong>
     * <p>lc-xxx</p>
     */
    @NameInMap("LifecyclePolicyId")
    public String lifecyclePolicyId;

    /**
     * <p>Policy Name of the lifecycle policy. Policy Name must meet the following rules:</p>
     * <p>Policy Name must be 3 to 64 characters in length. It must start with a letter and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p>For General-purpose NAS file systems, this parameter is optional. If you specify this parameter, the specified value is used. If you do not specify this parameter, the value of LifecyclePolicyId is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lifecyclepolicy_01</p>
     */
    @NameInMap("LifecyclePolicyName")
    public String lifecyclePolicyName;

    /**
     * <p>The policy type. Valid values:</p>
     * <ul>
     * <li>Auto: Automatic execution.</li>
     * <li>OnDemand: On-demand execution.<blockquote>
     * <p>This parameter is supported only by CPFS for Lingjun.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("LifecyclePolicyType")
    public String lifecyclePolicyType;

    /**
     * <p>The page number of the list.</p>
     * <p>Starting value (default value): 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of lifecycle management policies to return on each page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filters lifecycle policies by path.</p>
     * <blockquote>
     * <p>This parameter is supported only by CPFS for Lingjun.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/abc/</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The tiered storage type. Valid values:</p>
     * <ul>
     * <li>InfrequentAccess: IA storage class.</li>
     * <li>Archive: Archive storage class.<blockquote>
     * <p>If you do not specify StorageType, all lifecycle policies are returned.</p>
     * </blockquote>
     * </li>
     * </ul>
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
