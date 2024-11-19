// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDistributedProductRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page. Maximum value: 200.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The <strong>ProductKey</strong> of the product.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the source instance to which the product belongs.</p>
     * <ul>
     * <li><p>The IDs of public instances in different regions:</p>
     * <ul>
     * <li>China (Shanghai): iotx-oxssharez200.</li>
     * <li>Japan (Tokyo): iotx-oxssharez300.</li>
     * <li>Singapore (Singapore): iotx-oxssharez400.</li>
     * <li>US (Silicon Valley): iotx-oxssharez500.</li>
     * <li>US (Virginia): iotx-oxssharez600.</li>
     * <li>Germany (Frankfurt): iotx-oxssharez700.</li>
     * </ul>
     * </li>
     * <li><p>To view the ID of an Enterprise Edition instance, perform the following steps:</p>
     * <p>1\. Log on to the <a href="https://iot.console.aliyun.com/">IoT Platform console</a>. In the top navigation bar, select the region where the instance resides from the drop-down list.</p>
     * <p>2\. On the <strong>Overview</strong> page, view the <strong>ID</strong> of the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>iot-060***</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The ID of the destination instance to which the product is distributed. For more information about instance IDs, see the description of the <strong>SourceInstanceId</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-6ja***</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the product belongs. You can log on to the IoT Platform console, click the profile picture, and then view the <strong>account ID</strong> on the <strong>Security Settings</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>198***</p>
     */
    @NameInMap("TargetUid")
    public String targetUid;

    public static ListDistributedProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDistributedProductRequest self = new ListDistributedProductRequest();
        return TeaModel.build(map, self);
    }

    public ListDistributedProductRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDistributedProductRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDistributedProductRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ListDistributedProductRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public ListDistributedProductRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public ListDistributedProductRequest setTargetUid(String targetUid) {
        this.targetUid = targetUid;
        return this;
    }
    public String getTargetUid() {
        return this.targetUid;
    }

}
