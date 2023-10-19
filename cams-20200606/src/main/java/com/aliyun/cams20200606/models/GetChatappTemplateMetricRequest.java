// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateMetricRequest extends TeaModel {
    /**
     * <p>The space ID of the user within the ISV account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>Metric granularity. Valid values:</p>
     * <br>
     * <p>- DAILY</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The independent software vendor (ISV) verification code. This parameter is used to verify whether the user is authorized by the ISV account.</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The language that is used in the message template. For more information, see [Language codes](~~463420~~).</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>The code of the message template.</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The type of the message template. Valid values:</p>
     * <br>
     * <p>*   **WHATSAPP**</p>
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
