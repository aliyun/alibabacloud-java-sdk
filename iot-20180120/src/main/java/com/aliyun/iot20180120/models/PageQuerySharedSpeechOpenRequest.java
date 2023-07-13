// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PageQuerySharedSpeechOpenRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the device.</p>
     * <br>
     * <p>> If you specify this parameter, you do not need to specify **ProductKey** and **DeviceName**. **IotId** specifies the GUID of the device. The value of the IotId parameter is a combination of the values of the **ProductKey** and **DeviceName** parameters. If you specify the **IotId**, **ProductKey**, and **DeviceName** parameters, the value of the **IotId** parameter takes precedence.</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>  If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * <br>
     * <p>For more information, see the [Overview](~~356505~~) topic of IoT instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageId")
    public Integer pageId;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The **ProductKey** of the product to which the device belongs.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The code that is used to share the speeches.</p>
     * <br>
     * <p>You can obtain the **code** on the **Shared Corpus Management** page of **Speech Sending Voice Broadcasting Service**.</p>
     */
    @NameInMap("ShareTaskCode")
    public String shareTaskCode;

    /**
     * <p>The status of the speeches that you want to query. Valid values:</p>
     * <br>
     * <p>*   **1**: The speeches are pending approval.</p>
     * <p>*   **2**: The speeches are approved.</p>
     * <p>*   **3**: The speeches are rejected.</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static PageQuerySharedSpeechOpenRequest build(java.util.Map<String, ?> map) throws Exception {
        PageQuerySharedSpeechOpenRequest self = new PageQuerySharedSpeechOpenRequest();
        return TeaModel.build(map, self);
    }

    public PageQuerySharedSpeechOpenRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public PageQuerySharedSpeechOpenRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public PageQuerySharedSpeechOpenRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public PageQuerySharedSpeechOpenRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public PageQuerySharedSpeechOpenRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageQuerySharedSpeechOpenRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public PageQuerySharedSpeechOpenRequest setShareTaskCode(String shareTaskCode) {
        this.shareTaskCode = shareTaskCode;
        return this;
    }
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

    public PageQuerySharedSpeechOpenRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
