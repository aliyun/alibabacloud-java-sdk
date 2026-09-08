// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartChatShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the web service channel.</p>
     * 
     * <strong>example:</strong>
     * <p>cf584733-<em><strong>-</strong></em>-9699-cb77aa3b7aa6</p>
     */
    @NameInMap("AccessChannelId")
    public String accessChannelId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The channel token for the web service.</p>
     * 
     * <strong>example:</strong>
     * <p>9XYGTGWtq2wFi_Bpg7aUnIoYi_vG_rO3bjEn0YtsxbHRHrYHlz1LDBLJAyZcLxieRQR4h_6AnWvTjJeNU5jg************Hwej7WgWrmA=</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The information about chat members.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserList")
    public String userListShrink;

    public static StartChatShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartChatShrinkRequest self = new StartChatShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartChatShrinkRequest setAccessChannelId(String accessChannelId) {
        this.accessChannelId = accessChannelId;
        return this;
    }
    public String getAccessChannelId() {
        return this.accessChannelId;
    }

    public StartChatShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartChatShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public StartChatShrinkRequest setUserListShrink(String userListShrink) {
        this.userListShrink = userListShrink;
        return this;
    }
    public String getUserListShrink() {
        return this.userListShrink;
    }

}
