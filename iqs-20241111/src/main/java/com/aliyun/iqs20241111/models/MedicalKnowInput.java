// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalKnowInput extends TeaModel {
    /**
     * <p>The medical, drug, disease, or food entity whose properties are to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Amoxicillin Capsules</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The entity query type. Valid values:</p>
     * <ul>
     * <li>finding: disease</li>
     * <li>food: food</li>
     * <li>medicine: medicine
     * If this parameter is not specified, the type is automatically identified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>medicine</p>
     */
    @NameInMap("type")
    public String type;

    public static MedicalKnowInput build(java.util.Map<String, ?> map) throws Exception {
        MedicalKnowInput self = new MedicalKnowInput();
        return TeaModel.build(map, self);
    }

    public MedicalKnowInput setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public MedicalKnowInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
