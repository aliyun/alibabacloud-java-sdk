// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageDeliveryShrinkRequest extends TeaModel {
    /**
     * <p>是否将后续新增且可用的纳管成员自动加入该日志类型的账号选择。true 表示开启，false 表示关闭；关闭不会移除已选择成员。省略保持原值。需同时传 LogCode、ConfigurationVersion、TargetProject，可与 SelectedAccountIds 一起更新，不可同时传 LogDeliveryStatus 或成员 SubUserId。实际投递还受多账号总开关和该日志类型投递开关控制。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoIncludeNewAccounts")
    public Boolean autoIncludeNewAccounts;

    /**
     * <p>本次修改所依据的投递设置版本。先调用 GetDataStorage，取 Data.DeliverySettings.ConfigurationVersion 原值传入；示例 1 仅展示格式，不能作为固定版本使用。修改总开关、账号选择、自动纳入设置或指定成员投递时必传。版本缺失或已变化时返回 OperationDenied.CentralizedDeliveryConfigChanged，应重新查询后再提交。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigurationVersion")
    public Long configurationVersion;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.
     * This parameter is required. If this parameter is not specified, the API returns a 400 error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The log code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aegis-log-login</p>
     */
    @NameInMap("LogCode")
    public String logCode;

    /**
     * <p>The log delivery status. Valid values:</p>
     * <ul>
     * <li>enable: Enables log delivery.</li>
     * <li>disable: Disables log delivery.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("LogDeliveryStatus")
    public String logDeliveryStatus;

    /**
     * <p>The region where the threat analysis data management center resides. Specify the management center based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>该日志类型的完整账号选择列表，元素为十进制 UID 字符串，必须包含 Data.DeliverySettings.DaAccountId（本账号），最多 10000 项。新增成员须在 GetDataStorage 的 Accounts 列表中且 Authorized=true。仅保留本账号时传本账号 UID，不能用空字符串或空数组代替。省略本字段保持原选择。HTTP 请求使用 array(simple) 的逗号分隔格式：SelectedAccountIds=1234567890123456,1234567890123457；单账号只传一个 UID。不使用 SelectedAccountIds.1/.2 或 JSON 数组字符串。需同时传 ConfigurationVersion、TargetProject，并省略 LogDeliveryStatus 和成员 SubUserId。</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456,1234567890123457</p>
     */
    @NameInMap("SelectedAccountIds")
    public String selectedAccountIdsShrink;

    /**
     * <p>日志来源云账号 UID，使用十进制整数。省略或等于本账号 UID 时操作本账号投递；传成员 UID 时仅对该成员应用当前配置期望的投递状态，需同时传 LogDeliveryStatus、ConfigurationVersion、TargetProject。成员必须已在该类型选择范围中或已有投递记录。保存账号选择或自动纳入设置时应省略本字段，不可传其他成员 UID。</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123457</p>
     */
    @NameInMap("SubUserId")
    public Long subUserId;

    /**
     * <p>当前日志投递目标 SLS Project 的名称。先调用 GetDataStorage，取 Data.DeliverySettings.TargetProject 原值传入；用于校验本次修改的目标，不用于指定新的 Project。修改总开关、账号选择、自动纳入设置或指定成员投递时必传；缺失或与当前目标不同会返回 OperationDenied.CentralizedDeliveryConfigChanged。示例中的账号 UID 和地域需替换为查询结果。</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-cloudsiem-data-1234567890123456-cn-shanghai</p>
     */
    @NameInMap("TargetProject")
    public String targetProject;

    public static UpdateDataStorageDeliveryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStorageDeliveryShrinkRequest self = new UpdateDataStorageDeliveryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataStorageDeliveryShrinkRequest setAutoIncludeNewAccounts(Boolean autoIncludeNewAccounts) {
        this.autoIncludeNewAccounts = autoIncludeNewAccounts;
        return this;
    }
    public Boolean getAutoIncludeNewAccounts() {
        return this.autoIncludeNewAccounts;
    }

    public UpdateDataStorageDeliveryShrinkRequest setConfigurationVersion(Long configurationVersion) {
        this.configurationVersion = configurationVersion;
        return this;
    }
    public Long getConfigurationVersion() {
        return this.configurationVersion;
    }

    public UpdateDataStorageDeliveryShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataStorageDeliveryShrinkRequest setLogCode(String logCode) {
        this.logCode = logCode;
        return this;
    }
    public String getLogCode() {
        return this.logCode;
    }

    public UpdateDataStorageDeliveryShrinkRequest setLogDeliveryStatus(String logDeliveryStatus) {
        this.logDeliveryStatus = logDeliveryStatus;
        return this;
    }
    public String getLogDeliveryStatus() {
        return this.logDeliveryStatus;
    }

    public UpdateDataStorageDeliveryShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataStorageDeliveryShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public UpdateDataStorageDeliveryShrinkRequest setSelectedAccountIdsShrink(String selectedAccountIdsShrink) {
        this.selectedAccountIdsShrink = selectedAccountIdsShrink;
        return this;
    }
    public String getSelectedAccountIdsShrink() {
        return this.selectedAccountIdsShrink;
    }

    public UpdateDataStorageDeliveryShrinkRequest setSubUserId(Long subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public Long getSubUserId() {
        return this.subUserId;
    }

    public UpdateDataStorageDeliveryShrinkRequest setTargetProject(String targetProject) {
        this.targetProject = targetProject;
        return this;
    }
    public String getTargetProject() {
        return this.targetProject;
    }

}
