// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeCreditInfoResponseBody extends TeaModel {
    @NameInMap("PunishTimes")
    public Long punishTimes;

    @NameInMap("LastOrderTime")
    public Long lastOrderTime;

    @NameInMap("LastLoginTime")
    public Long lastLoginTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserLevel")
    public String userLevel;

    @NameInMap("BlackTimes")
    public Long blackTimes;

    @NameInMap("NewCreatetime")
    public String newCreatetime;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("Productid")
    public java.util.List<String> productid;

    public static DescribeCreditInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditInfoResponseBody self = new DescribeCreditInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCreditInfoResponseBody setPunishTimes(Long punishTimes) {
        this.punishTimes = punishTimes;
        return this;
    }
    public Long getPunishTimes() {
        return this.punishTimes;
    }

    public DescribeCreditInfoResponseBody setLastOrderTime(Long lastOrderTime) {
        this.lastOrderTime = lastOrderTime;
        return this;
    }
    public Long getLastOrderTime() {
        return this.lastOrderTime;
    }

    public DescribeCreditInfoResponseBody setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }
    public Long getLastLoginTime() {
        return this.lastLoginTime;
    }

    public DescribeCreditInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCreditInfoResponseBody setUserLevel(String userLevel) {
        this.userLevel = userLevel;
        return this;
    }
    public String getUserLevel() {
        return this.userLevel;
    }

    public DescribeCreditInfoResponseBody setBlackTimes(Long blackTimes) {
        this.blackTimes = blackTimes;
        return this;
    }
    public Long getBlackTimes() {
        return this.blackTimes;
    }

    public DescribeCreditInfoResponseBody setNewCreatetime(String newCreatetime) {
        this.newCreatetime = newCreatetime;
        return this;
    }
    public String getNewCreatetime() {
        return this.newCreatetime;
    }

    public DescribeCreditInfoResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public DescribeCreditInfoResponseBody setProductid(java.util.List<String> productid) {
        this.productid = productid;
        return this;
    }
    public java.util.List<String> getProductid() {
        return this.productid;
    }

}
