// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostEventDisposeAndWhiteruleListRequest extends TeaModel {
    @NameInMap("EventDispose")
    public String eventDispose;

    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("ReceiverInfo")
    public String receiverInfo;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Remark")
    public String remark;

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

    public PostEventDisposeAndWhiteruleListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
