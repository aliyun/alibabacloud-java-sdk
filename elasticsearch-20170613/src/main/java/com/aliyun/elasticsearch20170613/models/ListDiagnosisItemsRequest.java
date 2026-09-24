// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnosisItemsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-v0h14zdee000mimee</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The supported request language. Default value: the browser request language. Valid values:</p>
     * <ul>
     * <li>en: English</li>
     * <li>zh: Simplified Chinese</li>
     * <li>zt: Traditional Chinese</li>
     * <li>es: Spanish</li>
     * <li>fr: French</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>The diagnostic item level. Valid values:</p>
     * <ul>
     * <li>BASIC: basic inspection item (free).</li>
     * <li>ADVANCED: advanced inspection item (consumes billable tokens).</li>
     * </ul>
     * <p>If this parameter is not specified, diagnostic items of all levels are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("level")
    public String level;

    public static ListDiagnosisItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosisItemsRequest self = new ListDiagnosisItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListDiagnosisItemsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDiagnosisItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDiagnosisItemsRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

}
