// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetConnectionTicketRequest extends TeaModel {
    /**
     * <p>The command that you want to run to configure a custom application in user mode. After you obtain the credentials, the application automatically starts.</p>
     * <br>
     * <p>*   appPath: the path of the application startup file. Example: C:\\\Program Files (x86)\\\000\\\000.exe. Use double slashes as delimiters.</p>
     * <p>*   appParameter: the startup parameters of the application. The value must be of the String type. Separate multiple parameters with spaces. Example: meetingid 000 meetingname aaa.</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The ID of the cloud desktop.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The ID of the end user.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password for the username.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the cloud desktop.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the desktop connection task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique identifier of the client. If you use an Alibaba Cloud Workspace client, click **About** on the client logon page to view the identifier of the client.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetConnectionTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionTicketRequest self = new GetConnectionTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetConnectionTicketRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public GetConnectionTicketRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public GetConnectionTicketRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GetConnectionTicketRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetConnectionTicketRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GetConnectionTicketRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetConnectionTicketRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetConnectionTicketRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetConnectionTicketRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetConnectionTicketRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
