// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderAndPaymentListWithDesignatedTbUidRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("FilterOption")
    public String filterOption;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TbAccountType")
    public String tbAccountType;

    @NameInMap("TbUserId")
    public Long tbUserId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static QueryOrderAndPaymentListWithDesignatedTbUidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderAndPaymentListWithDesignatedTbUidRequest self = new QueryOrderAndPaymentListWithDesignatedTbUidRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidRequest setFilterOption(String filterOption) {
        this.filterOption = filterOption;
        return this;
    }
    public String getFilterOption() {
        return this.filterOption;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
