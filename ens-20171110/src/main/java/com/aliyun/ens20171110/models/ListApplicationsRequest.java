// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListApplicationsRequest extends TeaModel {
    /**
     * <p>The version number of the application. Separate multiple version numbers with commas (,). If you want to query data of all versions of applications, specify All for this parameter. By default, only data of applications in the stable versions are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>v1,v2</p>
     */
    @NameInMap("AppVersions")
    public String appVersions;

    /**
     * <p>The name of the application cluster. Separate multiple names with commas (,). If you want to query applications of all clusters in your account, specify All for this parameter. Default value: All.</p>
     * 
     * <strong>example:</strong>
     * <p>poc,pre</p>
     */
    @NameInMap("ClusterNames")
    public String clusterNames;

    /**
     * <p>The region level by which edge resources of the application are collected. The value is of the enumeration type. Valid values:</p>
     * <ul>
     * <li>National: Chinese mainland</li>
     * <li>Big: area</li>
     * <li>Middle: province</li>
     * <li>Small: city</li>
     * <li>RegionId: edge node</li>
     * </ul>
     * <p>Default value: National.</p>
     * 
     * <strong>example:</strong>
     * <p>National</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The end of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-20</p>
     */
    @NameInMap("MaxDate")
    public String maxDate;

    /**
     * <p>The beginning of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-15</p>
     */
    @NameInMap("MinDate")
    public String minDate;

    /**
     * <p>Specifies whether to return other information about the application, such as statistics on resource instances and pods. The value must be a JSON string. By default, all information is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;appInfo\&quot;:true,\&quot;detailStat\&quot;: true, \&quot;appVersionStat\&quot;: true, \&quot;districtStat\&quot;:true ,\&quot;instanceStat\&quot;: true, \&quot;podCountStat\&quot;: true}</p>
     */
    @NameInMap("OutAppInfoParams")
    public String outAppInfoParams;

    /**
     * <p>The page number. Pages start from page 1. This parameter is optional if you want to return all information about the applications.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. This parameter is optional if you want to return all information about the applications.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
