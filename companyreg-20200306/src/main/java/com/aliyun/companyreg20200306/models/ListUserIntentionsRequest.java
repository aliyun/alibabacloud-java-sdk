// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserIntentionsRequest extends TeaModel {
    @NameInMap("Area")
    public String area;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizTypes")
    public String bizTypes;

    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortFiled")
    public String sortFiled;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("WithExtInfo")
    public Boolean withExtInfo;

    public static ListUserIntentionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserIntentionsRequest self = new ListUserIntentionsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserIntentionsRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public ListUserIntentionsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListUserIntentionsRequest setBizTypes(String bizTypes) {
        this.bizTypes = bizTypes;
        return this;
    }
    public String getBizTypes() {
        return this.bizTypes;
    }

    public ListUserIntentionsRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public ListUserIntentionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserIntentionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserIntentionsRequest setSortFiled(String sortFiled) {
        this.sortFiled = sortFiled;
        return this;
    }
    public String getSortFiled() {
        return this.sortFiled;
    }

    public ListUserIntentionsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListUserIntentionsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListUserIntentionsRequest setWithExtInfo(Boolean withExtInfo) {
        this.withExtInfo = withExtInfo;
        return this;
    }
    public Boolean getWithExtInfo() {
        return this.withExtInfo;
    }

}
