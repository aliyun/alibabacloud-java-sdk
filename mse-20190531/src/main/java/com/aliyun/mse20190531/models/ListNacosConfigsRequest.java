// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosConfigsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ID of the data.</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The name of the group. Default value: `default`</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which the instance resides. The region is supported by Microservices Engine (MSE).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The extended request parameters. The JSON format is supported.</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static ListNacosConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNacosConfigsRequest self = new ListNacosConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListNacosConfigsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListNacosConfigsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListNacosConfigsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListNacosConfigsRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListNacosConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListNacosConfigsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListNacosConfigsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListNacosConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNacosConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNacosConfigsRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public ListNacosConfigsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
