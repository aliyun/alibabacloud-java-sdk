// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetStorageDomainRoutingRuleResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1571926439000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>1571926439000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D4978DCC-ECBD-40B0-A714-EE695******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The routing list.</p>
     */
    @NameInMap("Routes")
    public java.util.List<RouteItem> routes;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crsdr-luq6qiegzvx****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetStorageDomainRoutingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageDomainRoutingRuleResponseBody self = new GetStorageDomainRoutingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageDomainRoutingRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStorageDomainRoutingRuleResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetStorageDomainRoutingRuleResponseBody setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public GetStorageDomainRoutingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStorageDomainRoutingRuleResponseBody setRoutes(java.util.List<RouteItem> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<RouteItem> getRoutes() {
        return this.routes;
    }

    public GetStorageDomainRoutingRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public GetStorageDomainRoutingRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
