// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmMonitorTemplateRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Chinese</li>
     * <li><strong>en-US</strong> (default): English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the health check template that you want to query. This ID uniquely identifies the health check template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mtp-89518052425100**80</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DescribeCloudGtmMonitorTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmMonitorTemplateRequest self = new DescribeCloudGtmMonitorTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmMonitorTemplateRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeCloudGtmMonitorTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
