// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryRecognizeDataByRuleTypeRequest extends TeaModel {
    /**
     * <p>The type of a sensitive data identification rule. You can call the <a href="https://help.aliyun.com/document_detail/2746905.html">QueryRecognizeRulesType</a> operation to obtain the type of the rule.</p>
     * <ul>
     * <li>1: regular expression</li>
     * <li>2: built-in rule</li>
     * <li>3: sample library</li>
     * <li>4: self-generated data identification model</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RecognizeRulesType")
    public String recognizeRulesType;

    /**
     * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
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
