// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CopyGtmConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceId")
    @Validation(required = true)
    public String sourceId;

    @NameInMap("TargetId")
    @Validation(required = true)
    public String targetId;

    @NameInMap("CopyType")
    @Validation(required = true)
    public String copyType;

    public static CopyGtmConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyGtmConfigRequest self = new CopyGtmConfigRequest();
        return TeaModel.build(map, self);
    }

    public CopyGtmConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CopyGtmConfigRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CopyGtmConfigRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public CopyGtmConfigRequest setCopyType(String copyType) {
        this.copyType = copyType;
        return this;
    }
    public String getCopyType() {
        return this.copyType;
    }

}
