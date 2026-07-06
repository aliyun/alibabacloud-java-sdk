// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListInstanceRequest extends TeaModel {
    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceName")
    @Deprecated
    public String instanceName;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><p><code>PENDING</code>: Initializing.</p>
     * </li>
     * <li><p><code>INIT_ERROR</code>: Initialization failed.</p>
     * </li>
     * <li><p><code>STARTING</code>: Starting.</p>
     * </li>
     * <li><p><code>RUNNING</code>: Running.</p>
     * </li>
     * <li><p><code>STOPPING</code>: Stopping.</p>
     * </li>
     * <li><p><code>STOPPED</code>: Stopped.</p>
     * </li>
     * <li><p><code>DELETING</code>: Deleting.</p>
     * </li>
     * <li><p><code>DELETED</code>: Deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmv36i4is****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRequest self = new ListInstanceRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public ListInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListInstanceRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public ListInstanceRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
