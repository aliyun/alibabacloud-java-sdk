// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RebootAndroidInstancesInGroupRequest extends TeaModel {
    /**
     * <p>The list of instance IDs.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    /**
     * <p>Specifies whether to force a restart. You can force a restart if a cloud phone cannot be shut down due to system or network exceptions. Unsaved data may be lost.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceStop")
    public Boolean forceStop;

    /**
     * <p>Specifies whether to skip parameter validation. A value of true indicates that validation is skipped. If the value is false or not specified, validation is performed.</p>
     */
    @NameInMap("IgnoreParamValidation")
    public Boolean ignoreParamValidation;

    /**
     * <p><strong>[Deprecated]</strong> The sales mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("SaleMode")
    public String saleMode;

    public static RebootAndroidInstancesInGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootAndroidInstancesInGroupRequest self = new RebootAndroidInstancesInGroupRequest();
        return TeaModel.build(map, self);
    }

    public RebootAndroidInstancesInGroupRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public RebootAndroidInstancesInGroupRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

    public RebootAndroidInstancesInGroupRequest setIgnoreParamValidation(Boolean ignoreParamValidation) {
        this.ignoreParamValidation = ignoreParamValidation;
        return this;
    }
    public Boolean getIgnoreParamValidation() {
        return this.ignoreParamValidation;
    }

    public RebootAndroidInstancesInGroupRequest setSaleMode(String saleMode) {
        this.saleMode = saleMode;
        return this;
    }
    public String getSaleMode() {
        return this.saleMode;
    }

}
