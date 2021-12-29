// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListAppsRequest extends TeaModel {
    // 集成方式：- 一体化SDK：paasSDK - 样板间：standardRoom
    @NameInMap("IntegrationMode")
    public String integrationMode;

    // 查询页码，参数为空默认查询第1页。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页显示个数，参数为空默认显示个数为10。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 应用状态
    @NameInMap("Status")
    public String status;

    public static ListAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppsRequest self = new ListAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppsRequest setIntegrationMode(String integrationMode) {
        this.integrationMode = integrationMode;
        return this;
    }
    public String getIntegrationMode() {
        return this.integrationMode;
    }

    public ListAppsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
