// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVmsRealNumberCallConnectionRateInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>真实号码</p>
     * 
     * <strong>example:</strong>
     * <p>131***1234</p>
     */
    @NameInMap("RealNumber")
    public String realNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>时间段</p>
     * 
     * <strong>example:</strong>
     * <p>1764666240123-1764686240567</p>
     */
    @NameInMap("TimePeriod")
    public String timePeriod;

    /**
     * <p>虚拟号码</p>
     * 
     * <strong>example:</strong>
     * <p>0571***1234</p>
     */
    @NameInMap("VirtualNumber")
    public String virtualNumber;

    public static QueryVmsRealNumberCallConnectionRateInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVmsRealNumberCallConnectionRateInfoRequest self = new QueryVmsRealNumberCallConnectionRateInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryVmsRealNumberCallConnectionRateInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryVmsRealNumberCallConnectionRateInfoRequest setRealNumber(String realNumber) {
        this.realNumber = realNumber;
        return this;
    }
    public String getRealNumber() {
        return this.realNumber;
    }

    public QueryVmsRealNumberCallConnectionRateInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryVmsRealNumberCallConnectionRateInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryVmsRealNumberCallConnectionRateInfoRequest setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }
    public String getTimePeriod() {
        return this.timePeriod;
    }

    public QueryVmsRealNumberCallConnectionRateInfoRequest setVirtualNumber(String virtualNumber) {
        this.virtualNumber = virtualNumber;
        return this;
    }
    public String getVirtualNumber() {
        return this.virtualNumber;
    }

}
