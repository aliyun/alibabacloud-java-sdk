// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDocParserJobStatusRequest extends TeaModel {
    /**
     * <p>The task ID (DtsJobId) returned when the document parsing task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>dts-20250729-l3m1213ye7l****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

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

    public static DescribeDocParserJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocParserJobStatusRequest self = new DescribeDocParserJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDocParserJobStatusRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDocParserJobStatusRequest setRagInstanceId(String ragInstanceId) {
        this.ragInstanceId = ragInstanceId;
        return this;
    }
    public String getRagInstanceId() {
        return this.ragInstanceId;
    }

    public DescribeDocParserJobStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDocParserJobStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
