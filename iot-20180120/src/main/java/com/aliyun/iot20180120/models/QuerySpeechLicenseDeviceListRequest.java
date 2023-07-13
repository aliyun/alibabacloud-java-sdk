// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechLicenseDeviceListRequest extends TeaModel {
    /**
     * <p>The ID of a device group. The InSpecifiedGroup response parameter indicates whether the devices belong to the specified group.</p>
     */
    @NameInMap("CheckGroupId")
    public String checkGroupId;

    /**
     * <p>The keyword in the DeviceName of the device whose information you want to query. Fuzzy match is supported.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The instance ID. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>  You must specify this parameter for a public instance of the new version or an Enterprise Edition instance. You do not need to specify this parameter for a public instance of the previous version.</p>
     * <br>
     * <p>For more information, see the [Overview](~~356505~~) topic of IoT instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The license status.</p>
     * <br>
     * <p>*   **NORMAL**: The license is valid.</p>
     * <p>*   **EXPIRE**: The license is expired.</p>
     * <p>*   **EXPIRING**: The license is about to expire.</p>
     */
    @NameInMap("LicenseStatusList")
    public java.util.List<String> licenseStatusList;

    /**
     * <p>The page number. Valid values: 1 to 10000.</p>
     */
    @NameInMap("PageId")
    public Integer pageId;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The **ProductKey** of the product to which the devices belong.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QuerySpeechLicenseDeviceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechLicenseDeviceListRequest self = new QuerySpeechLicenseDeviceListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpeechLicenseDeviceListRequest setCheckGroupId(String checkGroupId) {
        this.checkGroupId = checkGroupId;
        return this;
    }
    public String getCheckGroupId() {
        return this.checkGroupId;
    }

    public QuerySpeechLicenseDeviceListRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QuerySpeechLicenseDeviceListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySpeechLicenseDeviceListRequest setLicenseStatusList(java.util.List<String> licenseStatusList) {
        this.licenseStatusList = licenseStatusList;
        return this;
    }
    public java.util.List<String> getLicenseStatusList() {
        return this.licenseStatusList;
    }

    public QuerySpeechLicenseDeviceListRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QuerySpeechLicenseDeviceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySpeechLicenseDeviceListRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
