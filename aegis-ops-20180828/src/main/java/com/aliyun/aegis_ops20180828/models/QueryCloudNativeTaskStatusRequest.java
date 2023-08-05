// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class QueryCloudNativeTaskStatusRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RootTaskId")
    public String rootTaskId;

    @NameInMap("TaskIds")
    public String taskIds;

    public static QueryCloudNativeTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudNativeTaskStatusRequest self = new QueryCloudNativeTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryCloudNativeTaskStatusRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public QueryCloudNativeTaskStatusRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public QueryCloudNativeTaskStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryCloudNativeTaskStatusRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCloudNativeTaskStatusRequest setRootTaskId(String rootTaskId) {
        this.rootTaskId = rootTaskId;
        return this;
    }
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    public QueryCloudNativeTaskStatusRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

}
