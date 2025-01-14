// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DisposalContent extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AlertContent")
    public String alertContent;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AlertTitle")
    public String alertTitle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("NotifyActions")
    public java.util.List<String> notifyActions;

    @NameInMap("ProhibitActions")
    public java.util.List<String> prohibitActions;

    public static DisposalContent build(java.util.Map<String, ?> map) throws Exception {
        DisposalContent self = new DisposalContent();
        return TeaModel.build(map, self);
    }

    public DisposalContent setAlertContent(String alertContent) {
        this.alertContent = alertContent;
        return this;
    }
    public String getAlertContent() {
        return this.alertContent;
    }

    public DisposalContent setAlertTitle(String alertTitle) {
        this.alertTitle = alertTitle;
        return this;
    }
    public String getAlertTitle() {
        return this.alertTitle;
    }

    public DisposalContent setNotifyActions(java.util.List<String> notifyActions) {
        this.notifyActions = notifyActions;
        return this;
    }
    public java.util.List<String> getNotifyActions() {
        return this.notifyActions;
    }

    public DisposalContent setProhibitActions(java.util.List<String> prohibitActions) {
        this.prohibitActions = prohibitActions;
        return this;
    }
    public java.util.List<String> getProhibitActions() {
        return this.prohibitActions;
    }

}
