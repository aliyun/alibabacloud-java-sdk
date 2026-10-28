// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ResendVerifyActivateRequest extends TeaModel {
    /**
     * <p>The channel type.</p>
     * 
     * <strong>example:</strong>
     * <p>PHONE</p>
     */
    @NameInMap("channelType")
    public String channelType;

    public static ResendVerifyActivateRequest build(java.util.Map<String, ?> map) throws Exception {
        ResendVerifyActivateRequest self = new ResendVerifyActivateRequest();
        return TeaModel.build(map, self);
    }

    public ResendVerifyActivateRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

}
