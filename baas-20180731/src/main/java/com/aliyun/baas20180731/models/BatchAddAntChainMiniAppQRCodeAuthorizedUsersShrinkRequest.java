// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class BatchAddAntChainMiniAppQRCodeAuthorizedUsersShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhoneList")
    public String phoneListShrink;

    public static BatchAddAntChainMiniAppQRCodeAuthorizedUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddAntChainMiniAppQRCodeAuthorizedUsersShrinkRequest self = new BatchAddAntChainMiniAppQRCodeAuthorizedUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersShrinkRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersShrinkRequest setPhoneListShrink(String phoneListShrink) {
        this.phoneListShrink = phoneListShrink;
        return this;
    }
    public String getPhoneListShrink() {
        return this.phoneListShrink;
    }

}
