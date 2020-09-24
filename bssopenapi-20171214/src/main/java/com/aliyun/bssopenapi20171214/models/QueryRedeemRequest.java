// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRedeemRequest extends TeaModel {
    @NameInMap("ExpiryTimeStart")
    public String expiryTimeStart;

    @NameInMap("ExpiryTimeEnd")
    public String expiryTimeEnd;

    @NameInMap("EffectiveOrNot")
    public Boolean effectiveOrNot;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryRedeemRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRedeemRequest self = new QueryRedeemRequest();
        return TeaModel.build(map, self);
    }

    public QueryRedeemRequest setExpiryTimeStart(String expiryTimeStart) {
        this.expiryTimeStart = expiryTimeStart;
        return this;
    }
    public String getExpiryTimeStart() {
        return this.expiryTimeStart;
    }

    public QueryRedeemRequest setExpiryTimeEnd(String expiryTimeEnd) {
        this.expiryTimeEnd = expiryTimeEnd;
        return this;
    }
    public String getExpiryTimeEnd() {
        return this.expiryTimeEnd;
    }

    public QueryRedeemRequest setEffectiveOrNot(Boolean effectiveOrNot) {
        this.effectiveOrNot = effectiveOrNot;
        return this;
    }
    public Boolean getEffectiveOrNot() {
        return this.effectiveOrNot;
    }

    public QueryRedeemRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryRedeemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
