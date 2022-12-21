// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    // The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
    @NameInMap("DbType")
    public String dbType;

    // The type of the environment to which the database instance belongs. Valid values:
    // 
    // *   **product**: production environment
    // *   **dev**: development environment
    // *   **pre**: staging environment
    // *   **test**: test environment
    // *   **sit**: system integration testing (SIT) environment
    // *   **uat**: user acceptance testing (UAT) environment
    // *   **pet**: stress testing environment
    // *   **stag**: STAG environment
    @NameInMap("EnvType")
    public String envType;

    // The source of the database instance. Valid values:
    // 
    // *   **PUBLIC_OWN**: a self-managed database instance that is deployed on the Internet
    // *   **RDS**: an ApsaraDB RDS instance
    // *   **ECS_OWN**: a self-managed database that is deployed on an Elastic Compute Service (ECS) instance
    // *   **VPC_IDC**: a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC)
    @NameInMap("InstanceSource")
    public String instanceSource;

    // The status of the database instance. Valid values:
    // 
    // *   **NORMAL**: normal
    // *   **DISABLE**: disabled
    @NameInMap("InstanceState")
    public String instanceState;

    // The network type of the database instance. Valid values:
    // 
    // *   **CLASSIC**: classic network
    // *   **VPC**: VPC
    @NameInMap("NetType")
    public String netType;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. The number cannot exceed 100.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The keyword that is used to search for database instances.
    @NameInMap("SearchKey")
    public String searchKey;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.
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
