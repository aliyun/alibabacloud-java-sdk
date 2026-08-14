// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDynamicConfigRequest extends TeaModel {
    /**
     * <p>The rate limit configurations.</p>
     * <ul>
     * <li><strong>dts.datamove.blaster.qps.max</strong>: the queries per second (QPS) for querying the source database.</li>
     * <li><strong>dts.datamove.source.rps.max</strong>: the records per second (RPS) for full data synchronization or migration.</li>
     * <li><strong>dts.datamove.source.bps.max</strong>: the data volume per second for full data synchronization or migration. Unit: bytes per second.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If <strong>JobCode</strong> is set to <strong>03</strong>, you must set <strong>EnableLimit</strong> to <strong>true</strong> for the three parameters to take effect.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If <strong>JobCode</strong> is set to <strong>04</strong> or <strong>07</strong>, you only need to configure <strong>dts.datamove.source.rps.max</strong> and <strong>dts.datamove.source.bps.max</strong>.</li>
     * <li>A value of <strong>-1</strong> indicates that no rate limit is applied.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;dts.datamove.source.rps.max&quot;: 5000,
     *       &quot;dts.datamove.source.bps.max&quot;: 10485760
     * }</p>
     */
    @NameInMap("ConfigList")
    public String configList;

    /**
     * <p>The ID of the data synchronization or migration task.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to obtain the task ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta7w132u12h****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>Specifies whether to limit the migration rate of the full data synchronization or migration task. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
     * <blockquote>
     * <p>This parameter is required only when <strong>JobCode</strong> is set to <strong>03</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLimit")
    public Boolean enableLimit;

    /**
     * <p>The task code. Valid values:</p>
     * <ul>
     * <li><strong>03</strong>: full data synchronization or migration task.</li>
     * <li><strong>04</strong>: incremental data migration task.</li>
     * <li><strong>07</strong>: incremental data synchronization task.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>07</p>
     */
    @NameInMap("JobCode")
    public String jobCode;

    /**
     * <p>The ID of the region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
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
