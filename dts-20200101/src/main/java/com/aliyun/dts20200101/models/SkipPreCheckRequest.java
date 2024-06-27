// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SkipPreCheckRequest extends TeaModel {
    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c7412z57g8k****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the precheck task. You can call the <strong>DescribePreCheckStatus</strong> operation to query the task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b4my3zg929a****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The region ID of the DTS instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to skip the precheck item. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: skips the precheck item.</li>
     * <li><strong>false</strong>: does not skip the precheck item.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Skip")
    public Boolean skip;

    /**
     * <p>The shortened name of the precheck item. Valid values:</p>
     * <ul>
     * <li><p><strong>CHECK_SAME_OBJ</strong>: object name conflict</p>
     * </li>
     * <li><p><strong>CHECK_SAME_USER</strong>: multiple usernames for one instance</p>
     * </li>
     * <li><p><strong>CHECK_SRC</strong>: source database version</p>
     * </li>
     * <li><p><strong>CHECK_TOPOLOGY</strong>: topology type</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about the topologies supported by DTS, see <a href="https://help.aliyun.com/document_detail/124115.html">Synchronization topologies</a>.</p>
     * </blockquote>
     * <ul>
     * <li><strong>CHECK_SERVER_ID</strong>: the server ID of the source database</li>
     * </ul>
     * <blockquote>
     * <p> Separate multiple shortened names with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CHECK_SAME_OBJ</p>
     */
    @NameInMap("SkipPreCheckItems")
    public String skipPreCheckItems;

    /**
     * <p>The name of the precheck item. This parameter corresponds to the <strong>SkipPreCheckItems</strong> parameter. Valid values:</p>
     * <ul>
     * <li><p><strong>CHECK_SAME_OBJ_DETAIL</strong>: object name conflict</p>
     * </li>
     * <li><p><strong>CHECK_SAME_USER_DETAIL</strong>: multiple usernames for one instance</p>
     * </li>
     * <li><p><strong>CHECK_SRC_DETAIL</strong>: source database version</p>
     * </li>
     * <li><p><strong>CHECK_TOPOLOGY_DETAIL</strong>: topology type</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about the topologies supported by DTS, see <a href="https://help.aliyun.com/document_detail/124115.html">Synchronization topologies</a>.</p>
     * </blockquote>
     * <ul>
     * <li><strong>CHECK_SERVER_ID_DETAIL</strong>: the server ID of the source database</li>
     * </ul>
     * <blockquote>
     * <p> Separate multiple item names with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CHECK_SAME_OBJ_DETAIL</p>
     */
    @NameInMap("SkipPreCheckNames")
    public String skipPreCheckNames;

    public static SkipPreCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipPreCheckRequest self = new SkipPreCheckRequest();
        return TeaModel.build(map, self);
    }

    public SkipPreCheckRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public SkipPreCheckRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SkipPreCheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SkipPreCheckRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SkipPreCheckRequest setSkip(Boolean skip) {
        this.skip = skip;
        return this;
    }
    public Boolean getSkip() {
        return this.skip;
    }

    public SkipPreCheckRequest setSkipPreCheckItems(String skipPreCheckItems) {
        this.skipPreCheckItems = skipPreCheckItems;
        return this;
    }
    public String getSkipPreCheckItems() {
        return this.skipPreCheckItems;
    }

    public SkipPreCheckRequest setSkipPreCheckNames(String skipPreCheckNames) {
        this.skipPreCheckNames = skipPreCheckNames;
        return this;
    }
    public String getSkipPreCheckNames() {
        return this.skipPreCheckNames;
    }

}
