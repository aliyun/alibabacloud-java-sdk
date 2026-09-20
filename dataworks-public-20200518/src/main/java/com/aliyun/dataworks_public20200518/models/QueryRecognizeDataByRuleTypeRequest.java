// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryRecognizeDataByRuleTypeRequest extends TeaModel {
    /**
     * <p>The recognition rule type. You can call the <a href="https://help.aliyun.com/document_detail/2746905.html">QueryRecognizeRulesType</a> operation to obtain the rule types.</p>
     * <ul>
     * <li>1: regular expression</li>
     * <li>2: built-in model</li>
     * <li>3: sample library</li>
     * <li>4: auto-generated model</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RecognizeRulesType")
    public String recognizeRulesType;

    /**
     * <p>The tenant ID. Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, go to the DataStudio page, click the username in the upper-right corner, and choose Menu &gt; User Info to obtain the tenant ID.</p>
     * <p>You can also obtain the tenant ID from Data.TenantId in the response of the GetProject operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10241024</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryRecognizeDataByRuleTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecognizeDataByRuleTypeRequest self = new QueryRecognizeDataByRuleTypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecognizeDataByRuleTypeRequest setRecognizeRulesType(String recognizeRulesType) {
        this.recognizeRulesType = recognizeRulesType;
        return this;
    }
    public String getRecognizeRulesType() {
        return this.recognizeRulesType;
    }

    public QueryRecognizeDataByRuleTypeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
