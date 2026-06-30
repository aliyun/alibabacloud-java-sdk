// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardRequest extends TeaModel {
    /**
     * <p>The type of the moderation service. Valid values:</p>
     * <ul>
     * <li><p>query_security_check: AI input content moderation.</p>
     * </li>
     * <li><p>response_security_check: AI-generated content moderation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>query_security_check_pro</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The set of parameters required for the moderation service. The value must be a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li><p>文本：
     * {
     * &quot;content&quot;: &quot;test&quot;
     * }</p>
     * </li>
     * <li><p>图片：
     * {
     * &quot;imageUrls&quot;: [&quot;<a href="https://example.com/image.png%22%5D">https://example.com/image.png&quot;]</a>
     * }</p>
     * </li>
     * <li><p>文件：
     * {
     * &quot;fileUrls&quot;: [&quot;<a href="https://example.com/file.pdf%22%5D">https://example.com/file.pdf&quot;]</a>
     * }</p>
     * </li>
     * </ul>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static MultiModalGuardRequest build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardRequest self = new MultiModalGuardRequest();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public MultiModalGuardRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
