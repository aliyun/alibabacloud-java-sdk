// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SaveFormRemarkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APP_PBKxxx</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AtUserId")
    public String atUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instxxxx</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instxxxx</p>
     */
    @NameInMap("FormInstanceId")
    public String formInstanceId;

    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>hexxxx</p>
     */
    @NameInMap("ReplyId")
    public Long replyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hexxxx</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    public static SaveFormRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveFormRemarkRequest self = new SaveFormRemarkRequest();
        return TeaModel.build(map, self);
    }

    public SaveFormRemarkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SaveFormRemarkRequest setAtUserId(String atUserId) {
        this.atUserId = atUserId;
        return this;
    }
    public String getAtUserId() {
        return this.atUserId;
    }

    public SaveFormRemarkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SaveFormRemarkRequest setFormInstanceId(String formInstanceId) {
        this.formInstanceId = formInstanceId;
        return this;
    }
    public String getFormInstanceId() {
        return this.formInstanceId;
    }

    public SaveFormRemarkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SaveFormRemarkRequest setReplyId(Long replyId) {
        this.replyId = replyId;
        return this;
    }
    public Long getReplyId() {
        return this.replyId;
    }

    public SaveFormRemarkRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
