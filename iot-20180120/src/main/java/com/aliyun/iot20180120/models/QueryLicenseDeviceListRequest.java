// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryLicenseDeviceListRequest extends TeaModel {
    /**
     * <p>The end time of the time range in which the license is bound to the devices.The timestamp follows the UNIX time format. It is the number of seconds that have elapsed since 00:00:00 Thursday, January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1620934297000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the device.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69905.html">QueryDevice</a> operation to query the <strong>IotId</strong> values of all devices that belong to a specific product.</p>
     * 
     * <strong>example:</strong>
     * <p>Q7uOhVRdZRRlDnTLv****00100</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p> You must specify this parameter for a public instance of the new version or an Enterprise Edition instance. You do not need to specify this parameter for a public instance of the previous version.</p>
     * </blockquote>
     * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-ws4***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The license type that specifies the audio and video specifications. Valid values: <strong>480P</strong> and <strong>720P</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>720P</p>
     */
    @NameInMap("LicenseCode")
    public String licenseCode;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageId")
    public Integer pageId;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the devices belong.</p>
     * <p>You can go to the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to view the information about all products of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>es****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The start time of the time range in which the license is bound to the devices. The timestamp follows the UNIX time format. It is the number of seconds that have elapsed since 00:00:00 Thursday, January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1620634297000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryLicenseDeviceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLicenseDeviceListRequest self = new QueryLicenseDeviceListRequest();
        return TeaModel.build(map, self);
    }

    public QueryLicenseDeviceListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryLicenseDeviceListRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryLicenseDeviceListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryLicenseDeviceListRequest setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

    public QueryLicenseDeviceListRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QueryLicenseDeviceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryLicenseDeviceListRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryLicenseDeviceListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
