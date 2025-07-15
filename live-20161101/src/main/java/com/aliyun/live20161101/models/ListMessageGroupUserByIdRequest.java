// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageGroupUserByIdRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VKL3***</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the message group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AE35-****-T95F</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The list of users.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserIdList")
    public java.util.List<String> userIdList;

    public static ListMessageGroupUserByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessageGroupUserByIdRequest self = new ListMessageGroupUserByIdRequest();
        return TeaModel.build(map, self);
    }

    public ListMessageGroupUserByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListMessageGroupUserByIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListMessageGroupUserByIdRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

}
