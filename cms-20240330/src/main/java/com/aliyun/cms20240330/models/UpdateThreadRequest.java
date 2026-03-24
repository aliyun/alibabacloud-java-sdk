// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateThreadRequest extends TeaModel {
    @NameInMap("attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <p>The status of the session.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The title of the session.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("title")
    public String title;

    public static UpdateThreadRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThreadRequest self = new UpdateThreadRequest();
        return TeaModel.build(map, self);
    }

    public UpdateThreadRequest setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public UpdateThreadRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateThreadRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
