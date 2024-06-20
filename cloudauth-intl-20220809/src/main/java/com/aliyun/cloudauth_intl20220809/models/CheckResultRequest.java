// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CheckResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ExtraImageControlList")
    public String extraImageControlList;

    /**
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("IsReturnImage")
    public String isReturnImage;

    /**
     * <strong>example:</strong>
     * <p>djs20d***9-dsskc</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("ReturnFiveCategorySpoofResult")
    public String returnFiveCategorySpoofResult;

    /**
     * <strong>example:</strong>
     * <p>4ab0b***cbde97</p>
     */
    @NameInMap("TransactionId")
    public String transactionId;

    public static CheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResultRequest self = new CheckResultRequest();
        return TeaModel.build(map, self);
    }

    public CheckResultRequest setExtraImageControlList(String extraImageControlList) {
        this.extraImageControlList = extraImageControlList;
        return this;
    }
    public String getExtraImageControlList() {
        return this.extraImageControlList;
    }

    public CheckResultRequest setIsReturnImage(String isReturnImage) {
        this.isReturnImage = isReturnImage;
        return this;
    }
    public String getIsReturnImage() {
        return this.isReturnImage;
    }

    public CheckResultRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public CheckResultRequest setReturnFiveCategorySpoofResult(String returnFiveCategorySpoofResult) {
        this.returnFiveCategorySpoofResult = returnFiveCategorySpoofResult;
        return this;
    }
    public String getReturnFiveCategorySpoofResult() {
        return this.returnFiveCategorySpoofResult;
    }

    public CheckResultRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
