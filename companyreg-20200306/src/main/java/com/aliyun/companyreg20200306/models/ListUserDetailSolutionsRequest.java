// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserDetailSolutionsRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListUserDetailSolutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserDetailSolutionsRequest self = new ListUserDetailSolutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserDetailSolutionsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListUserDetailSolutionsRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public ListUserDetailSolutionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserDetailSolutionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
