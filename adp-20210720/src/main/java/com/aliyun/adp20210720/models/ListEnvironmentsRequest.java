// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListEnvironmentsRequest extends TeaModel {
    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("name")
    public String name;

    @NameInMap("fuzzy")
    public String fuzzy;

    @NameInMap("instanceStatus")
    public String instanceStatus;

    @NameInMap("vendorType")
    public String vendorType;

    @NameInMap("clusterUID")
    public String clusterUID;

    public static ListEnvironmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsRequest self = new ListEnvironmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListEnvironmentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEnvironmentsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListEnvironmentsRequest setFuzzy(String fuzzy) {
        this.fuzzy = fuzzy;
        return this;
    }
    public String getFuzzy() {
        return this.fuzzy;
    }

    public ListEnvironmentsRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public ListEnvironmentsRequest setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public ListEnvironmentsRequest setClusterUID(String clusterUID) {
        this.clusterUID = clusterUID;
        return this;
    }
    public String getClusterUID() {
        return this.clusterUID;
    }

}
