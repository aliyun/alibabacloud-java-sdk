// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdatePageShrinkRequest extends TeaModel {
    /**
     * <p>The BASE64-encoded page content, which must be consistent with <code>ContentType</code>.</p>
     * <p><strong>Encoding method</strong>:</p>
     * <ol>
     * <li>Convert the original page content to a UTF-8 byte string.</li>
     * <li>Encode the byte string using standard BASE64 encoding.</li>
     * </ol>
     * <p><strong>Example</strong>: <code>&lt;html&gt;hello page&lt;/html&gt;</code> → <code>PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=</code></p>
     * <blockquote>
     * <p>The maximum size limit is subject to the server-side custom page specification. If this parameter is not specified, the original page content is retained.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The MIME type of the page content, which is returned to the client as the HTTP <code>Content-Type</code> response header when a rule is matched.</p>
     * <p><strong>Common values</strong>:</p>
     * <ul>
     * <li><code>text/html</code>: HTML page</li>
     * <li><code>application/json</code>: JSON response</li>
     * </ul>
     * <blockquote>
     * <p>The complete set of supported values is subject to the server-side specification. The actual format of <code>Content</code> must match this field. A mismatch may cause browser rendering issues.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text/html</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The description of the page after the update. This is used to identify the purpose of the page in the console list. This is an optional field. If this parameter is not specified, the original description is retained. The maximum field length is subject to the server-side limit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a custom deny page</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the custom response page. You can obtain this value by calling the <a href="https://help.aliyun.com/document_detail/2850223.html">ListPages</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the custom response page after the update.</p>
     * <p><strong>Naming suggestion</strong>: Use a combination of letters, digits, and underscores (such as <code>blocked_page_v2</code>) for easy reference in rules. The character set, maximum length, and uniqueness constraints are subject to the server-side naming conventions for custom pages. If this parameter is not specified, the original name is retained.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of site IDs associated with this page after the update. This parameter uses full overwrite semantics.</p>
     * <ul>
     * <li>You can obtain site IDs by calling the <code>ListSites</code> operation.</li>
     * <li>Passing an empty list dissociates all sites from the page.</li>
     * <li>Including a site ID that does not belong to your account returns an <code>InvalidParameter</code> error.</li>
     * </ul>
     */
    @NameInMap("SiteIds")
    public String siteIdsShrink;

    public static UpdatePageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePageShrinkRequest self = new UpdatePageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePageShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdatePageShrinkRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UpdatePageShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePageShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdatePageShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePageShrinkRequest setSiteIdsShrink(String siteIdsShrink) {
        this.siteIdsShrink = siteIdsShrink;
        return this;
    }
    public String getSiteIdsShrink() {
        return this.siteIdsShrink;
    }

}
