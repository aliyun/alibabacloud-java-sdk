// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListExportZookeeperDataRequest extends TeaModel {
    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>mse-200-105</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListExportZookeeperDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExportZookeeperDataRequest self = new ListExportZookeeperDataRequest();
        return TeaModel.build(map, self);
    }

    public ListExportZookeeperDataRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListExportZookeeperDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListExportZookeeperDataRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExportZookeeperDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
