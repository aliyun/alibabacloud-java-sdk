// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPublicMediaBasicInfosRequest extends TeaModel {
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("IncludeFileBasicInfo")
    public Boolean includeFileBasicInfo;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("MediaTagId")
    public String mediaTagId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListPublicMediaBasicInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublicMediaBasicInfosRequest self = new ListPublicMediaBasicInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListPublicMediaBasicInfosRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ListPublicMediaBasicInfosRequest setIncludeFileBasicInfo(Boolean includeFileBasicInfo) {
        this.includeFileBasicInfo = includeFileBasicInfo;
        return this;
    }
    public Boolean getIncludeFileBasicInfo() {
        return this.includeFileBasicInfo;
    }

    public ListPublicMediaBasicInfosRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
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

    public ListPublicMediaBasicInfosRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListPublicMediaBasicInfosRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
