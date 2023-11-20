// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterCheckResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("check_id")
    public String checkId;

    @NameInMap("check_items")
    public java.util.Map<String, java.util.List<java.util.Map<String, ?>>> checkItems;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("finished_at")
    public String finishedAt;

    @NameInMap("message")
    public String message;

    @NameInMap("status")
    public String status;

    @NameInMap("type")
    public String type;

    public static GetClusterCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterCheckResponseBody self = new GetClusterCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterCheckResponseBody setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public GetClusterCheckResponseBody setCheckItems(java.util.Map<String, java.util.List<java.util.Map<String, ?>>> checkItems) {
        this.checkItems = checkItems;
        return this;
    }
    public java.util.Map<String, java.util.List<java.util.Map<String, ?>>> getCheckItems() {
        return this.checkItems;
    }

    public GetClusterCheckResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetClusterCheckResponseBody setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public GetClusterCheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetClusterCheckResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetClusterCheckResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
