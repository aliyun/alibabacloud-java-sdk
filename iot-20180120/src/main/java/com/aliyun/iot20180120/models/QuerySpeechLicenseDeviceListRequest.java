// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechLicenseDeviceListRequest extends TeaModel {
    @NameInMap("CheckGroupId")
    public String checkGroupId;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("LicenseStatusList")
    public java.util.List<String> licenseStatusList;

    @NameInMap("PageId")
    public Integer pageId;

    @NameInMap("PageSize")
    public Integer pageSize;

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
