// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostEventDisposeAndWhiteruleListRequest extends TeaModel {
    /**
     * <p>The configuration of event handling. The value is a JSON object.</p>
     */
    @NameInMap("EventDispose")
    public String eventDispose;

    /**
     * <p>The UUID of the event.</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>The configuration of the alert recipient. The value is a JSON object.</p>
     */
    @NameInMap("ReceiverInfo")
    public String receiverInfo;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The remarks of the event.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The status of the event. Valid values:</p>
     * <br>
     * <p>*   0: unhandled</p>
     * <p>*   1: handing</p>
     * <p>*   5: handling failed</p>
     * <p>*   10: handled</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static PostEventDisposeAndWhiteruleListRequest build(java.util.Map<String, ?> map) throws Exception {
        PostEventDisposeAndWhiteruleListRequest self = new PostEventDisposeAndWhiteruleListRequest();
        return TeaModel.build(map, self);
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

}
