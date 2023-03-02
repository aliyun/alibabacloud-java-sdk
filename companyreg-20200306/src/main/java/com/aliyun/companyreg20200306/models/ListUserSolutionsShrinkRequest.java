// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserSolutionsShrinkRequest extends TeaModel {
    @NameInMap("ExistStatus")
    public String existStatusShrink;

    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListUserSolutionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserSolutionsShrinkRequest self = new ListUserSolutionsShrinkRequest();
        return TeaModel.build(map, self);
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
