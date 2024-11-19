// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAFirmwareRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The version number of the OTA update package. If you specify this parameter, only the OTA update package of the specified version number is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4.0.0</p>
     */
    @NameInMap("DestVersion")
    public String destVersion;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the OTA update package belongs.</p>
     * <p>If you specify this parameter, IoT Platform returns the OTA update packages of the specified product. If you do not specify this parameter, IoT Platform returns the OTA update packages of the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>a19mzPZ****</p>
     */
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
