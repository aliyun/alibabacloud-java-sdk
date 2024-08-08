// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultipartFileUploadInfosShrinkRequest extends TeaModel {
    @NameInMap("Option")
    public String optionShrink;

    @NameInMap("PartNumbers")
    public String partNumbersShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <strong>example:</strong>
     * <p>hwHPAAAAAipHxxxxx</p>
     */
    @NameInMap("UploadKey")
    public String uploadKey;

    public static GetMultipartFileUploadInfosShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultipartFileUploadInfosShrinkRequest self = new GetMultipartFileUploadInfosShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetMultipartFileUploadInfosShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public GetMultipartFileUploadInfosShrinkRequest setPartNumbersShrink(String partNumbersShrink) {
        this.partNumbersShrink = partNumbersShrink;
        return this;
    }
    public String getPartNumbersShrink() {
        return this.partNumbersShrink;
    }

    public GetMultipartFileUploadInfosShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GetMultipartFileUploadInfosShrinkRequest setUploadKey(String uploadKey) {
        this.uploadKey = uploadKey;
        return this;
    }
    public String getUploadKey() {
        return this.uploadKey;
    }

}
