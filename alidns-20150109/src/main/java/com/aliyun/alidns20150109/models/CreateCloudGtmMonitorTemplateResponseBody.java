// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmMonitorTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>mtp-89518052425100**80</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateCloudGtmMonitorTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmMonitorTemplateResponseBody self = new CreateCloudGtmMonitorTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmMonitorTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloudGtmMonitorTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateCloudGtmMonitorTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
