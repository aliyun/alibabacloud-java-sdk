// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PushingSetting extends TeaModel {
    @NameInMap("alertActionIds")
    public java.util.List<String> alertActionIds;

    @NameInMap("restoreActionIds")
    public java.util.List<String> restoreActionIds;

    @NameInMap("templateUuid")
    public String templateUuid;

    public static PushingSetting build(java.util.Map<String, ?> map) throws Exception {
        PushingSetting self = new PushingSetting();
        return TeaModel.build(map, self);
    }

    public PushingSetting setAlertActionIds(java.util.List<String> alertActionIds) {
        this.alertActionIds = alertActionIds;
        return this;
    }
    public java.util.List<String> getAlertActionIds() {
        return this.alertActionIds;
    }

    public PushingSetting setRestoreActionIds(java.util.List<String> restoreActionIds) {
        this.restoreActionIds = restoreActionIds;
        return this;
    }
    public java.util.List<String> getRestoreActionIds() {
        return this.restoreActionIds;
    }

    public PushingSetting setTemplateUuid(String templateUuid) {
        this.templateUuid = templateUuid;
        return this;
    }
    public String getTemplateUuid() {
        return this.templateUuid;
    }

}
