// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDynamicConfigRequest extends TeaModel {
    /**
     * <p>The specific throttling configuration.</p>
     * <ul>
     * <li><strong>dts.datamove.blaster.qps.max</strong>: The rate at which queries are made to the source database per second.</li>
     * <li><strong>dts.datamove.source.rps.max</strong>: The number of rows that are fully synchronized or migrated per second.</li>
     * <li><strong>dts.datamove.source.bps.max</strong>: the amount of data processed per second for full synchronization or migration. Unit: MB.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you set the <strong>JobCode</strong> parameter to <strong>03</strong>, you need to specify <strong>true</strong> for the <strong>EnableLimit</strong> parameter. Otherwise, the configuration cannot take effect.</p>
     * </li>
     * <li><p>If you set the <strong>JobCode</strong> parameter to <strong>04</strong> or <strong>07</strong>, you only need to specify the <strong>dts.datamove.source.rps.max</strong> and <strong>dts.datamove.source.bps.max</strong> parameters.</p>
     * </li>
     * <li><p>A value of \<em>\</em>-1\<em>\</em> indicates no rate limit.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;dts.datamove.source.rps.max\&quot;:5000,\&quot;dts.datamove.source.bps.max\&quot;:10485760}</p>
     */
    @NameInMap("ConfigList")
    public String configList;

    /**
     * <p>The ID of the data migration or synchronization task.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta7w132u12h****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>Specifies whether to enable throttling for data synchronization or migration. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
     * <blockquote>
     * <p> Only needs to be configured when the <strong>JobCode</strong> parameter is set to <strong>03</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLimit")
    public Boolean enableLimit;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>03</strong>: a full data synchronization or full data migration task.</li>
     * <li><strong>04</strong>: an incremental data migration task.</li>
     * <li><strong>07</strong>: an incremental data synchronization task.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>07</p>
     */
    @NameInMap("JobCode")
    public String jobCode;

    /**
     * <p>The region ID of the DTS instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz6zsi7ce5rpy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyDynamicConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDynamicConfigRequest self = new ModifyDynamicConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDynamicConfigRequest setConfigList(String configList) {
        this.configList = configList;
        return this;
    }
    public String getConfigList() {
        return this.configList;
    }

    public ModifyDynamicConfigRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyDynamicConfigRequest setEnableLimit(Boolean enableLimit) {
        this.enableLimit = enableLimit;
        return this;
    }
    public Boolean getEnableLimit() {
        return this.enableLimit;
    }

    public ModifyDynamicConfigRequest setJobCode(String jobCode) {
        this.jobCode = jobCode;
        return this;
    }
    public String getJobCode() {
        return this.jobCode;
    }

    public ModifyDynamicConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDynamicConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
