// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PageQuerySharedSpeechOpenRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>device1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the device.</p>
     * <blockquote>
     * <p>If you specify this parameter, you do not need to specify <strong>ProductKey</strong> and <strong>DeviceName</strong>. <strong>IotId</strong> specifies the GUID of the device. The value of the IotId parameter is a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Q7uOhVRdZRRlDnTLv****00100</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * </blockquote>
     * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-2w****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageId")
    public Integer pageId;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>sd34****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The code that is used to share the speeches.</p>
     * <p>You can obtain the <strong>code</strong> on the <strong>Shared Corpus Management</strong> page of <strong>Speech Sending Voice Broadcasting Service</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ebed9280_ba25_48df_80c2_****</p>
     */
    @NameInMap("ShareTaskCode")
    public String shareTaskCode;

    /**
     * <p>The status of the speeches that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: The speeches are pending approval.</li>
     * <li><strong>2</strong>: The speeches are approved.</li>
     * <li><strong>3</strong>: The speeches are rejected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
