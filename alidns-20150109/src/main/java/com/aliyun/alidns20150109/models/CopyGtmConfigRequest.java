// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CopyGtmConfigRequest extends TeaModel {
    /**
     * <p>The type of the object that is copied. Only the INSTANCE type is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("CopyType")
    public String copyType;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the source object. Only instance IDs are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-0pp1j84v60d</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The ID of the target object. Only instance IDs are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-v0h1gaujg06</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    public static CopyGtmConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyGtmConfigRequest self = new CopyGtmConfigRequest();
        return TeaModel.build(map, self);
    }

    public CopyGtmConfigRequest setCopyType(String copyType) {
        this.copyType = copyType;
        return this;
    }
    public String getCopyType() {
        return this.copyType;
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

}
