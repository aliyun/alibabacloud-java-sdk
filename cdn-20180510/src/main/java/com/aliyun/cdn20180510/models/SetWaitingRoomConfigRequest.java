// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetWaitingRoomConfigRequest extends TeaModel {
    /**
     * <p>The percentage of requests that are allowed to be redirected to the origin server. Valid values: **0** to **100**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AllowPct")
    public Integer allowPct;

    /**
     * <p>The accelerated domain name. You can specify only one domain name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The length of waiting time to skip after an exit from the queue. Unit: seconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GapTime")
    public Integer gapTime;

    /**
     * <p>The maximum length of waiting time in the queue. Unit: seconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MaxTimeWait")
    public Integer maxTimeWait;

    /**
     * <p>The regular expression that is used to match URI strings for which the virtual waiting room feature is enabled.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WaitUri")
    public String waitUri;

    /**
     * <p>The URL of the waiting page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WaitUrl")
    public String waitUrl;

    public static SetWaitingRoomConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetWaitingRoomConfigRequest self = new SetWaitingRoomConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetWaitingRoomConfigRequest setAllowPct(Integer allowPct) {
        this.allowPct = allowPct;
        return this;
    }
    public Integer getAllowPct() {
        return this.allowPct;
    }

    public SetWaitingRoomConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetWaitingRoomConfigRequest setGapTime(Integer gapTime) {
        this.gapTime = gapTime;
        return this;
    }
    public Integer getGapTime() {
        return this.gapTime;
    }

    public SetWaitingRoomConfigRequest setMaxTimeWait(Integer maxTimeWait) {
        this.maxTimeWait = maxTimeWait;
        return this;
    }
    public Integer getMaxTimeWait() {
        return this.maxTimeWait;
    }

    public SetWaitingRoomConfigRequest setWaitUri(String waitUri) {
        this.waitUri = waitUri;
        return this;
    }
    public String getWaitUri() {
        return this.waitUri;
    }

    public SetWaitingRoomConfigRequest setWaitUrl(String waitUrl) {
        this.waitUrl = waitUrl;
        return this;
    }
    public String getWaitUrl() {
        return this.waitUrl;
    }

}
