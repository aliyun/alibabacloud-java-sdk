// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserSolutionsRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ExistStatus")
    public java.util.List<Long> existStatus;

    /**
     * <strong>example:</strong>
     * <p>I20210924151843000001</p>
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

    public static ListUserSolutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserSolutionsRequest self = new ListUserSolutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserSolutionsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListUserSolutionsRequest setExistStatus(java.util.List<Long> existStatus) {
        this.existStatus = existStatus;
        return this;
    }
    public java.util.List<Long> getExistStatus() {
        return this.existStatus;
    }

    public ListUserSolutionsRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public ListUserSolutionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserSolutionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
