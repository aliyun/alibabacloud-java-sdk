// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteHttpDDoSIntelligentRuleResponseBody extends TeaModel {
    /**
     * <p>Record name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20757864</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteHttpDDoSIntelligentRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpDDoSIntelligentRuleResponseBody self = new DeleteHttpDDoSIntelligentRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHttpDDoSIntelligentRuleResponseBody setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public DeleteHttpDDoSIntelligentRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHttpDDoSIntelligentRuleResponseBody setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DeleteHttpDDoSIntelligentRuleResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
