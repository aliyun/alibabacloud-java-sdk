// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhoneList")
    public java.util.Map<String, ?> phoneList;

    public static BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest self = new BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest setPhoneList(java.util.Map<String, ?> phoneList) {
        this.phoneList = phoneList;
        return this;
    }
    public java.util.Map<String, ?> getPhoneList() {
        return this.phoneList;
    }

}
