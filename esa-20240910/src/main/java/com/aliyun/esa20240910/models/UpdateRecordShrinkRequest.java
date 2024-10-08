// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRecordShrinkRequest extends TeaModel {
    @NameInMap("AuthConf")
    public String authConfShrink;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("Comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Data")
    public String dataShrink;

    @NameInMap("HostPolicy")
    public String hostPolicy;

    /**
     * <p>是否代理加速</p>
     */
    @NameInMap("Proxied")
    public Boolean proxied;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Ttl")
    public Integer ttl;

    public static UpdateRecordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordShrinkRequest self = new UpdateRecordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordShrinkRequest setAuthConfShrink(String authConfShrink) {
        this.authConfShrink = authConfShrink;
        return this;
    }
    public String getAuthConfShrink() {
        return this.authConfShrink;
    }

    public UpdateRecordShrinkRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public UpdateRecordShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateRecordShrinkRequest setDataShrink(String dataShrink) {
        this.dataShrink = dataShrink;
        return this;
    }
    public String getDataShrink() {
        return this.dataShrink;
    }

    public UpdateRecordShrinkRequest setHostPolicy(String hostPolicy) {
        this.hostPolicy = hostPolicy;
        return this;
    }
    public String getHostPolicy() {
        return this.hostPolicy;
    }

    public UpdateRecordShrinkRequest setProxied(Boolean proxied) {
        this.proxied = proxied;
        return this;
    }
    public Boolean getProxied() {
        return this.proxied;
    }

    public UpdateRecordShrinkRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateRecordShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateRecordShrinkRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
