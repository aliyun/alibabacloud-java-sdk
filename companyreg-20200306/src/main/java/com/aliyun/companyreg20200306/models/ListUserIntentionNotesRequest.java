// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserIntentionNotesRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListUserIntentionNotesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserIntentionNotesRequest self = new ListUserIntentionNotesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserIntentionNotesRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListUserIntentionNotesRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public ListUserIntentionNotesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserIntentionNotesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
