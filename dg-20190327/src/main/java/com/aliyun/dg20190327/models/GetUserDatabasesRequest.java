// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class GetUserDatabasesRequest extends TeaModel {
    @NameInMap("DbType")
    public String dbType;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Host")
    public String host;

    @NameInMap("InstanceId")
    public String instanceId;

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

    public static GetUserDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserDatabasesRequest self = new GetUserDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public GetUserDatabasesRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public GetUserDatabasesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public GetUserDatabasesRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetUserDatabasesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetUserDatabasesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public GetUserDatabasesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetUserDatabasesRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public GetUserDatabasesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetUserDatabasesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
