// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BanLiveMessageGroupRequest extends TeaModel {
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
     * <p>The data center. This value must be the same as the data center that you specified when you called <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a>.</p>
     * <blockquote>
     * <p>The supported data centers are China (Shanghai) (cn-shanghai) and Singapore (ap-southeast-1).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The users who are exempt from the group-wide mute. Specify up to 30 users. Separate multiple user IDs with a comma (,).</p>
     */
    @NameInMap("ExceptUsers")
    public java.util.List<String> exceptUsers;

    /**
     * <p>The group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    public static BanLiveMessageGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        BanLiveMessageGroupRequest self = new BanLiveMessageGroupRequest();
        return TeaModel.build(map, self);
    }

    public BanLiveMessageGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BanLiveMessageGroupRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public BanLiveMessageGroupRequest setExceptUsers(java.util.List<String> exceptUsers) {
        this.exceptUsers = exceptUsers;
        return this;
    }
    public java.util.List<String> getExceptUsers() {
        return this.exceptUsers;
    }

    public BanLiveMessageGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
