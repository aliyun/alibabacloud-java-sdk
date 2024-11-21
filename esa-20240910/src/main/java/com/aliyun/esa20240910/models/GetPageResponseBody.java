// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPageResponseBody extends TeaModel {
    /**
     * <p>The Base64-encoded content of the error page. The content type is specified by the Content-Type field.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The Content-Type field in the HTTP header.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text/html</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The description of the custom error page.</p>
     * 
     * <strong>example:</strong>
     * <p>a custom deny page</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the custom error page.<a href="~~2850223~~"></a></p>
     * 
     * <strong>example:</strong>
     * <p>50000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The type of the custom response page.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("Kind")
    public String kind;

    /**
     * <p>The name of the custom response page.</p>
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
     * <p>The time when the custom error page was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPageResponseBody self = new GetPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPageResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetPageResponseBody setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public GetPageResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetPageResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetPageResponseBody setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public GetPageResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPageResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
