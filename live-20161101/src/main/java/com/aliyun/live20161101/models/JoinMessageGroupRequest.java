// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class JoinMessageGroupRequest extends TeaModel {
    /**
     * <p>Interactive message application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a494caec-***-695ef345db77</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether to broadcast statistics messages. When enabled, statistics information of the message group will be broadcast after joining the message group, and the client can receive and process this message. Valid values:</p>
     * <ul>
     * <li>true: Broadcast statistics messages.</li>
     * <li>false: Do not broadcast statistics messages.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BroadCastStatistics")
    public Boolean broadCastStatistics;

    /**
     * <p>System message diffusion type. Valid values:</p>
     * <ul>
     * <li>0 (default): No diffusion.</li>
     * <li>1: Diffusion to specified users.</li>
     * <li>2: Diffusion to the group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BroadCastType")
    public Integer broadCastType;

    /**
     * <p>The ID of the message group to join. Make sure the GroupId you provide exists.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AE35-****-T95F</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>User ID, which is customized by the user and must be unique under the AppId. It can contain lowercase letters, numbers, underscores (_), and periods (.). The maximum length is 32 characters. Different users must use different UserIds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de1**a0</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static JoinMessageGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinMessageGroupRequest self = new JoinMessageGroupRequest();
        return TeaModel.build(map, self);
    }

    public JoinMessageGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public JoinMessageGroupRequest setBroadCastStatistics(Boolean broadCastStatistics) {
        this.broadCastStatistics = broadCastStatistics;
        return this;
    }
    public Boolean getBroadCastStatistics() {
        return this.broadCastStatistics;
    }

    public JoinMessageGroupRequest setBroadCastType(Integer broadCastType) {
        this.broadCastType = broadCastType;
        return this;
    }
    public Integer getBroadCastType() {
        return this.broadCastType;
    }

    public JoinMessageGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public JoinMessageGroupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
