// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageUserInfoRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application whose user information you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2593195.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The ID of the user whose information you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uid2</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The additional information about the user after the modification. The value can be up to 512 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>uid2meta2</p>
     */
    @NameInMap("UserMetaInfo")
    public String userMetaInfo;

    public static ModifyLiveMessageUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageUserInfoRequest self = new ModifyLiveMessageUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageUserInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyLiveMessageUserInfoRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ModifyLiveMessageUserInfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ModifyLiveMessageUserInfoRequest setUserMetaInfo(String userMetaInfo) {
        this.userMetaInfo = userMetaInfo;
        return this;
    }
    public String getUserMetaInfo() {
        return this.userMetaInfo;
    }

}
