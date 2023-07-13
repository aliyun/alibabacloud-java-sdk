// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetProductCertInfoRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the ID of the instance on the **Overview** page in the IoT Platform console.****</p>
     * <br>
     * <p>>  If your instance has an ID, you must specify the ID for the parameter. Otherwise, the call fails. If no Overview page or ID is generated for your instance, you do not need configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The source from which the X.509 certificate is issued.</p>
     * <br>
     * <p>*   **1**: The X.509 certificate is issued by IoT Platform.</p>
     * <p>*   **3**: The X.509 certificate is issued by a third-party platform.</p>
     */
    @NameInMap("IssueModel")
    public Integer issueModel;

    /**
     * <p>The **ProductKey** of the product.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static SetProductCertInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetProductCertInfoRequest self = new SetProductCertInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetProductCertInfoRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetProductCertInfoRequest setIssueModel(Integer issueModel) {
        this.issueModel = issueModel;
        return this;
    }
    public Integer getIssueModel() {
        return this.issueModel;
    }

    public SetProductCertInfoRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
