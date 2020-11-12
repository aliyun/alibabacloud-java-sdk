// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ReleaseMovieSeatRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("LockSeatApplyKey")
    @Validation(required = true)
    public String lockSeatApplyKey;

    @NameInMap("BizUid")
    @Validation(required = true)
    public String bizUid;

    @NameInMap("ExtJson")
    public String extJson;

    public static ReleaseMovieSeatRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseMovieSeatRequest self = new ReleaseMovieSeatRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseMovieSeatRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ReleaseMovieSeatRequest setLockSeatApplyKey(String lockSeatApplyKey) {
        this.lockSeatApplyKey = lockSeatApplyKey;
        return this;
    }
    public String getLockSeatApplyKey() {
        return this.lockSeatApplyKey;
    }

    public ReleaseMovieSeatRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public ReleaseMovieSeatRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

}
