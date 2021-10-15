// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeApDevicesRequest extends TeaModel {
    @NameInMap("ApMac")
    public String apMac;

    @NameInMap("BeActivate")
    public Boolean beActivate;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("Model")
    public String model;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("StoreId")
    public String storeId;

    public static DescribeApDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApDevicesRequest self = new DescribeApDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApDevicesRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public DescribeApDevicesRequest setBeActivate(Boolean beActivate) {
        this.beActivate = beActivate;
        return this;
    }
    public Boolean getBeActivate() {
        return this.beActivate;
    }

    public DescribeApDevicesRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public DescribeApDevicesRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public DescribeApDevicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApDevicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApDevicesRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public DescribeApDevicesRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
