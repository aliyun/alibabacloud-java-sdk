// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. You can generate a parameter value on your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length. For more information, see How to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>6868E9A1-56E6-5FD7-9684-E2963BBAFB5F</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to execute a dry run on the request, including checks on permissions and instance status. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Sends a normal request. If the check succeeds, the name and description of the routing table are directly modified.</li>
     * <li><strong>true</strong>: Sends a check request to only perform the check, and the name and description of the routing table are not modified. The check items include whether required parameters are specified and the request format. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>246139436</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteMonitorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupRequest self = new DeleteMonitorGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteMonitorGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteMonitorGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteMonitorGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
