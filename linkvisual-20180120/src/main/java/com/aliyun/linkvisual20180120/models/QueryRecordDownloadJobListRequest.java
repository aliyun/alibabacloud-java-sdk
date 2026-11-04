// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordDownloadJobListRequest extends TeaModel {
    /**
     * <p>Specifies the page number to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The DeviceName of the video device. You can view the <strong>DeviceName</strong> of devices under a specified product on the <strong>Devices</strong> page in the <a href="https://iot.console.aliyun.com/devices">IoT Platform console</a> or by calling the <a href="https://help.aliyun.com/document_detail/69905.html">QueryDevice</a> operation.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Device01</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the video device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation to query the ID.</p>
     * <blockquote>
     * <p>Notice:  <strong>IotId</strong> is the unique identifier of the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>C47T6xwp6ms4bNlkHRWCg4****</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID. You can view the ID of the current instance on the <strong>Instance Overview</strong> tab in the IoT Platform console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-2w******</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>Specifies the number of entries to return per page. Maximum value: 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the video device belongs.</p>
     * <p>You can view the information of all products under the current instance on the <strong>Products</strong> page in the <a href="https://iot.console.aliyun.com/product">IoT Platform console</a> or by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1Bw******</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryRecordDownloadJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordDownloadJobListRequest self = new QueryRecordDownloadJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordDownloadJobListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryRecordDownloadJobListRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryRecordDownloadJobListRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryRecordDownloadJobListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryRecordDownloadJobListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRecordDownloadJobListRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
