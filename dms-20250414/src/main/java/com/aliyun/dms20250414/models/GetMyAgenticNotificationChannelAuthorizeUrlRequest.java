// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetMyAgenticNotificationChannelAuthorizeUrlRequest extends TeaModel {
    /**
     * <p>The notification channel type. Currently, only FEISHU (the Chinese version of Lark) is supported. Specifying other values results in a parameter error.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FEISHU</p>
     */
    @NameInMap("Channel")
    public String channel;

    public static GetMyAgenticNotificationChannelAuthorizeUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMyAgenticNotificationChannelAuthorizeUrlRequest self = new GetMyAgenticNotificationChannelAuthorizeUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetMyAgenticNotificationChannelAuthorizeUrlRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

}
