// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAFirmwareRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DestVersion")
    public String destVersion;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductKey")
    public String productKey;

    public static ListOTAFirmwareRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOTAFirmwareRequest self = new ListOTAFirmwareRequest();
        return TeaModel.build(map, self);
    }

    public ListOTAFirmwareRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTAFirmwareRequest setDestVersion(String destVersion) {
        this.destVersion = destVersion;
        return this;
    }
    public String getDestVersion() {
        return this.destVersion;
    }

    public ListOTAFirmwareRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListOTAFirmwareRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTAFirmwareRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
