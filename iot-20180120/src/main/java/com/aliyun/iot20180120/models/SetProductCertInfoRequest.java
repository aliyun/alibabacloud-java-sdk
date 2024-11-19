// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetProductCertInfoRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.****</p>
     * <blockquote>
     * <p> If your instance has an ID, you must specify the ID for the parameter. Otherwise, the call fails. If no Overview page or ID is generated for your instance, you do not need configure this parameter.</p>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The source from which the X.509 certificate is issued.</p>
     * <ul>
     * <li><strong>1</strong>: The X.509 certificate is issued by IoT Platform.</li>
     * <li><strong>3</strong>: The X.509 certificate is issued by a third-party platform.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IssueModel")
    public Integer issueModel;

    /**
     * <p>The <strong>ProductKey</strong> of the product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aS2dewS****</p>
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
