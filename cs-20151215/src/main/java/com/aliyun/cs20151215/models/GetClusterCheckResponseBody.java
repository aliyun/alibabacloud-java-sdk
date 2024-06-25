// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterCheckResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1697100584236600453-ce0da5a1d627e4e9e9f96cae8ad07****-clustercheck-lboto</p>
     */
    @NameInMap("check_id")
    public String checkId;

    /**
     * <p>The list of check items.</p>
     */
    @NameInMap("check_items")
    public java.util.Map<String, java.util.List<java.util.Map<String, ?>>> checkItems;

    /**
     * <p>The time when the cluster check task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-16T08:31:20.292030178Z</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>The time when the cluster check task was completed.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-16T08:35:20.292030178Z</p>
     */
    @NameInMap("finished_at")
    public String finishedAt;

    /**
     * <p>The message that indicates the status of the cluster check task.</p>
     * 
     * <strong>example:</strong>
     * <p>task succeed</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The status of the cluster check.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The check method.</p>
     * 
     * <strong>example:</strong>
     * <p>ClusterUpgrade</p>
     */
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
