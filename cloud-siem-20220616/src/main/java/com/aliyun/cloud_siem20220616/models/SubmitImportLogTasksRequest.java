// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SubmitImportLogTasksRequest extends TeaModel {
    /**
     * <p>The accounts that you want to add. The value is a JSON array. Valid values:</p>
     * <ul>
     * <li><p>AccountId: the IDs of the accounts.</p>
     * </li>
     * <li><p>Imported: specifies whether to add the accounts. Valid values:</p>
     * <ul>
     * <li>0: no</li>
     * <li>1: yes</li>
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
     * <p>Specifies whether to automatically add the account for which the logging feature is configured. Valid values:</p>
     * <ul>
     * <li>1: yes</li>
     * <li>0: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cloud_siem_qcloud_cfw_alert_log&quot;]</p>
     */
    @NameInMap("AutoImported")
    public Integer autoImported;

    /**
     * <p>The code that is used for multi-cloud environments. Valid values:</p>
     * <ul>
     * <li>qcloud: Tencent Cloud</li>
     * <li>aliyun: Alibaba Cloud</li>
     * <li>hcloud: Huawei Cloud</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hcloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The logs that you want to collect. The value is a JSON array.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cloud_siem_qcloud_cfw_alert_log&quot;]</p>
     */
    @NameInMap("LogCodes")
    public String logCodes;

    /**
     * <p>The code of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qcloud_waf</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions inside China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the account that you switch from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account</li>
     * <li>1: the global account</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
