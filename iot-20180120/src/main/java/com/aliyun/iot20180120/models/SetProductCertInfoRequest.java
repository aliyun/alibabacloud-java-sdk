// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetProductCertInfoRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("IssueModel")
    public Integer issueModel;

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
