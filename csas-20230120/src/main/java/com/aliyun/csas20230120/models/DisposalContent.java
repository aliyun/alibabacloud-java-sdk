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

    @NameInMap("AlertContentEn")
    public String alertContentEn;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AlertTitle")
    public String alertTitle;

    @NameInMap("AlertTitleEn")
    public String alertTitleEn;

    @NameInMap("NacDemotionPolicyIds")
    public java.util.List<String> nacDemotionPolicyIds;

    @NameInMap("NoticeContent")
    public String noticeContent;

    @NameInMap("NoticeContentEn")
    public String noticeContentEn;

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

    public DisposalContent setAlertContentEn(String alertContentEn) {
        this.alertContentEn = alertContentEn;
        return this;
    }
    public String getAlertContentEn() {
        return this.alertContentEn;
    }

    public DisposalContent setAlertTitle(String alertTitle) {
        this.alertTitle = alertTitle;
        return this;
    }
    public String getAlertTitle() {
        return this.alertTitle;
    }

    public DisposalContent setAlertTitleEn(String alertTitleEn) {
        this.alertTitleEn = alertTitleEn;
        return this;
    }
    public String getAlertTitleEn() {
        return this.alertTitleEn;
    }

    public DisposalContent setNacDemotionPolicyIds(java.util.List<String> nacDemotionPolicyIds) {
        this.nacDemotionPolicyIds = nacDemotionPolicyIds;
        return this;
    }
    public java.util.List<String> getNacDemotionPolicyIds() {
        return this.nacDemotionPolicyIds;
    }

    public DisposalContent setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
        return this;
    }
    public String getNoticeContent() {
        return this.noticeContent;
    }

    public DisposalContent setNoticeContentEn(String noticeContentEn) {
        this.noticeContentEn = noticeContentEn;
        return this;
    }
    public String getNoticeContentEn() {
        return this.noticeContentEn;
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
