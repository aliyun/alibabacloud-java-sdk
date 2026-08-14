// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDocParserJobResultRequest extends TeaModel {
    /**
     * <p>The task ID (DtsJobId) returned when the document parsing task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>dts-20250729-y0zz3t13h7d****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The instance ID of the DTS RagFlow instance.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsgbe12he619iy801</p>
     */
    @NameInMap("RagInstanceId")
    public String ragInstanceId;

    /**
     * <p>The region ID of the task. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDocParserJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocParserJobResultRequest self = new DescribeDocParserJobResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDocParserJobResultRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDocParserJobResultRequest setRagInstanceId(String ragInstanceId) {
        this.ragInstanceId = ragInstanceId;
        return this;
    }
    public String getRagInstanceId() {
        return this.ragInstanceId;
    }

    public DescribeDocParserJobResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDocParserJobResultRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
