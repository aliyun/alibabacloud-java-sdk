// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateCodeBundleRequest extends TeaModel {
    /**
     * <p>Optional CI/CD metadata JSON, stored as-is on the <code>code_bundles</code> row.
     * Used by downstream scan creation for incremental diff, branch tracking, and audit.
     * Typical structure: <code>{&quot;scan_mode&quot;: {&quot;type&quot;: &quot;full&quot;|&quot;incremental&quot;, &quot;base_ref&quot;: &quot;...&quot;, &quot;base_commit&quot;: &quot;...&quot;, &quot;head_commit&quot;: &quot;...&quot;}, &quot;context&quot;: {&quot;repository&quot;: &quot;...&quot;, &quot;branch&quot;: &quot;...&quot;, &quot;commit&quot;: &quot;...&quot;, &quot;pipeline_source&quot;: &quot;...&quot;, &quot;merge_request_iid&quot;: 123, &quot;default_branch&quot;: &quot;main&quot;}, &quot;client&quot;: {&quot;name&quot;: &quot;krypton-cli&quot;, &quot;version&quot;: &quot;0.2.0&quot;, &quot;os&quot;: &quot;linux&quot;, &quot;arch&quot;: &quot;amd64&quot;}}</code>.
     * Backend does not validate internal fields; clients may add arbitrary keys.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;region&quot;:&quot;cn-beijing&quot;}</p>
     */
    @NameInMap("ciMetadata")
    public String ciMetadata;

    /**
     * <p>Original archive file name; used to derive OSS key suffix (e.g. <code>.zip</code>, <code>.tar.gz</code>).</p>
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
