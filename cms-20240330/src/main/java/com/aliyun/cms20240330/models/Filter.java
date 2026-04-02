// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Filter extends TeaModel {
    @NameInMap("displayName")
    public DisplayNameFilter displayName;

    @NameInMap("enabled")
    public EnabledFilter enabled;

    @NameInMap("labels")
    public LabelsFilter labels;

    @NameInMap("status")
    public StatusFilter status;

    @NameInMap("uuid")
    public UuidFilter uuid;

    public static Filter build(java.util.Map<String, ?> map) throws Exception {
        Filter self = new Filter();
        return TeaModel.build(map, self);
    }

    public Filter setDisplayName(DisplayNameFilter displayName) {
        this.displayName = displayName;
        return this;
    }
    public DisplayNameFilter getDisplayName() {
        return this.displayName;
    }

    public Filter setEnabled(EnabledFilter enabled) {
        this.enabled = enabled;
        return this;
    }
    public EnabledFilter getEnabled() {
        return this.enabled;
    }

    public Filter setLabels(LabelsFilter labels) {
        this.labels = labels;
        return this;
    }
    public LabelsFilter getLabels() {
        return this.labels;
    }

    public Filter setStatus(StatusFilter status) {
        this.status = status;
        return this;
    }
    public StatusFilter getStatus() {
        return this.status;
    }

    public Filter setUuid(UuidFilter uuid) {
        this.uuid = uuid;
        return this;
    }
    public UuidFilter getUuid() {
        return this.uuid;
    }

}
