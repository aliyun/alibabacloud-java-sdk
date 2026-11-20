// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSecretTransferRecordRequest extends TeaModel {
    /**
     * <p>迁移后的新号码池key</p>
     * 
     * <strong>example:</strong>
     * <p>FC111111</p>
     */
    @NameInMap("LastPartnerKey")
    public String lastPartnerKey;

    /**
     * <p>指定号码（单一、批量）迁移;一次最多可迁移500个号码，号码间请换行隔开.</p>
     * 
     * <strong>example:</strong>
     * <p>198xxxxxxxx
     * 138xxxxxxx</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    /**
     * <p>要迁移的原号码池key</p>
     * 
     * <strong>example:</strong>
     * <p>FC123456</p>
     */
    @NameInMap("OriginPartnerKey")
    public String originPartnerKey;

    public static CreateSecretTransferRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretTransferRecordRequest self = new CreateSecretTransferRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecretTransferRecordRequest setLastPartnerKey(String lastPartnerKey) {
        this.lastPartnerKey = lastPartnerKey;
        return this;
    }
    public String getLastPartnerKey() {
        return this.lastPartnerKey;
    }

    public CreateSecretTransferRecordRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

    public CreateSecretTransferRecordRequest setOriginPartnerKey(String originPartnerKey) {
        this.originPartnerKey = originPartnerKey;
        return this;
    }
    public String getOriginPartnerKey() {
        return this.originPartnerKey;
    }

}
