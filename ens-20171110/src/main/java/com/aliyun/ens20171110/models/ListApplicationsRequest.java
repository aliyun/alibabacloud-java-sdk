// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListApplicationsRequest extends TeaModel {
    @NameInMap("AppVersions")
    public String appVersions;

    @NameInMap("ClusterNames")
    public String clusterNames;

    @NameInMap("Level")
    public String level;

    @NameInMap("MaxDate")
    public String maxDate;

    @NameInMap("MinDate")
    public String minDate;

    @NameInMap("OutAppInfoParams")
    public String outAppInfoParams;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsRequest self = new ListApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsRequest setAppVersions(String appVersions) {
        this.appVersions = appVersions;
        return this;
    }
    public String getAppVersions() {
        return this.appVersions;
    }

    public ListApplicationsRequest setClusterNames(String clusterNames) {
        this.clusterNames = clusterNames;
        return this;
    }
    public String getClusterNames() {
        return this.clusterNames;
    }

    public ListApplicationsRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public ListApplicationsRequest setMaxDate(String maxDate) {
        this.maxDate = maxDate;
        return this;
    }
    public String getMaxDate() {
        return this.maxDate;
    }

    public ListApplicationsRequest setMinDate(String minDate) {
        this.minDate = minDate;
        return this;
    }
    public String getMinDate() {
        return this.minDate;
    }

    public ListApplicationsRequest setOutAppInfoParams(String outAppInfoParams) {
        this.outAppInfoParams = outAppInfoParams;
        return this;
    }
    public String getOutAppInfoParams() {
        return this.outAppInfoParams;
    }

    public ListApplicationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
