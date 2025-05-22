// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserSolutionsShrinkRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ExistStatus")
    public String existStatusShrink;

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

    public static ListUserSolutionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserSolutionsShrinkRequest self = new ListUserSolutionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListUserSolutionsShrinkRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListUserSolutionsShrinkRequest setExistStatusShrink(String existStatusShrink) {
        this.existStatusShrink = existStatusShrink;
        return this;
    }
    public String getExistStatusShrink() {
        return this.existStatusShrink;
    }

    public ListUserSolutionsShrinkRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public ListUserSolutionsShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserSolutionsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
