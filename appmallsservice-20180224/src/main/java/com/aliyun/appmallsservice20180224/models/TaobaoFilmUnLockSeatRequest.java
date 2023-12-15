// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmUnLockSeatRequest extends TeaModel {
    @NameInMap("ExtUserId")
    public String extUserId;

    @NameInMap("LockSeatApplyKey")
    public String lockSeatApplyKey;

    @NameInMap("ParamsJson")
    public String paramsJson;

    public static TaobaoFilmUnLockSeatRequest build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmUnLockSeatRequest self = new TaobaoFilmUnLockSeatRequest();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmUnLockSeatRequest setExtUserId(String extUserId) {
        this.extUserId = extUserId;
        return this;
    }
    public String getExtUserId() {
        return this.extUserId;
    }

    public TaobaoFilmUnLockSeatRequest setLockSeatApplyKey(String lockSeatApplyKey) {
        this.lockSeatApplyKey = lockSeatApplyKey;
        return this;
    }
    public String getLockSeatApplyKey() {
        return this.lockSeatApplyKey;
    }

    public TaobaoFilmUnLockSeatRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
