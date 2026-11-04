// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserGroupRequest extends TeaModel {
    /**
     * <p>The business isolation ID. It is used to isolate data between different business applications under the same Alibaba Cloud account. It supports uppercase and lowercase English letters and digits.</p>
     * <p>For example, if you have facial recognition businesses in Region A and Region B, you can set different business isolation IDs to distinguish the facial recognition businesses in Region A and Region B.</p>
     * <blockquote>
     * <p>Notice: 
     * Save the business isolation ID properly for use when you call other API operations in this business isolation zone.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheJiangHZ</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The name of the user group. Specify a custom value. The value can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestUserGroup</p>
     */
    @NameInMap("UserGroupName")
    public String userGroupName;

    public static AddFaceUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserGroupRequest self = new AddFaceUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceUserGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public AddFaceUserGroupRequest setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }
    public String getUserGroupName() {
        return this.userGroupName;
    }

}
