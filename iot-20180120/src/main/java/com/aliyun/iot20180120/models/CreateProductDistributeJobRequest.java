// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductDistributeJobRequest extends TeaModel {
    /**
     * <p>The **ProductKey** of the product to be published.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the source instance to which the product belongs.</p>
     * <br>
     * <p>*   The IDs of public instances in different regions:</p>
     * <br>
     * <p>    *   China (Shanghai): iotx-oxssharez200.</p>
     * <p>    *   Japan (Tokyo): iotx-oxssharez300.</p>
     * <p>    *   Singapore (Singapore): iotx-oxssharez400.</p>
     * <p>    *   US (Silicon Valley): iotx-oxssharez500.</p>
     * <p>    *   US (Virginia): iotx-oxssharez600.</p>
     * <p>    *   Germany (Frankfurt): iotx-oxssharez700.</p>
     * <br>
     * <p>*   The IDs of Enterprise Edition instances:</p>
     * <br>
     * <p>    1\. Log on to the IoT Platform console. Select a region from the drop-down list in the upper-left corner of the top navigation bar.</p>
     * <br>
     * <p>    2\. On the **Overview** page, click the instance name. On the **Instance Details** page, view the instance ID in the **Basic Information** section.</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The Alibaba Cloud account to which the product belongs. You can log on to the IoT Platform console, click the profile picture, and then view **Logon Account** on the **Security Settings** page.</p>
     * <br>
     * <p>The **TargetUid** and **TargetAliyunId** parameters cannot be left empty at the same time.</p>
     */
    @NameInMap("TargetAliyunId")
    public String targetAliyunId;

    /**
     * <p>The ID of the destination instance to which the product is distributed. For more information about instance IDs, see the description of the **SourceInstanceId** parameter.</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the product belongs. You can log on to the IoT Platform console, click the profile picture, and then view **Account ID** on the **Security Settings** page.</p>
     * <br>
     * <p>The **TargetUid** and **TargetAliyunId** parameters cannot be left empty at the same time.</p>
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
