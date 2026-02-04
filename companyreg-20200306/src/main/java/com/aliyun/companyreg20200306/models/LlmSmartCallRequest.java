// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class LlmSmartCallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>P20210208152920000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>esp.companyreg_cloud</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>13518132662</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <strong>example:</strong>
     * <p>xinxuan</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;prompt\&quot;:\&quot;{\\\&quot;accountId\\\&quot;:\\\&quot;03D31F61DD6512D23F5789A439CE4CA2\\\&quot;,\\\&quot;conversationId\\\&quot;:\\\&quot;K7nBeth9\\\&quot;}\&quot;}</p>
     */
    @NameInMap("PromptParam")
    public String promptParam;

    /**
     * <strong>example:</strong>
     * <p>robotcall_001</p>
     */
    @NameInMap("ScenesCode")
    public String scenesCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SkillType")
    public Integer skillType;

    @NameInMap("StartWordParam")
    public String startWordParam;

    /**
     * <strong>example:</strong>
     * <p>msea</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    public static LlmSmartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallRequest self = new LlmSmartCallRequest();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public LlmSmartCallRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public LlmSmartCallRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public LlmSmartCallRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public LlmSmartCallRequest setPromptParam(String promptParam) {
        this.promptParam = promptParam;
        return this;
    }
    public String getPromptParam() {
        return this.promptParam;
    }

    public LlmSmartCallRequest setScenesCode(String scenesCode) {
        this.scenesCode = scenesCode;
        return this;
    }
    public String getScenesCode() {
        return this.scenesCode;
    }

    public LlmSmartCallRequest setSkillType(Integer skillType) {
        this.skillType = skillType;
        return this;
    }
    public Integer getSkillType() {
        return this.skillType;
    }

    public LlmSmartCallRequest setStartWordParam(String startWordParam) {
        this.startWordParam = startWordParam;
        return this;
    }
    public String getStartWordParam() {
        return this.startWordParam;
    }

    public LlmSmartCallRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

}
