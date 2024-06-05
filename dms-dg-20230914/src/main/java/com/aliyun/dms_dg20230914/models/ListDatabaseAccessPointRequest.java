// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class ListDatabaseAccessPointRequest extends TeaModel {
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Host")
    public String host;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("VpcId")
    public String vpcId;

    public static ListDatabaseAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseAccessPointRequest self = new ListDatabaseAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabaseAccessPointRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public ListDatabaseAccessPointRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListDatabaseAccessPointRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public ListDatabaseAccessPointRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDatabaseAccessPointRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDatabaseAccessPointRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ListDatabaseAccessPointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDatabaseAccessPointRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListDatabaseAccessPointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
