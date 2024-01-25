// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListEnvironmentsRequest extends TeaModel {
    @NameInMap("clusterUID")
    public String clusterUID;

    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("foundationType")
    public String foundationType;

    @NameInMap("fuzzy")
    public String fuzzy;

    @NameInMap("instanceStatus")
    public String instanceStatus;

    @NameInMap("name")
    public String name;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("type")
    public String type;

    @NameInMap("vendorType")
    public String vendorType;

    public static ListEnvironmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsRequest self = new ListEnvironmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsRequest setClusterUID(String clusterUID) {
        this.clusterUID = clusterUID;
        return this;
    }
    public String getClusterUID() {
        return this.clusterUID;
    }

    public ListEnvironmentsRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public ListEnvironmentsRequest setFoundationType(String foundationType) {
        this.foundationType = foundationType;
        return this;
    }
    public String getFoundationType() {
        return this.foundationType;
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

    public ListEnvironmentsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public ListEnvironmentsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListEnvironmentsRequest setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
