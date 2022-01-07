// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAJobByFirmwareRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("FirmwareId")
    public String firmwareId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListOTAJobByFirmwareRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOTAJobByFirmwareRequest self = new ListOTAJobByFirmwareRequest();
        return TeaModel.build(map, self);
    }

    public ListOTAJobByFirmwareRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTAJobByFirmwareRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public ListOTAJobByFirmwareRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListOTAJobByFirmwareRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
