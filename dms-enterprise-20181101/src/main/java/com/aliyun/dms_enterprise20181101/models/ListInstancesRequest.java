// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The alias of the database instance.</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The source of the database instance. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC_OWN**: a self-managed database instance that is deployed on the Internet</p>
     * <p>*   **RDS**: an ApsaraDB RDS instance</p>
     * <p>*   **ECS_OWN**: a self-managed database that is deployed on an Elastic Compute Service (ECS) instance</p>
     * <p>*   **VPC_IDC**: a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC)</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The timeout period for querying data in the database instance.</p>
     */
    @NameInMap("InstanceSource")
    public String instanceSource;

    /**
     * <p>The network type of the database instance. Valid values:</p>
     * <br>
     * <p>*   **CLASSIC**: classic network</p>
     * <p>*   **VPC**: VPC</p>
     */
    @NameInMap("InstanceState")
    public String instanceState;

    /**
     * <p>The status of the database instance.</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Indicates whether the lock-free schema change feature is enabled for the database instance.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The operation that you want to perform. Set the value to **ListInstances**.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the owner for the database instance.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public ListInstancesRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListInstancesRequest setInstanceSource(String instanceSource) {
        this.instanceSource = instanceSource;
        return this;
    }
    public String getInstanceSource() {
        return this.instanceSource;
    }

    public ListInstancesRequest setInstanceState(String instanceState) {
        this.instanceState = instanceState;
        return this;
    }
    public String getInstanceState() {
        return this.instanceState;
    }

    public ListInstancesRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public ListInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListInstancesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
