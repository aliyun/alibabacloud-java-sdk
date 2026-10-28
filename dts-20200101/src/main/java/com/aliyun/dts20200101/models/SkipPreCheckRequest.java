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
     * <p>The region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to skip the precheck item. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Skips the precheck item.</li>
     * <li><strong>false</strong>: Does not skip the precheck item.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Skip")
    public Boolean skip;

    /**
     * <p>The abbreviations of the precheck items to skip or unskip. Valid values:</p>
     * <ul>
     * <li><strong>[&quot;CHECK_SAME_OBJ&quot;]</strong>: Checks for the existence of objects with the same name.</li>
     * <li><strong>[&quot;CHECK_SAME_USER&quot;]</strong>: Checks for the existence of accounts with different names.</li>
     * <li><strong>[&quot;CHECK_SRC&quot;]</strong>: Checks the version of the source database.</li>
     * <li><strong>[&quot;CHECK_TOPOLOGY&quot;]</strong>: Checks the topology version. For more information about the topology versions supported by DTS, see <a href="https://help.aliyun.com/document_detail/124115.html">Topology overview</a>.</li>
     * <li><strong>[&quot;CHECK_SERVER_ID&quot;]</strong>: Checks the server_id of the source database.</li>
     * <li><strong>[&quot;CHECK_DEST_TABLE_EMPTY&quot;]</strong>: Checks for the existence of objects in the destination database.</li>
     * <li><strong>[&quot;CHECK_SUPER_AUTH_DEST&quot;]</strong>: Checks the permissions of the super account in the destination database.</li>
     * </ul>
     * <blockquote>
     * <p>Separate multiple item names with commas (,), for example, <strong>[&quot;CHECK_SRC&quot;,&quot;CHECK_SAME_OBJ&quot;]</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;CHECK_SAME_OBJ&quot;]</p>
     */
    @NameInMap("SkipPreCheckItems")
    public String skipPreCheckItems;

    /**
     * <p>The names of the precheck items to skip or unskip. This parameter corresponds to the <strong>SkipPreCheckItems</strong> parameter. Valid values:</p>
     * <ul>
     * <li><strong>[&quot;CHECK_SAME_OBJ_DETAIL&quot;]</strong>: Checks for the existence of objects with the same name.</li>
     * <li><strong>[&quot;CHECK_SAME_USER_DETAIL&quot;]</strong>: Checks for the existence of accounts with different names.</li>
     * <li><strong>[&quot;CHECK_SRC_DETAIL&quot;]</strong>: Checks the version of the source database.</li>
     * <li><strong>[&quot;CHECK_TOPOLOGY_DETAIL&quot;]</strong>: Checks the topology version. For more information about the topology versions supported by DTS, see <a href="https://help.aliyun.com/document_detail/124115.html">Topology overview</a>.</li>
     * <li><strong>[&quot;CHECK_SERVER_ID_DETAIL&quot;]</strong>: Checks the server_id of the source database.</li>
     * <li><strong>[&quot;CHECK_DEST_TABLE_EMPTY_DETAIL&quot;]</strong>: Checks whether the tables in the destination database are empty.</li>
     * <li><strong>[&quot;CHECK_SUPER_AUTH_DEST_DETAIL&quot;]</strong>: Checks the permissions of the super account in the destination database.</li>
     * </ul>
     * <blockquote>
     * <p>Separate multiple item names with commas (,), for example, <strong>[&quot;CHECK_SRC_DETAIL&quot;,&quot;CHECK_SAME_OBJ_DETAIL&quot;]</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;CHECK_SAME_OBJ_DETAIL&quot;]</p>
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
