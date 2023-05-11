// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAJobByFirmwareRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the update package.</p>
     * <br>
     * <p>An update package ID is returned when you call the [CreateOTAFirmware](~~147311~~) operation to create the update package.</p>
     * <br>
     * <p>You can call the [ListOTAFirmware](~~147450~~) operation and view the update package ID in the response.</p>
     */
    @NameInMap("FirmwareId")
    public String firmwareId;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries to return on each page. Maximum value: 200.</p>
     */
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
