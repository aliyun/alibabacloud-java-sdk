// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class RecordPostBackRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>P111111111111</p>
     */
    @NameInMap("bizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp.zhangsan</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("contactor")
    public String contactor;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp_produce</p>
     */
    @NameInMap("entityKey")
    public String entityKey;

    public static RecordPostBackRequest build(java.util.Map<String, ?> map) throws Exception {
        RecordPostBackRequest self = new RecordPostBackRequest();
        return TeaModel.build(map, self);
    }

    public RecordPostBackRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RecordPostBackRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public RecordPostBackRequest setContactor(String contactor) {
        this.contactor = contactor;
        return this;
    }
    public String getContactor() {
        return this.contactor;
    }

    public RecordPostBackRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RecordPostBackRequest setEntityKey(String entityKey) {
        this.entityKey = entityKey;
        return this;
    }
    public String getEntityKey() {
        return this.entityKey;
    }

}
