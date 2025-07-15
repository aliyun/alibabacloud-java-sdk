// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageGroupShrinkRequest extends TeaModel {
    /**
     * <p>The list of administrators after your change.</p>
     */
    @NameInMap("AdminList")
    public String adminListShrink;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
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
     * <p>The group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The additional information about the group after the modification. The value can be up to 32 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>newmeta</p>
     */
    @NameInMap("GroupInfo")
    public String groupInfo;

    /**
     * <p>Specifies whether to change the group administrators.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ModifyAdmin")
    public Boolean modifyAdmin;

    /**
     * <p>Specifies whether to modify the additional information about the group.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ModifyInfo")
    public Boolean modifyInfo;

    public static ModifyLiveMessageGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageGroupShrinkRequest self = new ModifyLiveMessageGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageGroupShrinkRequest setAdminListShrink(String adminListShrink) {
        this.adminListShrink = adminListShrink;
        return this;
    }
    public String getAdminListShrink() {
        return this.adminListShrink;
    }

    public ModifyLiveMessageGroupShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyLiveMessageGroupShrinkRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ModifyLiveMessageGroupShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyLiveMessageGroupShrinkRequest setGroupInfo(String groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }
    public String getGroupInfo() {
        return this.groupInfo;
    }

    public ModifyLiveMessageGroupShrinkRequest setModifyAdmin(Boolean modifyAdmin) {
        this.modifyAdmin = modifyAdmin;
        return this;
    }
    public Boolean getModifyAdmin() {
        return this.modifyAdmin;
    }

    public ModifyLiveMessageGroupShrinkRequest setModifyInfo(Boolean modifyInfo) {
        this.modifyInfo = modifyInfo;
        return this;
    }
    public Boolean getModifyInfo() {
        return this.modifyInfo;
    }

}
