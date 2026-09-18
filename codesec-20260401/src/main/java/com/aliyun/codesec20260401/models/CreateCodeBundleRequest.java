// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateCodeBundleRequest extends TeaModel {
    /**
     * <p>An optional CI/CD metadata JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;region&quot;:&quot;cn-beijing&quot;}</p>
     */
    @NameInMap("ciMetadata")
    public String ciMetadata;

    /**
     * <p>The file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-cases.zip</p>
     */
    @NameInMap("filename")
    public String filename;

    public static CreateCodeBundleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeBundleRequest self = new CreateCodeBundleRequest();
        return TeaModel.build(map, self);
    }

    public CreateCodeBundleRequest setCiMetadata(String ciMetadata) {
        this.ciMetadata = ciMetadata;
        return this;
    }
    public String getCiMetadata() {
        return this.ciMetadata;
    }

    public CreateCodeBundleRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

}
