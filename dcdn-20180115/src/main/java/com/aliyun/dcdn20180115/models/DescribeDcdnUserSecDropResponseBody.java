// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserSecDropResponseBody extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Drops")
    public Integer drops;

    @NameInMap("UuidStr")
    public String uuidStr;

    public static DescribeDcdnUserSecDropResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserSecDropResponseBody self = new DescribeDcdnUserSecDropResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserSecDropResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeDcdnUserSecDropResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnUserSecDropResponseBody setDrops(Integer drops) {
        this.drops = drops;
        return this;
    }
    public Integer getDrops() {
        return this.drops;
    }

    public DescribeDcdnUserSecDropResponseBody setUuidStr(String uuidStr) {
        this.uuidStr = uuidStr;
        return this;
    }
    public String getUuidStr() {
        return this.uuidStr;
    }

}
