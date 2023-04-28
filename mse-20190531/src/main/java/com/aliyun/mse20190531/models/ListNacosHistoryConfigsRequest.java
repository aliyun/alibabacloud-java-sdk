// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosHistoryConfigsRequest extends TeaModel {
    /**
     * <p>systemError</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    public static ListNacosHistoryConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNacosHistoryConfigsRequest self = new ListNacosHistoryConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListNacosHistoryConfigsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListNacosHistoryConfigsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListNacosHistoryConfigsRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListNacosHistoryConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListNacosHistoryConfigsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListNacosHistoryConfigsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListNacosHistoryConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNacosHistoryConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNacosHistoryConfigsRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
