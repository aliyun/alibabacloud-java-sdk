// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListOfflineMessagesRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Value")
    public String value;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    public static ListOfflineMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOfflineMessagesRequest self = new ListOfflineMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListOfflineMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOfflineMessagesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListOfflineMessagesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListOfflineMessagesRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ListOfflineMessagesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

}
