// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmMonitorTemplateRemarkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateCloudGtmMonitorTemplateRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmMonitorTemplateRemarkRequest self = new UpdateCloudGtmMonitorTemplateRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmMonitorTemplateRemarkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmMonitorTemplateRemarkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmMonitorTemplateRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateCloudGtmMonitorTemplateRemarkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
