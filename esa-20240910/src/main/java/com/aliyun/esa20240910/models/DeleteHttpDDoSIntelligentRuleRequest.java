// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteHttpDDoSIntelligentRuleRequest extends TeaModel {
    /**
     * <p>Record name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>Rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20928021</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteHttpDDoSIntelligentRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpDDoSIntelligentRuleRequest self = new DeleteHttpDDoSIntelligentRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHttpDDoSIntelligentRuleRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public DeleteHttpDDoSIntelligentRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DeleteHttpDDoSIntelligentRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
