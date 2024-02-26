// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class ReportBizAlertInfoShrinkRequest extends TeaModel {
    @NameInMap("AlertDescription")
    public String alertDescription;

    @NameInMap("AlertDetail")
    public String alertDetail;

    @NameInMap("AlertGrade")
    public String alertGrade;

    @NameInMap("AlertLabels")
    public String alertLabels;

    @NameInMap("AlertScene")
    public String alertScene;

    @NameInMap("AlertToken")
    public String alertToken;

    @NameInMap("AlertUid")
    public String alertUidShrink;

    @NameInMap("Language")
    public String language;

    public static ReportBizAlertInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportBizAlertInfoShrinkRequest self = new ReportBizAlertInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReportBizAlertInfoShrinkRequest setAlertDescription(String alertDescription) {
        this.alertDescription = alertDescription;
        return this;
    }
    public String getAlertDescription() {
        return this.alertDescription;
    }

    public ReportBizAlertInfoShrinkRequest setAlertDetail(String alertDetail) {
        this.alertDetail = alertDetail;
        return this;
    }
    public String getAlertDetail() {
        return this.alertDetail;
    }

    public ReportBizAlertInfoShrinkRequest setAlertGrade(String alertGrade) {
        this.alertGrade = alertGrade;
        return this;
    }
    public String getAlertGrade() {
        return this.alertGrade;
    }

    public ReportBizAlertInfoShrinkRequest setAlertLabels(String alertLabels) {
        this.alertLabels = alertLabels;
        return this;
    }
    public String getAlertLabels() {
        return this.alertLabels;
    }

    public ReportBizAlertInfoShrinkRequest setAlertScene(String alertScene) {
        this.alertScene = alertScene;
        return this;
    }
    public String getAlertScene() {
        return this.alertScene;
    }

    public ReportBizAlertInfoShrinkRequest setAlertToken(String alertToken) {
        this.alertToken = alertToken;
        return this;
    }
    public String getAlertToken() {
        return this.alertToken;
    }

    public ReportBizAlertInfoShrinkRequest setAlertUidShrink(String alertUidShrink) {
        this.alertUidShrink = alertUidShrink;
        return this;
    }
    public String getAlertUidShrink() {
        return this.alertUidShrink;
    }

    public ReportBizAlertInfoShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
