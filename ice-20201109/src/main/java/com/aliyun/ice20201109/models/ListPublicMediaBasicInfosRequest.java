// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPublicMediaBasicInfosRequest extends TeaModel {
    /**
     * <p>The business type of the media asset. Valid values:</p>
     * <ul>
     * <li>sticker</li>
     * <li>bgm</li>
     * <li>bgi</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sticker</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>Specifies whether to return the basic information of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeFileBasicInfo")
    public Boolean includeFileBasicInfo;

    /**
     * <p>The maximum number of entries to return.</p>
     * <p>Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The media tag. All media assets that contain the specified media tag are returned. Valid values:</p>
     * <ul>
     * <li><p>Sticker tags:</p>
     * <ul>
     * <li>sticker-atmosphere</li>
     * <li>sticker-bubble</li>
     * <li>sticker-cute</li>
     * <li>sticker-daily</li>
     * <li>sticker-expression</li>
     * <li>sticker-gif</li>
     * </ul>
     * </li>
     * <li><p>Background music (BGM) tags:</p>
     * <ul>
     * <li>bgm-romantic</li>
     * <li>bgm-cuisine</li>
     * <li>bgm-chinese-style</li>
     * <li>bgm-upbeat</li>
     * <li>bgm-dynamic</li>
     * <li>bgm-relaxing</li>
     * <li>bgm-quirky</li>
     * <li>bgm-beauty</li>
     * </ul>
     * </li>
     * <li><p>Background image (BGI) tags:</p>
     * <ul>
     * <li>bgi-grad</li>
     * <li>bgi-solid</li>
     * <li>bgi-pic</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ticker-atmosphere</p>
     */
    @NameInMap("MediaTagId")
    public String mediaTagId;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>pSa1SQ0wCe5pzVrQ6mWZEw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
