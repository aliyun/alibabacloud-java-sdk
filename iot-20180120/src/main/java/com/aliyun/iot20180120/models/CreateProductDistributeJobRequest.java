// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductDistributeJobRequest extends TeaModel {
    /**
     * <p>The <strong>ProductKey</strong> of the product to be published.</p>
     * <p>This parameter is required.</p>
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
     * <li><p>The IDs of Enterprise Edition instances:</p>
     * <p>1\. Log on to the IoT Platform console. Select a region from the drop-down list in the upper-left corner of the top navigation bar.</p>
     * <p>2\. On the <strong>Overview</strong> page, click the instance name. On the <strong>Instance Details</strong> page, view the instance ID in the <strong>Basic Information</strong> section.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-st2***</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The Alibaba Cloud account to which the product belongs. You can log on to the IoT Platform console, click the profile picture, and then view <strong>Logon Account</strong> on the <strong>Security Settings</strong> page.</p>
     * <p>The <strong>TargetUid</strong> and <strong>TargetAliyunId</strong> parameters cannot be left empty at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>io****@example.com</p>
     */
    @NameInMap("TargetAliyunId")
    public String targetAliyunId;

    /**
     * <p>The ID of the destination instance to which the product is distributed. For more information about instance IDs, see the description of the <strong>SourceInstanceId</strong> parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-6ja***</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the product belongs. You can log on to the IoT Platform console, click the profile picture, and then view <strong>Account ID</strong> on the <strong>Security Settings</strong> page.</p>
     * <p>The <strong>TargetUid</strong> and <strong>TargetAliyunId</strong> parameters cannot be left empty at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>198***</p>
     */
    @NameInMap("TargetUid")
    public String targetUid;

    public static CreateProductDistributeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductDistributeJobRequest self = new CreateProductDistributeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductDistributeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateProductDistributeJobRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateProductDistributeJobRequest setTargetAliyunId(String targetAliyunId) {
        this.targetAliyunId = targetAliyunId;
        return this;
    }
    public String getTargetAliyunId() {
        return this.targetAliyunId;
    }

    public CreateProductDistributeJobRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public CreateProductDistributeJobRequest setTargetUid(String targetUid) {
        this.targetUid = targetUid;
        return this;
    }
    public String getTargetUid() {
        return this.targetUid;
    }

}
