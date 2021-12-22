// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListConnectionPoolIpRequest extends TeaModel {
    @NameInMap("Apn")
    public String apn;

    @NameInMap("CciotGwId")
    public String cciotGwId;

    @NameInMap("CciotId")
    public String cciotId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionPoolId")
    public String connectionPoolId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("PageId")
    public String pageId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public String status;

    public static ListConnectionPoolIpRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoolIpRequest self = new ListConnectionPoolIpRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoolIpRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public ListConnectionPoolIpRequest setCciotGwId(String cciotGwId) {
        this.cciotGwId = cciotGwId;
        return this;
    }
    public String getCciotGwId() {
        return this.cciotGwId;
    }

    public ListConnectionPoolIpRequest setCciotId(String cciotId) {
        this.cciotId = cciotId;
        return this;
    }
    public String getCciotId() {
        return this.cciotId;
    }

    public ListConnectionPoolIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListConnectionPoolIpRequest setConnectionPoolId(String connectionPoolId) {
        this.connectionPoolId = connectionPoolId;
        return this;
    }
    public String getConnectionPoolId() {
        return this.connectionPoolId;
    }

    public ListConnectionPoolIpRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListConnectionPoolIpRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public ListConnectionPoolIpRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public ListConnectionPoolIpRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConnectionPoolIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListConnectionPoolIpRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
