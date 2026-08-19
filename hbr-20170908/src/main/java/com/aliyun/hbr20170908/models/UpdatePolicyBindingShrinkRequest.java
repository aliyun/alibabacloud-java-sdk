// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdatePolicyBindingShrinkRequest extends TeaModel {
    /**
     * <p>The advanced options.</p>
     */
    @NameInMap("AdvancedOptions")
    public String advancedOptionsShrink;

    /**
     * <p>The data source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1************dtv</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>Specifies whether the policy is suspended for the data source.</p>
     * <ul>
     * <li>true: Suspended.</li>
     * <li>false: Not suspended.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>, <strong>File</strong>, <strong>NAS</strong>, <strong>COMMON_NAS</strong>, or <strong>COMMON_FILE_SYSTEM</strong>. Specifies the file types to back up. All files of these types are backed up. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>, <strong>File</strong>, <strong>NAS</strong>, <strong>COMMON_NAS</strong>, or <strong>COMMON_FILE_SYSTEM</strong>. Specifies the file types to back up. All files of these types are backed up. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>The description of the policy binding.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000<strong><strong><strong><strong><strong><strong>5xx-i-2ze</strong></strong></strong></strong></strong></strong>nw4</p>
     */
    @NameInMap("PolicyBindingDescription")
    public String policyBindingDescription;

    /**
     * <p>The policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000************ky9</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The meaning varies depending on the SourceType value:</p>
     * <ul>
     * <li><strong>OSS</strong>: The prefix to back up. If not specified, the entire root directory of the bucket is backed up. Only a single prefix is supported. To back up /backup, set this parameter to /backup.</li>
     * <li><strong>ECS_FILE</strong>: The file directories to back up. If not specified, all directories are backed up. Multiple directories are supported. To back up files in /a and /b, set this parameter to [&quot;/a&quot;, &quot;/b&quot;].</li>
     * <li><strong>File</strong>: The file directories to back up. If not specified, all directories are backed up. Multiple directories are supported. To back up files in /a and /b, set this parameter to [&quot;/a&quot;, &quot;/b&quot;].</li>
     * <li><strong>COMMON_FILE_SYSTEM</strong>: Required. The source paths to back up. Multiple paths are supported. To back up /a and /b, set this parameter to [&quot;/a&quot;, &quot;/b&quot;]. To back up the root path, set this parameter to [&quot;/&quot;].</li>
     * <li><strong>COMMON_NAS</strong>: Required. The source path to back up. Only a single path is supported. To back up /a, set this parameter to [&quot;/a&quot;]. To back up the root path, set this parameter to [&quot;/&quot;].</li>
     * <li><strong>OTS</strong>: The list of data tables to back up. If not specified, all data tables are backed up. Multiple data tables are supported. To back up data tables a and b, set this parameter to [&quot;a&quot;, &quot;b&quot;].</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>backup/</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li><strong>UDM_ECS</strong>: ECS instance backup.</li>
     * <li><strong>OSS</strong>: OSS backup.</li>
     * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
     * <li><strong>COMMON_NAS</strong>: On-premises NAS backup.</li>
     * <li><strong>ECS_FILE</strong>: ECS File Backup Essential Edition.</li>
     * <li><strong>File</strong>: On-premises file backup.</li>
     * <li><strong>COMMON_FILE_SYSTEM</strong>: CPFS backup.</li>
     * <li><strong>OTS</strong>: Tablestore backup.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UDM_ECS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong> or <strong>File</strong>. Specifies the backup traffic control. The format is <code>{start}{end}{bandwidth}</code>. Multiple traffic control configurations are separated by delimiters, and the time ranges cannot overlap.</p>
     * <ul>
     * <li><strong>start</strong>: The start hour.</li>
     * <li><strong>end</strong>: The end hour.</li>
     * <li><strong>bandwidth</strong>: The rate limit, in KB/s.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0:24:5120</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

    public static UpdatePolicyBindingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyBindingShrinkRequest self = new UpdatePolicyBindingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyBindingShrinkRequest setAdvancedOptionsShrink(String advancedOptionsShrink) {
        this.advancedOptionsShrink = advancedOptionsShrink;
        return this;
    }
    public String getAdvancedOptionsShrink() {
        return this.advancedOptionsShrink;
    }

    public UpdatePolicyBindingShrinkRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdatePolicyBindingShrinkRequest setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public UpdatePolicyBindingShrinkRequest setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }
    public String getExclude() {
        return this.exclude;
    }

    public UpdatePolicyBindingShrinkRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
    }

    public UpdatePolicyBindingShrinkRequest setPolicyBindingDescription(String policyBindingDescription) {
        this.policyBindingDescription = policyBindingDescription;
        return this;
    }
    public String getPolicyBindingDescription() {
        return this.policyBindingDescription;
    }

    public UpdatePolicyBindingShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdatePolicyBindingShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdatePolicyBindingShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdatePolicyBindingShrinkRequest setSpeedLimit(String speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }
    public String getSpeedLimit() {
        return this.speedLimit;
    }

}
