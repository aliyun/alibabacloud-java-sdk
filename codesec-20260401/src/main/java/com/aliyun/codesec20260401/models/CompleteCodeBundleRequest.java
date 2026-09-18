// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CompleteCodeBundleRequest extends TeaModel {
    /**
     * <p>The declared size of the uploaded object. This value must match the OSS Content-Length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("byteSize")
    public Long byteSize;

    /**
     * <p>The MIME type of the stored code bundle. This is typically application/octet-stream for pre-signed PUT operations.</p>
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
