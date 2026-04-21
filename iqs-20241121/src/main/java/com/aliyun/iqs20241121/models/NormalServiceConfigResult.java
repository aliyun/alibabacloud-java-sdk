// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class NormalServiceConfigResult extends TeaModel {
    @NameInMap("availableTime")
    public String availableTime;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("status")
    public String status;

    @NameInMap("userAPICountInfos")
    public java.util.List<UserAPICountInfo> userAPICountInfos;

    public static NormalServiceConfigResult build(java.util.Map<String, ?> map) throws Exception {
        NormalServiceConfigResult self = new NormalServiceConfigResult();
        return TeaModel.build(map, self);
    }

    public NormalServiceConfigResult setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
        return this;
    }
    public String getAvailableTime() {
        return this.availableTime;
    }

    public NormalServiceConfigResult setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public NormalServiceConfigResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NormalServiceConfigResult setUserAPICountInfos(java.util.List<UserAPICountInfo> userAPICountInfos) {
        this.userAPICountInfos = userAPICountInfos;
        return this;
    }
    public java.util.List<UserAPICountInfo> getUserAPICountInfos() {
        return this.userAPICountInfos;
    }

}
