// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetLatestNodeByTypeResponseBody extends TeaModel {
    @NameInMap("Enabled")
    public String enabled;

    @NameInMap("Exposed")
    public String exposed;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Id")
    public String id;

    @NameInMap("Order")
    public String order;

    @NameInMap("ParentId")
    public String parentId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Usage")
    public String usage;

    public static GetLatestNodeByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLatestNodeByTypeResponseBody self = new GetLatestNodeByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLatestNodeByTypeResponseBody setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }
    public String getEnabled() {
        return this.enabled;
    }

    public GetLatestNodeByTypeResponseBody setExposed(String exposed) {
        this.exposed = exposed;
        return this;
    }
    public String getExposed() {
        return this.exposed;
    }

    public GetLatestNodeByTypeResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetLatestNodeByTypeResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetLatestNodeByTypeResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetLatestNodeByTypeResponseBody setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetLatestNodeByTypeResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public GetLatestNodeByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLatestNodeByTypeResponseBody setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
