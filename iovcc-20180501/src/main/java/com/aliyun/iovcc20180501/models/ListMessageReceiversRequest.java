// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMessageReceiversRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListMessageReceiversRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessageReceiversRequest self = new ListMessageReceiversRequest();
        return TeaModel.build(map, self);
    }

    public ListMessageReceiversRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListMessageReceiversRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ListMessageReceiversRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListMessageReceiversRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
