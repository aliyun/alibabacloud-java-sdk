// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyAlipayCashierPaymentCallbackUrlRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("FailureCallbackUrl")
    public String failureCallbackUrl;

    @NameInMap("SuccessCallbackUrl")
    public String successCallbackUrl;

    public static ModifyAlipayCashierPaymentCallbackUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAlipayCashierPaymentCallbackUrlRequest self = new ModifyAlipayCashierPaymentCallbackUrlRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAlipayCashierPaymentCallbackUrlRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyAlipayCashierPaymentCallbackUrlRequest setFailureCallbackUrl(String failureCallbackUrl) {
        this.failureCallbackUrl = failureCallbackUrl;
        return this;
    }
    public String getFailureCallbackUrl() {
        return this.failureCallbackUrl;
    }

    public ModifyAlipayCashierPaymentCallbackUrlRequest setSuccessCallbackUrl(String successCallbackUrl) {
        this.successCallbackUrl = successCallbackUrl;
        return this;
    }
    public String getSuccessCallbackUrl() {
        return this.successCallbackUrl;
    }

}
