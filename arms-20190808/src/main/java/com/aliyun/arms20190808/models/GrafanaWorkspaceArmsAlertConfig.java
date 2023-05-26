// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceArmsAlertConfig extends TeaModel {
    @NameInMap("armsAlertsEnable")
    public String armsAlertsEnable;

    @NameInMap("armsAlertsWebhookUrl")
    public String armsAlertsWebhookUrl;

    public static GrafanaWorkspaceArmsAlertConfig build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceArmsAlertConfig self = new GrafanaWorkspaceArmsAlertConfig();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceArmsAlertConfig setArmsAlertsEnable(String armsAlertsEnable) {
        this.armsAlertsEnable = armsAlertsEnable;
        return this;
    }
    public String getArmsAlertsEnable() {
        return this.armsAlertsEnable;
    }

    public GrafanaWorkspaceArmsAlertConfig setArmsAlertsWebhookUrl(String armsAlertsWebhookUrl) {
        this.armsAlertsWebhookUrl = armsAlertsWebhookUrl;
        return this;
    }
    public String getArmsAlertsWebhookUrl() {
        return this.armsAlertsWebhookUrl;
    }

}
