// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The type of the environment to which the database instance belongs. Valid values:</p>
     * <ul>
     * <li><strong>product:</strong> production environment</li>
     * <li><strong>dev</strong>: development environment</li>
     * <li><strong>pre</strong>: pre-release environment</li>
     * <li><strong>test</strong>: test environment</li>
     * <li><strong>sit</strong>: system integration testing (SIT) environment</li>
     * <li><strong>uat</strong>: user acceptance testing (UAT) environment</li>
     * <li><strong>pet</strong>: stress testing environment</li>
     * <li><strong>stag:</strong> staging environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>product</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The source of the database instance. Valid values:</p>
     * <ul>
     * <li><strong>PUBLIC_OWN</strong>: a self-managed database instance that is deployed on the Internet</li>
     * <li><strong>RDS</strong>: an ApsaraDB RDS instance</li>
     * <li><strong>ECS_OWN</strong>: a self-managed database that is deployed on an Elastic Compute Service (ECS) instance</li>
     * <li><strong>VPC_IDC</strong>: a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceSource")
    public String instanceSource;

    /**
     * <p>The status of the database instance. Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong></li>
     * <li><strong>DISABLE</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("InstanceState")
    public String instanceState;

    /**
     * <p>The network type of the database instance. Valid values:</p>
     * <ul>
     * <li><strong>CLASSIC:</strong> classic network</li>
     * <li><strong>VPC:</strong> VPC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The number cannot exceed 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword that is used to search for database instances.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
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
