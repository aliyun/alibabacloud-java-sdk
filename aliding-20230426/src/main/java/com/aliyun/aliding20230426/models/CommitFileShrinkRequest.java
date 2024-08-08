// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CommitFileShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Option")
    public String optionShrink;

    /**
     * <strong>example:</strong>
     * <p>dentryUuid</p>
     */
    @NameInMap("ParentDentryUuid")
    public String parentDentryUuid;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <strong>example:</strong>
     * <p>upload_key</p>
     */
    @NameInMap("UploadKey")
    public String uploadKey;

    public static CommitFileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitFileShrinkRequest self = new CommitFileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CommitFileShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CommitFileShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public CommitFileShrinkRequest setParentDentryUuid(String parentDentryUuid) {
        this.parentDentryUuid = parentDentryUuid;
        return this;
    }
    public String getParentDentryUuid() {
        return this.parentDentryUuid;
    }

    public CommitFileShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CommitFileShrinkRequest setUploadKey(String uploadKey) {
        this.uploadKey = uploadKey;
        return this;
    }
    public String getUploadKey() {
        return this.uploadKey;
    }

}
