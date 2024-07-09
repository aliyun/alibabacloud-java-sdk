// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetConnectionTicketRequest extends TeaModel {
    /**
     * <p>The command that you want to run to configure a custom application in user mode. After you obtain the credential, the application is automatically started. Parameter description in the command:</p>
     * <ul>
     * <li>appPath: the path of the application startup file. Example: <code>&quot;C:\\\\Program Files (x86)\\\\000\\\\000.exe&quot;</code>. Use double slashes (\\\) as the delimiter. Type of the parameter value: string.</li>
     * <li>appParameter: the startup arguments of the application. Example: <code>&quot;meetingid 000 meetingname aaa&quot;</code>. Separate multiple arguments with spaces. Type of the parameter value: string.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;startApplication&quot;: {
     *             &quot;startApplicationList&quot;: [
     *                   {
     *                         &quot;sessionName&quot;: &quot;&quot;,
     *                         &quot;appList&quot;: [
     *                               {
     *                                     &quot;appPath&quot;: &quot;C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe&quot;,
     *                                     &quot;appParameter&quot;: &quot;<a href="http://www.example.com">www.example.com</a> <a href="http://www.example1.com">www.example1.com</a>&quot;
     *                               }
     *                         ]
     *                   }
     *             ]
     *       }
     * }</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The ID of the cloud computer for which you want to generate a connection credential. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The ID of the end user of the cloud computer. The end user must be the current end user of the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the current end user of the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>Ab123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the cloud computer connection task.</p>
     * 
     * <strong>example:</strong>
     * <p>2afbad19-778a-4fc5-9674-1f19c63862da</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique identifier of the client. If you use an Alibaba Cloud Workspace client, click <strong>About</strong> on the client logon page to view the identifier of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>28c80e90-f71e-4c23-93d6-1225329cf949</p>
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
