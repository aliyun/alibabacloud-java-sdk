// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetWaitingRoomConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("WaitUri")
    public String waitUri;

    @NameInMap("AllowPct")
    public Integer allowPct;

    @NameInMap("MaxTimeWait")
    public Integer maxTimeWait;

    @NameInMap("GapTime")
    public Integer gapTime;

    @NameInMap("WaitUrl")
    public String waitUrl;

    public static SetWaitingRoomConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetWaitingRoomConfigRequest self = new SetWaitingRoomConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetWaitingRoomConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetWaitingRoomConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetWaitingRoomConfigRequest setWaitUri(String waitUri) {
        this.waitUri = waitUri;
        return this;
    }
    public String getWaitUri() {
        return this.waitUri;
    }

    public SetWaitingRoomConfigRequest setAllowPct(Integer allowPct) {
        this.allowPct = allowPct;
        return this;
    }
    public Integer getAllowPct() {
        return this.allowPct;
    }

    public SetWaitingRoomConfigRequest setMaxTimeWait(Integer maxTimeWait) {
        this.maxTimeWait = maxTimeWait;
        return this;
    }
    public Integer getMaxTimeWait() {
        return this.maxTimeWait;
    }

    public SetWaitingRoomConfigRequest setGapTime(Integer gapTime) {
        this.gapTime = gapTime;
        return this;
    }
    public Integer getGapTime() {
        return this.gapTime;
    }

    public SetWaitingRoomConfigRequest setWaitUrl(String waitUrl) {
        this.waitUrl = waitUrl;
        return this;
    }
    public String getWaitUrl() {
        return this.waitUrl;
    }

}
