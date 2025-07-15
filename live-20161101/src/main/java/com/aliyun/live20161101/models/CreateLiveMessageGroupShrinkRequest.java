// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveMessageGroupShrinkRequest extends TeaModel {
    /**
     * <p>The list of administrators.</p>
     */
    @NameInMap("Administrators")
    public String administratorsShrink;

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
     * <p>The ID of the group creator. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
     * 
     * <strong>example:</strong>
     * <p>uid1</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2593195.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The ID of the group that you want to create. The group ID must be unique within your business. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The additional information about the group. The value can be up to 32 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testgroupinfo</p>
     */
    @NameInMap("GroupInfo")
    public String groupInfo;

    /**
     * <p>The name of the group. The name can be up to 128 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>mytestgroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static CreateLiveMessageGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveMessageGroupShrinkRequest self = new CreateLiveMessageGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveMessageGroupShrinkRequest setAdministratorsShrink(String administratorsShrink) {
        this.administratorsShrink = administratorsShrink;
        return this;
    }
    public String getAdministratorsShrink() {
        return this.administratorsShrink;
    }

    public CreateLiveMessageGroupShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLiveMessageGroupShrinkRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public CreateLiveMessageGroupShrinkRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public CreateLiveMessageGroupShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateLiveMessageGroupShrinkRequest setGroupInfo(String groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }
    public String getGroupInfo() {
        return this.groupInfo;
    }

    public CreateLiveMessageGroupShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
