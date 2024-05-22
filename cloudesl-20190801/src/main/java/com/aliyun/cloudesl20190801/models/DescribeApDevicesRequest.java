// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribeApDevicesRequest extends TeaModel {
    @NameInMap("Activated")
    public Boolean activated;

    @NameInMap("ApMac")
    public String apMac;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    public static DescribeApDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApDevicesRequest self = new DescribeApDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApDevicesRequest setActivated(Boolean activated) {
        this.activated = activated;
        return this;
    }
    public Boolean getActivated() {
        return this.activated;
    }

    public DescribeApDevicesRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
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

    public DescribeApDevicesRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
