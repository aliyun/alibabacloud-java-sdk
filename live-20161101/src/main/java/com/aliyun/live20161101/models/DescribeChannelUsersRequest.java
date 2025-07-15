// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeChannelUsersRequest extends TeaModel {
    /**
     * <p>The application ID. You can specify only one application ID in a request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aec****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The channel ID. You can specify only one channel ID in a request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    public static DescribeChannelUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelUsersRequest self = new DescribeChannelUsersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChannelUsersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeChannelUsersRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
