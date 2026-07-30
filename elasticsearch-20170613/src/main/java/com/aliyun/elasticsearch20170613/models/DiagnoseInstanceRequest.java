// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DiagnoseInstanceRequest extends TeaModel {
    /**
     * <p>A unique token used to ensure idempotence of the request. The client generates this value. The value must be unique among different requests and cannot exceed 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The diagnostic items.</p>
     */
    @NameInMap("diagnoseItems")
    public java.util.List<String> diagnoseItems;

    /**
     * <p>The list of indexes to diagnose.</p>
     */
    @NameInMap("indices")
    public java.util.List<String> indices;

    /**
     * <p>The type of the diagnostic task. Valid values:</p>
     * <ul>
     * <li>ALL: Diagnoses all indexes.</li>
     * <li>SELECT: Diagnoses selected indexes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The language of the report. Default value: browser language. Valid values:</p>
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

    public static DiagnoseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseInstanceRequest self = new DiagnoseInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DiagnoseInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DiagnoseInstanceRequest setDiagnoseItems(java.util.List<String> diagnoseItems) {
        this.diagnoseItems = diagnoseItems;
        return this;
    }
    public java.util.List<String> getDiagnoseItems() {
        return this.diagnoseItems;
    }

    public DiagnoseInstanceRequest setIndices(java.util.List<String> indices) {
        this.indices = indices;
        return this;
    }
    public java.util.List<String> getIndices() {
        return this.indices;
    }

    public DiagnoseInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DiagnoseInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
