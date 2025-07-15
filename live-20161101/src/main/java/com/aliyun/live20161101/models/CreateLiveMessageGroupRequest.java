// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveMessageGroupRequest extends TeaModel {
    /**
     * <p>The list of administrators.</p>
     */
    @NameInMap("Administrators")
    public java.util.List<String> administrators;

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

    public static CreateLiveMessageGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveMessageGroupRequest self = new CreateLiveMessageGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveMessageGroupRequest setAdministrators(java.util.List<String> administrators) {
        this.administrators = administrators;
        return this;
    }
    public java.util.List<String> getAdministrators() {
        return this.administrators;
    }

    public CreateLiveMessageGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLiveMessageGroupRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public CreateLiveMessageGroupRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public CreateLiveMessageGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateLiveMessageGroupRequest setGroupInfo(String groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }
    public String getGroupInfo() {
        return this.groupInfo;
    }

    public CreateLiveMessageGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
