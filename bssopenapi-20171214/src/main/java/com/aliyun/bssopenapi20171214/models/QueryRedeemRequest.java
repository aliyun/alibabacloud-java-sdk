// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRedeemRequest extends TeaModel {
    /**
     * <p>Specifies whether the redemption coupon takes effect. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EffectiveOrNot")
    public Boolean effectiveOrNot;

    /**
     * <p>The end time when the redemption coupon expires. The value must be in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-08-01T00:00:00Z</p>
     */
    @NameInMap("ExpiryTimeEnd")
    public String expiryTimeEnd;

    /**
     * <p>The start time when the redemption coupon expires. The value must be in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-08-01T00:00:00Z</p>
     */
    @NameInMap("ExpiryTimeStart")
    public String expiryTimeStart;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryRedeemRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRedeemRequest self = new QueryRedeemRequest();
        return TeaModel.build(map, self);
    }

    public QueryRedeemRequest setEffectiveOrNot(Boolean effectiveOrNot) {
        this.effectiveOrNot = effectiveOrNot;
        return this;
    }
    public Boolean getEffectiveOrNot() {
        return this.effectiveOrNot;
    }

    public QueryRedeemRequest setExpiryTimeEnd(String expiryTimeEnd) {
        this.expiryTimeEnd = expiryTimeEnd;
        return this;
    }
    public String getExpiryTimeEnd() {
        return this.expiryTimeEnd;
    }

    public QueryRedeemRequest setExpiryTimeStart(String expiryTimeStart) {
        this.expiryTimeStart = expiryTimeStart;
        return this;
    }
    public String getExpiryTimeStart() {
        return this.expiryTimeStart;
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
