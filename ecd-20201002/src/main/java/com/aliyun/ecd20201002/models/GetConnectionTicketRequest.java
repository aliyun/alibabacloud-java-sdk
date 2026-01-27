// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetConnectionTicketRequest extends TeaModel {
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f4a0dc8e-1702-4728-9a60-95b27a35****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <strong>example:</strong>
     * <p>Windows_NT 10.0.18363 x64</p>
     */
    @NameInMap("ClientOS")
    public String clientOS;

    /**
     * <p>The type of the client.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>html5: web client</li>
     * <li>Linux: self-developed hardware terminal</li>
     * <li>android: Android client</li>
     * <li>windows: Windows client</li>
     * <li>ios: iOS client</li>
     * <li>macos: macOS client</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <strong>example:</strong>
     * <p>2.1.0-R-20210731.151756</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
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
     * <p>The cloud compute ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v18101ac6a9e69c66b04a163031680463660b4b216cd758f34b60b9ad6a7c7f7334b83dd8f75eef4209c68f9f1080b****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
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
     * <strong>example:</strong>
     * <p>cd45e873-650d-4d70-acb9-f996187a****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The tags. You can specify 1 to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<GetConnectionTicketRequestTag> tag;

    /**
     * <p>The ID of the cloud computer connection task.\
     * The first time you call the GetConnectionTicket operation, you do not need to configure this parameter. When you call the GetConnectionTicket operation later, set this parameter to the value of the <code>TaskId</code> parameter returned from the previous invocation.</p>
     * 
     * <strong>example:</strong>
     * <p>2afbad19-778a-4fc5-9674-1f19c638****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TicketBlackList")
    public java.util.List<String> ticketBlackList;

    /**
     * <strong>example:</strong>
     * <p>28c80e90-f71e-4c23-93d6-1225329cf949</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetConnectionTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionTicketRequest self = new GetConnectionTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetConnectionTicketRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public GetConnectionTicketRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GetConnectionTicketRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public GetConnectionTicketRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public GetConnectionTicketRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
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

    public GetConnectionTicketRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public GetConnectionTicketRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public GetConnectionTicketRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetConnectionTicketRequest setTag(java.util.List<GetConnectionTicketRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetConnectionTicketRequestTag> getTag() {
        return this.tag;
    }

    public GetConnectionTicketRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetConnectionTicketRequest setTicketBlackList(java.util.List<String> ticketBlackList) {
        this.ticketBlackList = ticketBlackList;
        return this;
    }
    public java.util.List<String> getTicketBlackList() {
        return this.ticketBlackList;
    }

    public GetConnectionTicketRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class GetConnectionTicketRequestTag extends TeaModel {
        /**
         * <p>The tag key. If you specify the <code>Tag</code> parameter, you must also specify the <code>Key</code> parameter. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code> and contain only spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify an empty string as a tag value. A tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetConnectionTicketRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionTicketRequestTag self = new GetConnectionTicketRequestTag();
            return TeaModel.build(map, self);
        }

        public GetConnectionTicketRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetConnectionTicketRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
