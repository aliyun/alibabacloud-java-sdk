// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserIntentionsRequest extends TeaModel {
    @NameInMap("Area")
    public String area;

    /**
     * <strong>example:</strong>
     * <p>esp.companyreg_cloud</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>esp.bookkeeping,esp.bookkeeping_cloud</p>
     */
    @NameInMap("BizTypes")
    public String bizTypes;

    /**
     * <strong>example:</strong>
     * <p>I20210917170147000001</p>
     */
    @NameInMap("IntentionBizId")
    public String intentionBizId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>UpdateTime</p>
     */
    @NameInMap("SortFiled")
    public String sortFiled;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <strong>example:</strong>
     * <p>37</p>
     */
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
