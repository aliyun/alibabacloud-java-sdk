// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPublicMediaBasicInfosRequest extends TeaModel {
    // 标签
    @NameInMap("MediaTagId")
    public String mediaTagId;

    // 下一次读取的位置
    @NameInMap("NextToken")
    public String nextToken;

    // 分页大小
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 返回值中是否包含文件基础信息
    @NameInMap("IncludeFileBasicInfo")
    public Boolean includeFileBasicInfo;

    public static ListPublicMediaBasicInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublicMediaBasicInfosRequest self = new ListPublicMediaBasicInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListPublicMediaBasicInfosRequest setMediaTagId(String mediaTagId) {
        this.mediaTagId = mediaTagId;
        return this;
    }
    public String getMediaTagId() {
        return this.mediaTagId;
    }

    public ListPublicMediaBasicInfosRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicMediaBasicInfosRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicMediaBasicInfosRequest setIncludeFileBasicInfo(Boolean includeFileBasicInfo) {
        this.includeFileBasicInfo = includeFileBasicInfo;
        return this;
    }
    public Boolean getIncludeFileBasicInfo() {
        return this.includeFileBasicInfo;
    }

}
