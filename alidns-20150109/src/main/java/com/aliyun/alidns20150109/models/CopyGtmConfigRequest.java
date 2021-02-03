// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CopyGtmConfigRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceId")
    public String sourceId;

    @NameInMap("TargetId")
    public String targetId;

    @NameInMap("CopyType")
    public String copyType;

    public static CopyGtmConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyGtmConfigRequest self = new CopyGtmConfigRequest();
        return TeaModel.build(map, self);
    }

    public CopyGtmConfigRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
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
