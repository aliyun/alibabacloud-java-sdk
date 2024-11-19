// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechLicenseDeviceListRequest extends TeaModel {
    /**
     * <p>The ID of a device group. The InSpecifiedGroup response parameter indicates whether the devices belong to the specified group.</p>
     * 
     * <strong>example:</strong>
     * <p>4de2c367**<strong>8c585e5992</strong></p>
     */
    @NameInMap("CheckGroupId")
    public String checkGroupId;

    /**
     * <p>The keyword in the DeviceName of the device whose information you want to query. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p> You must specify this parameter for a public instance of the new version or an Enterprise Edition instance. You do not need to specify this parameter for a public instance of the previous version.</p>
     * </blockquote>
     * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-e3***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The license status.</p>
     * <ul>
     * <li><strong>NORMAL</strong>: The license is valid.</li>
     * <li><strong>EXPIRE</strong>: The license is expired.</li>
     * <li><strong>EXPIRING</strong>: The license is about to expire.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("LicenseStatusList")
    public java.util.List<String> licenseStatusList;

    /**
     * <p>The page number. Valid values: 1 to 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageId")
    public Integer pageId;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the devices belong.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
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
