// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListUserGroupsMappingsRequest extends TeaModel {
    /**
     * <p>The instance ID of the Apsara File Storage for HDFS file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("FilesystemId")
    public String filesystemId;

    /**
     * <p>The region where the file system resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <p>The number of users to return per query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The starting point for the next page in a paged query. Set this parameter to an empty string for the first query. If paged queries are required, the response to each request includes the NextToken value for the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListUserGroupsMappingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsMappingsRequest self = new ListUserGroupsMappingsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsMappingsRequest setFilesystemId(String filesystemId) {
        this.filesystemId = filesystemId;
        return this;
    }
    public String getFilesystemId() {
        return this.filesystemId;
    }

    public ListUserGroupsMappingsRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public ListUserGroupsMappingsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListUserGroupsMappingsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
