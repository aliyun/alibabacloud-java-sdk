// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The type of the environment to which the database instance belongs. Valid values:</p>
     * <br>
     * <p>*   **product:** production environment</p>
     * <p>*   **dev**: development environment</p>
     * <p>*   **pre**: pre-release environment</p>
     * <p>*   **test**: test environment</p>
     * <p>*   **sit**: system integration testing (SIT) environment</p>
     * <p>*   **uat**: user acceptance testing (UAT) environment</p>
     * <p>*   **pet**: stress testing environment</p>
     * <p>*   **stag:** staging environment</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The source of the database instance. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC_OWN**: a self-managed database instance that is deployed on the Internet</p>
     * <p>*   **RDS**: an ApsaraDB RDS instance</p>
     * <p>*   **ECS_OWN**: a self-managed database that is deployed on an Elastic Compute Service (ECS) instance</p>
     * <p>*   **VPC_IDC**: a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC)</p>
     */
    @NameInMap("InstanceSource")
    public String instanceSource;

    /**
     * <p>The status of the database instance. Valid values:</p>
     * <br>
     * <p>*   **NORMAL**</p>
     * <p>*   **DISABLE**</p>
     */
    @NameInMap("InstanceState")
    public String instanceState;

    /**
     * <p>The network type of the database instance. Valid values:</p>
     * <br>
     * <p>*   **CLASSIC:** classic network</p>
     * <p>*   **VPC:** VPC</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The number cannot exceed 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword that is used to search for database instances.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.</p>
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
