// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderLogisticsWithDesignatedTbUidRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("LmOrderId")
    public Long lmOrderId;

    @NameInMap("TbAccountType")
    public String tbAccountType;

    @NameInMap("TbUserId")
    public Long tbUserId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static QueryOrderLogisticsWithDesignatedTbUidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderLogisticsWithDesignatedTbUidRequest self = new QueryOrderLogisticsWithDesignatedTbUidRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderLogisticsWithDesignatedTbUidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryOrderLogisticsWithDesignatedTbUidRequest setLmOrderId(Long lmOrderId) {
        this.lmOrderId = lmOrderId;
        return this;
    }
    public Long getLmOrderId() {
        return this.lmOrderId;
    }

    public QueryOrderLogisticsWithDesignatedTbUidRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public QueryOrderLogisticsWithDesignatedTbUidRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public QueryOrderLogisticsWithDesignatedTbUidRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
