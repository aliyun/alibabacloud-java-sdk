// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. You can generate a parameter value from your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6868E9A1-56E6-5FD7-9684-E2963BBAFB5F</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The alert contact group. Alert notifications for the application group are sent to the alert contacts in this alert contact group.</p>
     * <blockquote>
     * <p>An alert contact group is a collection of alert contacts and can contain one or more alert contacts. For more information about how to create alert contacts and alert contact groups, see <a href="~~PutContact~~">PutContact</a> and <a href="~~PutContactGroup~~">PutContactGroup</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS_Alert_Group</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>Specifies whether to perform a dry run on the request, including permission and instance status checks. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Sends a normal request. If the request passes the check, the name and description of the route table are modified.</li>
     * <li><strong>true</strong>: Sends a dry run request. Only validation is performed, and the name and description of the route table are not modified. Check items include whether required parameters are specified and the request format. If the check fails, the corresponding error is returned. If the check passes, the <code>DryRunOperation</code> error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateMonitorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupRequest self = new CreateMonitorGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateMonitorGroupRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public CreateMonitorGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateMonitorGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateMonitorGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
