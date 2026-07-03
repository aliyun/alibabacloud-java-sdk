// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SubmitImportLogTasksRequest extends TeaModel {
    /**
     * <p>The list of accounts for log ingestion. The value must be a JSON array. Valid values:</p>
     * <ul>
     * <li><p>AccountId: The ID of the account.</p>
     * </li>
     * <li><p>Imported: Specifies whether to enable or disable log ingestion for the account. Valid values:</p>
     * <ul>
     * <li><p>0: Disable ingestion.</p>
     * </li>
     * <li><p>1: Enable ingestion.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;AccountId&quot;:&quot;123123&quot;,&quot;Imported&quot;:1}]</p>
     */
    @NameInMap("Accounts")
    public String accounts;

    /**
     * <p>Specifies whether to automatically enable log ingestion for accounts that are configured with the specified log. Valid values:</p>
     * <ul>
     * <li><p>1: Yes.</p>
     * </li>
     * <li><p>0: No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoImported")
    public Integer autoImported;

    /**
     * <p>The code of the cloud service provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hcloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The list of logs to be ingested. The value must be a JSON array.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cloud_siem_qcloud_cfw_alert_log&quot;]</p>
     */
    @NameInMap("LogCodes")
    public String logCodes;

    /**
     * <p>The code of the product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qcloud_waf</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>The region where the data management center for Threat Analysis is located. Select a region based on the location of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or Hong Kong (China).</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member that the administrator wants to access.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of view. Valid values:</p>
     * <ul>
     * <li><p>0: The view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: The view of all accounts within the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    public static SubmitImportLogTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImportLogTasksRequest self = new SubmitImportLogTasksRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImportLogTasksRequest setAccounts(String accounts) {
        this.accounts = accounts;
        return this;
    }
    public String getAccounts() {
        return this.accounts;
    }

    public SubmitImportLogTasksRequest setAutoImported(Integer autoImported) {
        this.autoImported = autoImported;
        return this;
    }
    public Integer getAutoImported() {
        return this.autoImported;
    }

    public SubmitImportLogTasksRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public SubmitImportLogTasksRequest setLogCodes(String logCodes) {
        this.logCodes = logCodes;
        return this;
    }
    public String getLogCodes() {
        return this.logCodes;
    }

    public SubmitImportLogTasksRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public SubmitImportLogTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SubmitImportLogTasksRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public SubmitImportLogTasksRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
