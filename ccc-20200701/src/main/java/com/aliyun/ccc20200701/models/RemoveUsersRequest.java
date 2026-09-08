// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemoveUsersRequest extends TeaModel {
    /**
     * <p>The ObjectKey of the OSS object containing the file with the list of users to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>temp/removeUsers.xlsx</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>Specifies whether to force delete.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Notification email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:123@abc.com">123@abc.com</a></p>
     */
    @NameInMap("NotificationEmail")
    public String notificationEmail;

    /**
     * <p>A JSON-formatted string representing an array of agent IDs. Each array element is an agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;agent1@ccc-test&quot;,&quot;agent2@ccc-test&quot;]</p>
     */
    @NameInMap("UserIdList")
    public String userIdList;

    public static RemoveUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersRequest self = new RemoveUsersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUsersRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public RemoveUsersRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public RemoveUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveUsersRequest setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
        return this;
    }
    public String getNotificationEmail() {
        return this.notificationEmail;
    }

    public RemoveUsersRequest setUserIdList(String userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public String getUserIdList() {
        return this.userIdList;
    }

}
