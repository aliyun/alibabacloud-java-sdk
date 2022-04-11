// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RefundInstanceRequest extends TeaModel {
    // clientToken
    @NameInMap("ClientToken")
    public String clientToken;

    // immediatelyRelease
    @NameInMap("ImmediatelyRelease")
    public String immediatelyRelease;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // productCode
    @NameInMap("ProductCode")
    public String productCode;

    // productType
    @NameInMap("ProductType")
    public String productType;

    public static RefundInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundInstanceRequest self = new RefundInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RefundInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RefundInstanceRequest setImmediatelyRelease(String immediatelyRelease) {
        this.immediatelyRelease = immediatelyRelease;
        return this;
    }
    public String getImmediatelyRelease() {
        return this.immediatelyRelease;
    }

    public RefundInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RefundInstanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RefundInstanceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
