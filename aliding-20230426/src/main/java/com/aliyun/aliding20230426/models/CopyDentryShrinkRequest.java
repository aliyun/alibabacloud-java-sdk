// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CopyDentryShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DentryId")
    public String dentryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SpaceId")
    public String spaceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetSpaceId")
    public String targetSpaceId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("ToNextDentryId")
    public String toNextDentryId;

    @NameInMap("ToParentDentryId")
    public String toParentDentryId;

    @NameInMap("ToPrevDentryId")
    public String toPrevDentryId;

    public static CopyDentryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyDentryShrinkRequest self = new CopyDentryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CopyDentryShrinkRequest setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public CopyDentryShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CopyDentryShrinkRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public CopyDentryShrinkRequest setTargetSpaceId(String targetSpaceId) {
        this.targetSpaceId = targetSpaceId;
        return this;
    }
    public String getTargetSpaceId() {
        return this.targetSpaceId;
    }

    public CopyDentryShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CopyDentryShrinkRequest setToNextDentryId(String toNextDentryId) {
        this.toNextDentryId = toNextDentryId;
        return this;
    }
    public String getToNextDentryId() {
        return this.toNextDentryId;
    }

    public CopyDentryShrinkRequest setToParentDentryId(String toParentDentryId) {
        this.toParentDentryId = toParentDentryId;
        return this;
    }
    public String getToParentDentryId() {
        return this.toParentDentryId;
    }

    public CopyDentryShrinkRequest setToPrevDentryId(String toPrevDentryId) {
        this.toPrevDentryId = toPrevDentryId;
        return this;
    }
    public String getToPrevDentryId() {
        return this.toPrevDentryId;
    }

}
