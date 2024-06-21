// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateMetricRequest extends TeaModel {
    /**
     * <p>The space ID of the user within the ISV account.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The end of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1693407714687</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The metric granularity.</p>
     * <blockquote>
     * <p> Valid values:</p>
     * </blockquote>
     * <ul>
     * <li>DAILY</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DAILY</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The verification code used to verify whether the RAM user is authorized by the independent software vendor (ISV) account.</p>
     * 
     * <strong>example:</strong>
     * <p>skdi3kksloslikdkkdk</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The template language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1693107714687</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>The template code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>744c4b5c79c9432497a075bdfca36bf5</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The template type. Valid values: WHATSAPP and VIBER. If you do not specify this parameter, WHATSAPP is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static GetChatappTemplateMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatappTemplateMetricRequest self = new GetChatappTemplateMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetChatappTemplateMetricRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetChatappTemplateMetricRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetChatappTemplateMetricRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public GetChatappTemplateMetricRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public GetChatappTemplateMetricRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetChatappTemplateMetricRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public GetChatappTemplateMetricRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public GetChatappTemplateMetricRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
