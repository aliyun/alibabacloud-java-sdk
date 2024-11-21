// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdatePageRequest extends TeaModel {
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
     * <p>The Content-Type field in the HTTP header. Valid values:</p>
     * <ul>
     * <li>text/html</li>
     * <li>application/json</li>
     * </ul>
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
     * <p>The ID of the custom error page, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850223.html">ListPages</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the custom error page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdatePageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePageRequest self = new UpdatePageRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdatePageRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UpdatePageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePageRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdatePageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
