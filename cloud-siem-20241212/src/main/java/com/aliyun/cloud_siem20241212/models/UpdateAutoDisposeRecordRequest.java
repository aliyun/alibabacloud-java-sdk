// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateAutoDisposeRecordRequest extends TeaModel {
    /**
     * <p>The conclusion of the automatic alert analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>疑似误报</p>
     */
    @NameInMap("AutoDecisionConclusion")
    public String autoDecisionConclusion;

    /**
     * <p>The list of entities for analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;entityType&quot;:&quot;file&quot;,&quot;entityName&quot;:&quot;/path/file.file&quot;,&quot;entityUuid&quot;:&quot;b7efb45ce7ff09758****&quot;,&quot;disposalMethod&quot;:&quot;delete&quot;,&quot;playbookUuid&quot;:&quot;9213bhdjagdja****&quot;}]</p>
     */
    @NameInMap("AutoDecisionEntityList")
    public String autoDecisionEntityList;

    /**
     * <p>The analysis result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("AutoDecisionResult")
    public String autoDecisionResult;

    /**
     * <p>The unique ID of the analysis record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4227e0cdc4b7efb45ce7ff09758****</p>
     */
    @NameInMap("AutoDisposeRecordId")
    public String autoDisposeRecordId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static UpdateAutoDisposeRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoDisposeRecordRequest self = new UpdateAutoDisposeRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoDisposeRecordRequest setAutoDecisionConclusion(String autoDecisionConclusion) {
        this.autoDecisionConclusion = autoDecisionConclusion;
        return this;
    }
    public String getAutoDecisionConclusion() {
        return this.autoDecisionConclusion;
    }

    public UpdateAutoDisposeRecordRequest setAutoDecisionEntityList(String autoDecisionEntityList) {
        this.autoDecisionEntityList = autoDecisionEntityList;
        return this;
    }
    public String getAutoDecisionEntityList() {
        return this.autoDecisionEntityList;
    }

    public UpdateAutoDisposeRecordRequest setAutoDecisionResult(String autoDecisionResult) {
        this.autoDecisionResult = autoDecisionResult;
        return this;
    }
    public String getAutoDecisionResult() {
        return this.autoDecisionResult;
    }

    public UpdateAutoDisposeRecordRequest setAutoDisposeRecordId(String autoDisposeRecordId) {
        this.autoDisposeRecordId = autoDisposeRecordId;
        return this;
    }
    public String getAutoDisposeRecordId() {
        return this.autoDisposeRecordId;
    }

    public UpdateAutoDisposeRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
