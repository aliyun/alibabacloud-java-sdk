// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCdsFileShareLinksRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-532033****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The users that create the file sharing links.</p>
     */
    @NameInMap("Creators")
    public java.util.List<String> creators;

    /**
     * <p>The maximum number of resources to return. Valid values: 1 to 100. Default value: 100. The number of returned resources must be less than or equal to the specified number.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies the marker after which the returned list begins. If this parameter is not specified, all results are returned. Default value: null.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the file sharing link.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1Fs****</p>
     */
    @NameInMap("ShareId")
    public String shareId;

    /**
     * <p>The sharing name for fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("ShareName")
    public String shareName;

    /**
     * <p>The file sharing status. Valid values: ● disabled: canceled ● enabled: valid</p>
     * 
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeCdsFileShareLinksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdsFileShareLinksRequest self = new DescribeCdsFileShareLinksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdsFileShareLinksRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public DescribeCdsFileShareLinksRequest setCreators(java.util.List<String> creators) {
        this.creators = creators;
        return this;
    }
    public java.util.List<String> getCreators() {
        return this.creators;
    }

    public DescribeCdsFileShareLinksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCdsFileShareLinksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCdsFileShareLinksRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public DescribeCdsFileShareLinksRequest setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public DescribeCdsFileShareLinksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
