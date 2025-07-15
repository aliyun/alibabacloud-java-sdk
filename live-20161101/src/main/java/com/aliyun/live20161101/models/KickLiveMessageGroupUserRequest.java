// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class KickLiveMessageGroupUserRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application to which the interactive messaging group belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>coims-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The ID of the interactive messaging group from which you want to remove the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The user that you want to remove.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uid1</p>
     */
    @NameInMap("KickoffUser")
    public String kickoffUser;

    public static KickLiveMessageGroupUserRequest build(java.util.Map<String, ?> map) throws Exception {
        KickLiveMessageGroupUserRequest self = new KickLiveMessageGroupUserRequest();
        return TeaModel.build(map, self);
    }

    public KickLiveMessageGroupUserRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public KickLiveMessageGroupUserRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public KickLiveMessageGroupUserRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public KickLiveMessageGroupUserRequest setKickoffUser(String kickoffUser) {
        this.kickoffUser = kickoffUser;
        return this;
    }
    public String getKickoffUser() {
        return this.kickoffUser;
    }

}
