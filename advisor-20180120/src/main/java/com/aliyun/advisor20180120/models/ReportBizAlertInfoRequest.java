// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class ReportBizAlertInfoRequest extends TeaModel {
    @NameInMap("AlertDescription")
    public String alertDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlertDetail")
    public String alertDetail;

    @NameInMap("AlertGrade")
    public String alertGrade;

    @NameInMap("AlertLabels")
    public String alertLabels;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlertScene")
    public String alertScene;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlertToken")
    public String alertToken;

    @NameInMap("AlertUid")
    public java.util.List<Long> alertUid;

    @NameInMap("Language")
    public String language;

    public static ReportBizAlertInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportBizAlertInfoRequest self = new ReportBizAlertInfoRequest();
        return TeaModel.build(map, self);
    }

    public ReportBizAlertInfoRequest setAlertDescription(String alertDescription) {
        this.alertDescription = alertDescription;
        return this;
    }
    public String getAlertDescription() {
        return this.alertDescription;
    }

    public ReportBizAlertInfoRequest setAlertDetail(String alertDetail) {
        this.alertDetail = alertDetail;
        return this;
    }
    public String getAlertDetail() {
        return this.alertDetail;
    }

    public ReportBizAlertInfoRequest setAlertGrade(String alertGrade) {
        this.alertGrade = alertGrade;
        return this;
    }
    public String getAlertGrade() {
        return this.alertGrade;
    }

    public ReportBizAlertInfoRequest setAlertLabels(String alertLabels) {
        this.alertLabels = alertLabels;
        return this;
    }
    public String getAlertLabels() {
        return this.alertLabels;
    }

    public ReportBizAlertInfoRequest setAlertScene(String alertScene) {
        this.alertScene = alertScene;
        return this;
    }
    public String getAlertScene() {
        return this.alertScene;
    }

    public ReportBizAlertInfoRequest setAlertToken(String alertToken) {
        this.alertToken = alertToken;
        return this;
    }
    public String getAlertToken() {
        return this.alertToken;
    }

    public ReportBizAlertInfoRequest setAlertUid(java.util.List<Long> alertUid) {
        this.alertUid = alertUid;
        return this;
    }
    public java.util.List<Long> getAlertUid() {
        return this.alertUid;
    }

    public ReportBizAlertInfoRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
