// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListDocumentsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d278629c-c687-4aa3-b044-4fe9b012e7ef</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>eyJ0YWJsZUlkIjoiY2Y2MTQxYjA5NDY0NDUxMzk5YjFjMTA5YTMxZWNkMzEiLCJ0b2tlbiI6IjAwMDAwMDAwMDAwNzAzNzcifQ==</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>EAF3C248-E123-441B-A545-B6CD02E98EED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>schema id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>profile</p>
     */
    @NameInMap("SchemaId")
    public String schemaId;

    @NameInMap("SearchPattern")
    public String searchPattern;

    @NameInMap("Sorts")
    public String sortsShrink;

    public static ListDocumentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentsShrinkRequest self = new ListDocumentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDocumentsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDocumentsShrinkRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListDocumentsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDocumentsShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDocumentsShrinkRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

    public ListDocumentsShrinkRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public ListDocumentsShrinkRequest setSortsShrink(String sortsShrink) {
        this.sortsShrink = sortsShrink;
        return this;
    }
    public String getSortsShrink() {
        return this.sortsShrink;
    }

}
