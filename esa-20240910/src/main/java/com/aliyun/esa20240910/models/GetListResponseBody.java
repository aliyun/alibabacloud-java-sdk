// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetListResponseBody extends TeaModel {
    /**
     * <p>The description of the custom list.</p>
     * 
     * <strong>example:</strong>
     * <p>a custom list</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the custom list. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/2850217.html">ListLists</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>40000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The items of the custom list, displayed as an array.</p>
     */
    @NameInMap("Items")
    public java.util.List<String> items;

    /**
     * <p>The kind of the custom list.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("Kind")
    public String kind;

    /**
     * <p>The name of the custom list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The last update time of the custom list.</p>
     * <p>Format: RFC 3339 / ISO 8601, UTC time zone (ending with Z).</p>
     * <p>Example: 2026-06-10T14:23:45Z</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListResponseBody self = new GetListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetListResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetListResponseBody setItems(java.util.List<String> items) {
        this.items = items;
        return this;
    }
    public java.util.List<String> getItems() {
        return this.items;
    }

    public GetListResponseBody setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public GetListResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetListResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
