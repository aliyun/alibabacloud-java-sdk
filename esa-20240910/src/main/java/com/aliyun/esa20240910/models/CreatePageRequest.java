// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreatePageRequest extends TeaModel {
    /**
     * <p>The BASE64-encoded page content. The actual content format must match the value of <code>ContentType</code>.</p>
     * <p><strong>Encoding method</strong>:</p>
     * <ol>
     * <li>Encode the original page content into a byte string by using UTF-8 encoding.</li>
     * <li>Apply standard BASE64 encoding to the byte string.</li>
     * </ol>
     * <p><strong>Example</strong>:</p>
     * <ul>
     * <li>Original content: <code>&lt;html&gt;hello page&lt;/html&gt;</code></li>
     * <li>BASE64: <code>PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=</code></li>
     * </ul>
     * <blockquote>
     * <p>The maximum size, supported character sets, and security filtering rules are subject to the server-side custom page specifications.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The MIME type of the page content. This value is returned to the client as the HTTP <code>Content-Type</code> response header after a match.</p>
     * <p><strong>Common values</strong>:</p>
     * <ul>
     * <li><code>text/html</code>: HTML page. The <code>Content</code> parameter must be set to the BASE64-encoded value of UTF-8 HTML text.</li>
     * <li><code>application/json</code>: JSON response. The <code>Content</code> parameter must be set to the BASE64-encoded value of a valid JSON string.</li>
     * <li><code>text/plain</code>: plain text. The <code>Content</code> parameter must be set to the BASE64-encoded value of plain text content.</li>
     * </ul>
     * <blockquote>
     * <p>Note: The complete list of supported ContentType values is subject to the server-side specifications. If the specified <code>ContentType</code> does not match the actual format of <code>Content</code>, the client may fail to render the page properly.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text/html</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The description of the page, used to identify the purpose of the page in the console list.</p>
     * <p><strong>Suggested content</strong>: Use the scenarios and identity information of the page, such as &quot;CC protection block page - Chinese version&quot;. This is an optional field. If not specified, the value is empty by default.</p>
     * <blockquote>
     * <p>The maximum field length is subject to the server-side specifications.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a custom deny page</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the custom page.</p>
     * <p><strong>Naming suggestions</strong>: Use a short name that consists of letters, digits, and underscores, such as <code>blocked_page_v1</code>, for easy reference in rules. The specific character set, maximum length, uniqueness, and other constraints are <strong>subject to the server-side custom page naming specifications</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of website IDs to associate with this custom page.</p>
     * <ul>
     * <li>You can obtain website IDs by calling the <code>ListSites</code> operation.</li>
     * <li>If you pass an empty list (no websites are associated), the page is still created but does not take effect. You can call the <code>UpdatePage</code> operation later to associate websites.</li>
     * <li>If the list contains a website ID that does not belong to the current account, an <code>InvalidParameter</code> error is returned.</li>
     * </ul>
     */
    @NameInMap("SiteIds")
    public java.util.List<Long> siteIds;

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

    public CreatePageRequest setSiteIds(java.util.List<Long> siteIds) {
        this.siteIds = siteIds;
        return this;
    }
    public java.util.List<Long> getSiteIds() {
        return this.siteIds;
    }

}
