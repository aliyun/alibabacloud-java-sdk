// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ReleaseMovieSeatRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******005</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>221249435****</p>
     */
    @NameInMap("BizUid")
    public String bizUid;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtJson")
    public String extJson;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("LockSeatApplyKey")
    public String lockSeatApplyKey;

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

    public ReleaseMovieSeatRequest setLockSeatApplyKey(String lockSeatApplyKey) {
        this.lockSeatApplyKey = lockSeatApplyKey;
        return this;
    }
    public String getLockSeatApplyKey() {
        return this.lockSeatApplyKey;
    }

}
