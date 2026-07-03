// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostEventDisposeAndWhiteruleListRequest extends TeaModel {
    /**
     * <p>A comma-separated list of response strategy IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>12,13,14</p>
     */
    @NameInMap("DisposeStrategyIds")
    public String disposeStrategyIds;

    /**
     * <p>A JSON object that defines the incident response configuration.</p>
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
     * <p>The UID of the incident owner.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890xxxxxx</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>A JSON object that defines the alert recipient configuration.</p>
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
     * <p>The region where the Data Management service for threat analysis is deployed. Select a region based on where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Assets in the Chinese mainland or Hong Kong (China)</p>
     * </li>
     * <li><p>ap-southeast-1: Assets outside China</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>A note about the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>dealed</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The source of the response policy.</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("ResponseSource")
    public String responseSource;

    /**
     * <p>The UID of the member whose perspective an administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li><p>0: Current Alibaba Cloud account view</p>
     * </li>
     * <li><p>1: View for all accounts in your enterprise</p>
     * </li>
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
     * <li><p>0: Not handled</p>
     * </li>
     * <li><p>1: Handling</p>
     * </li>
     * <li><p>5: Failed</p>
     * </li>
     * <li><p>10: Handled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The threat level. Valid values:</p>
     * <ul>
     * <li><p>serious: Important</p>
     * </li>
     * <li><p>suspicious: Medium</p>
     * </li>
     * <li><p>remind: Low</p>
     * </li>
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

    public PostEventDisposeAndWhiteruleListRequest setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public String getThreatLevel() {
        return this.threatLevel;
    }

}
