// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSnapshotsRequest extends TeaModel {
    /**
     * <p>The namespace (project space projectId or personal space baseId).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1389623</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The unique ID of the object.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8467231038932407294</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The snapshot type. Multiple values are supported. Valid values: Saved, Deployed, and UnDeployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Saved</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsRequest self = new ListSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListSnapshotsRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public ListSnapshotsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSnapshotsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSnapshotsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
