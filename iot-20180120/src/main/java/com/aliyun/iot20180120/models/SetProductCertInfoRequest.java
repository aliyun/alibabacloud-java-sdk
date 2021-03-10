// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetProductCertInfoRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("IssueModel")
    @Validation(required = true)
    public Integer issueModel;

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

    public SetProductCertInfoRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public SetProductCertInfoRequest setIssueModel(Integer issueModel) {
        this.issueModel = issueModel;
        return this;
    }
    public Integer getIssueModel() {
        return this.issueModel;
    }

}
