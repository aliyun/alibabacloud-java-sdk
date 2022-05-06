// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListUserGroupsMappingsRequest extends TeaModel {
    @NameInMap("FilesystemId")
    public String filesystemId;

    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("Limit")
    public Integer limit;

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
