// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserSecDropResponseBody extends TeaModel {
    /**
     * <p>The number of packets that are blocked.</p>
     */
    @NameInMap("Drops")
    public Integer drops;

    /**
     * <p>Indicates whether the information is found.</p>
     * <br>
     * <p>*   Found</p>
     * <p>*   Not Found</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The character string that is concatenated based on the request parameters and is used to locate causes when data is not found.</p>
     */
    @NameInMap("UuidStr")
    public String uuidStr;

    public static DescribeDcdnUserSecDropResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserSecDropResponseBody self = new DescribeDcdnUserSecDropResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserSecDropResponseBody setDrops(Integer drops) {
        this.drops = drops;
        return this;
    }
    public Integer getDrops() {
        return this.drops;
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

    public DescribeDcdnUserSecDropResponseBody setUuidStr(String uuidStr) {
        this.uuidStr = uuidStr;
        return this;
    }
    public String getUuidStr() {
        return this.uuidStr;
    }

}
