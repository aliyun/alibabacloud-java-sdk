// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeSpecRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("SpecIds")
    public java.util.List<String> specIds;

    /**
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("SpecStatus")
    public String specStatus;

    /**
     * <strong>example:</strong>
     * <p>ARM</p>
     */
    @NameInMap("SpecType")
    public String specType;

    public static DescribeSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpecRequest self = new DescribeSpecRequest();
        return TeaModel.build(map, self);
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
