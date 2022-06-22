// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryWaitInstallPluginRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("EIpList")
    public String EIpList;

    @NameInMap("InstanceIdList")
    public String instanceIdList;

    @NameInMap("InstanceNameList")
    public String instanceNameList;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PrivateIpList")
    public String privateIpList;

    @NameInMap("PublicIpList")
    public String publicIpList;

    public static QueryWaitInstallPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWaitInstallPluginRequest self = new QueryWaitInstallPluginRequest();
        return TeaModel.build(map, self);
    }

    public QueryWaitInstallPluginRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryWaitInstallPluginRequest setEIpList(String EIpList) {
        this.EIpList = EIpList;
        return this;
    }
    public String getEIpList() {
        return this.EIpList;
    }

    public QueryWaitInstallPluginRequest setInstanceIdList(String instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public QueryWaitInstallPluginRequest setInstanceNameList(String instanceNameList) {
        this.instanceNameList = instanceNameList;
        return this;
    }
    public String getInstanceNameList() {
        return this.instanceNameList;
    }

    public QueryWaitInstallPluginRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryWaitInstallPluginRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public QueryWaitInstallPluginRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryWaitInstallPluginRequest setPrivateIpList(String privateIpList) {
        this.privateIpList = privateIpList;
        return this;
    }
    public String getPrivateIpList() {
        return this.privateIpList;
    }

    public QueryWaitInstallPluginRequest setPublicIpList(String publicIpList) {
        this.publicIpList = publicIpList;
        return this;
    }
    public String getPublicIpList() {
        return this.publicIpList;
    }

}
