// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostEventDisposeAndWhiteruleListRequest extends TeaModel {
    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of handling policy IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>12,13,14</p>
     */
    @NameInMap("DisposeStrategyIds")
    public String disposeStrategyIds;

    /**
     * <p>The incident handling configuration as a JSON object.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;playbookName&quot;: &quot;WafBlockIP&quot;,
     *             &quot;entityId&quot;: &quot;104466118&quot;,
     *             &quot;scope&quot;: [
     *                   &quot;176618589410****&quot;
     *             ],
     *             &quot;startTime&quot;: 1604168946281,
     *             &quot;endTime&quot;: 1614168946281
     *       },
     *       {
     *             &quot;playbookName&quot;: &quot;WafBlockIP&quot;,
     *             &quot;entityId&quot;: &quot;104466118&quot;,
     *             &quot;scope&quot;: [
     *                   {
     *                         &quot;instanceId&quot;: &quot;waf-cn-n6w1oy1****&quot;,
     *                         &quot;domains&quot;: [
     *                               &quot;lmfip.wafqax.***&quot;
     *                         ]
     *                   }
     *             ],
     *             &quot;startTime&quot;: 1604168946281,
     *             &quot;endTime&quot;: 1614168946281
     *       }
     * ]</p>
     */
    @NameInMap("EventDispose")
    public String eventDispose;

    /**
     * <p>The globally unique UUID of the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>The account UID of the incident owner.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890xxxxxx</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The alert recipient configuration as a JSON object.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;messageTitle&quot;: &quot;test&quot;,
     *       &quot;receiver&quot;: &quot;xiaowang&quot;,
     *       &quot;channel&quot;: &quot;message&quot;
     * }</p>
     */
    @NameInMap("ReceiverInfo")
    public String receiverInfo;

    /**
     * <p>The region where the threat analysis data management center resides. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in the Chinese mainland or China (Hong Kong).</li>
     * <li>ap-southeast-1: Your assets reside in regions outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The remarks for the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>dealed</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The source of the handling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("ResponseSource")
    public String responseSource;

    /**
     * <p>The ID of the user for whom the administrator switches to a member view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li>0: the China account view.</li>
     * <li>1: the view of all accounts in the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The incident status. Valid values:</p>
     * <ul>
     * <li>0: unhandled  </li>
     * <li>1: handling </li>
     * <li>5: handling failed </li>
     * <li>10: handled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Specifies whether to restore associated handled alerts to unhandled status when reopening the incident.</p>
     */
    @NameInMap("SyncAlertStatus")
    public Boolean syncAlertStatus;

    /**
     * <p>The threat level. Valid values:</p>
     * <ul>
     * <li>serious: high</li>
     * <li>suspicious: medium</li>
     * <li>remind: low</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>remind</p>
     */
    @NameInMap("ThreatLevel")
    public String threatLevel;

    public static PostEventDisposeAndWhiteruleListRequest build(java.util.Map<String, ?> map) throws Exception {
        PostEventDisposeAndWhiteruleListRequest self = new PostEventDisposeAndWhiteruleListRequest();
        return TeaModel.build(map, self);
    }

    public PostEventDisposeAndWhiteruleListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PostEventDisposeAndWhiteruleListRequest setDisposeStrategyIds(String disposeStrategyIds) {
        this.disposeStrategyIds = disposeStrategyIds;
        return this;
    }
    public String getDisposeStrategyIds() {
        return this.disposeStrategyIds;
    }

    public PostEventDisposeAndWhiteruleListRequest setEventDispose(String eventDispose) {
        this.eventDispose = eventDispose;
        return this;
    }
    public String getEventDispose() {
        return this.eventDispose;
    }

    public PostEventDisposeAndWhiteruleListRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public PostEventDisposeAndWhiteruleListRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public PostEventDisposeAndWhiteruleListRequest setReceiverInfo(String receiverInfo) {
        this.receiverInfo = receiverInfo;
        return this;
    }
    public String getReceiverInfo() {
        return this.receiverInfo;
    }

    public PostEventDisposeAndWhiteruleListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PostEventDisposeAndWhiteruleListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public PostEventDisposeAndWhiteruleListRequest setResponseSource(String responseSource) {
        this.responseSource = responseSource;
        return this;
    }
    public String getResponseSource() {
        return this.responseSource;
    }

    public PostEventDisposeAndWhiteruleListRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public PostEventDisposeAndWhiteruleListRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public PostEventDisposeAndWhiteruleListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public PostEventDisposeAndWhiteruleListRequest setSyncAlertStatus(Boolean syncAlertStatus) {
        this.syncAlertStatus = syncAlertStatus;
        return this;
    }
    public Boolean getSyncAlertStatus() {
        return this.syncAlertStatus;
    }

    public PostEventDisposeAndWhiteruleListRequest setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public String getThreatLevel() {
        return this.threatLevel;
    }

}
