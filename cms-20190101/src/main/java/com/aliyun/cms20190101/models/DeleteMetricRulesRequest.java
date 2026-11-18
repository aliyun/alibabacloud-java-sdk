// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRulesRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. Generate a parameter value on your client to ensure that the value is unique across different requests. ClientToken supports only ASCII characters and can be up to 64 characters in length. For more information, see How to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>6868E9A1-56E6-5FD7-9684-E2963BBAFB5F</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run only. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Sends a check request and does not bind the security group to the instance. The check items include whether required parameters are specified, the request format, and service limits. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): Sends a normal request. If the check succeeds, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IDs of the alert rules to delete.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public java.util.List<String> id;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRulesRequest self = new DeleteMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteMetricRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteMetricRulesRequest setId(java.util.List<String> id) {
        this.id = id;
        return this;
    }
    public java.util.List<String> getId() {
        return this.id;
    }

    public DeleteMetricRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
