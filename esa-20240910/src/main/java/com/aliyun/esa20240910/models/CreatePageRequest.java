// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreatePageRequest extends TeaModel {
    /**
     * <p>The Base64-encoded page content. Example: &quot;PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=&quot;, which indicates &quot;hello page&quot;.</p>
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
     * <p>The description of the page.</p>
     * 
     * <strong>example:</strong>
     * <p>a custom deny page</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the custom error page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreatePageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePageRequest self = new CreatePageRequest();
        return TeaModel.build(map, self);
    }

    public CreatePageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreatePageRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CreatePageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
