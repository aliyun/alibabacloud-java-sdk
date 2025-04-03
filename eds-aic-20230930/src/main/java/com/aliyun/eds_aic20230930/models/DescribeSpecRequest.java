// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeSpecRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The matrix specification.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cpm.gn6.gx1</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cpm.gn6.gx1</p>
     */
    @NameInMap("MatrixSpec")
    public String matrixSpec;

    /**
     * <p>The maximum number of items to return per page in a paginated query. The value range is 1 to 100, with a default value of 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Indicates the starting position for reading. If left empty, it starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The purchase mode of cloud mobile phones.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Instance (default): the instance group mode.</li>
     * <li>Node: the matrix mode [whitelisted].</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("SaleMode")
    public String saleMode;

    /**
     * <p>List of specification IDs.</p>
     */
    @NameInMap("SpecIds")
    public java.util.List<String> specIds;

    /**
     * <p>Specification status.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("SpecStatus")
    public String specStatus;

    /**
     * <p>Specification type.</p>
     * 
     * <strong>example:</strong>
     * <p>ARM</p>
     */
    @NameInMap("SpecType")
    public String specType;

    public static DescribeSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpecRequest self = new DescribeSpecRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSpecRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public DescribeSpecRequest setMatrixSpec(String matrixSpec) {
        this.matrixSpec = matrixSpec;
        return this;
    }
    public String getMatrixSpec() {
        return this.matrixSpec;
    }

    public DescribeSpecRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSpecRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSpecRequest setSaleMode(String saleMode) {
        this.saleMode = saleMode;
        return this;
    }
    public String getSaleMode() {
        return this.saleMode;
    }

    public DescribeSpecRequest setSpecIds(java.util.List<String> specIds) {
        this.specIds = specIds;
        return this;
    }
    public java.util.List<String> getSpecIds() {
        return this.specIds;
    }

    public DescribeSpecRequest setSpecStatus(String specStatus) {
        this.specStatus = specStatus;
        return this;
    }
    public String getSpecStatus() {
        return this.specStatus;
    }

    public DescribeSpecRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

}
