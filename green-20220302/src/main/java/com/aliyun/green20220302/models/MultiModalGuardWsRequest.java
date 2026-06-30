// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardWsRequest extends TeaModel {
    /**
     * <p>The model type. Valid values:</p>
     * <ul>
     * <li>LLM</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LLM</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>The protocol type. Valid values:</p>
     * <ul>
     * <li>OpenAI</li>
     * <li>DashScope</li>
     * <li>Anthropic</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DashScope</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The moderation service category. Valid values:</p>
     * <ul>
     * <li>query_security_check_pro: AI input content security detection (pro edition).</li>
     * <li>response_security_check_pro: AI-generated content security detection (pro edition).</li>
     * <li>img_query_security_check: AIGC input image security detection.</li>
     * <li>img_response_security_check: AIGC output image security detection.</li>
     * <li>text_img_mix_guard: Multimodal (text + image) hybrid security detection.</li>
     * <li>file_security_sync_check: AIGC input or output file security detection.</li>
     * <li>text_file_sec_sync_check: Multimodal (text + file) real-time security detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>query_security_check_pro</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The parameter set required by the moderation service, in JSON string format. The input parameter for text content is content (String), the input parameter for image content is imageUrls (JSONArray), and the input parameter for file content is fileUrls (JSONArray).</p>
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

    public static MultiModalGuardWsRequest build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardWsRequest self = new MultiModalGuardWsRequest();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardWsRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public MultiModalGuardWsRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public MultiModalGuardWsRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public MultiModalGuardWsRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
