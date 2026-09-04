// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CompleteCodeBundleRequest extends TeaModel {
    /**
     * <p>Declared uploaded object size; should match OSS <strong><code>Content-Length</code></strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("byteSize")
    public Long byteSize;

    /**
     * <p>MIME type stored on the bundle (often <strong><code>application/octet-stream</code></strong> for presigned PUT).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>application/octet-stream</p>
     */
    @NameInMap("contentType")
    public String contentType;

    public static CompleteCodeBundleRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteCodeBundleRequest self = new CompleteCodeBundleRequest();
        return TeaModel.build(map, self);
    }

    public CompleteCodeBundleRequest setByteSize(Long byteSize) {
        this.byteSize = byteSize;
        return this;
    }
    public Long getByteSize() {
        return this.byteSize;
    }

    public CompleteCodeBundleRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

}
