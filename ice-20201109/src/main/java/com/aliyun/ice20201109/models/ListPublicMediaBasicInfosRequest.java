// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPublicMediaBasicInfosRequest extends TeaModel {
    /**
     * <p>The business type of the media asset. Valid values:</p>
     * <ul>
     * <li><p>sticker: sticker</p>
     * </li>
     * <li><p>bgm: background music</p>
     * </li>
     * <li><p>bgi: background image</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sticker</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>Specifies whether to include basic file information in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeFileBasicInfo")
    public Boolean includeFileBasicInfo;

    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * <p>Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The media asset tag. The system matches media assets based on this mediaTagId and returns all media assets that contain this tag. Valid values:</p>
     * <ul>
     * <li>sticker: stickers<ul>
     * <li>sticker-atmosphere: atmosphere</li>
     * <li>sticker-bubble: bubble</li>
     * <li>sticker-cute: cute</li>
     * <li>sticker-daily: daily</li>
     * <li>sticker-expression: expression</li>
     * <li>sticker-gif: GIF</li>
     * </ul>
     * </li>
     * <li>bgm: background music<ul>
     * <li>bgm-romantic: romantic</li>
     * <li>bgm-cuisine: cuisine</li>
     * <li>bgm-chinese-style: Chinese style</li>
     * <li>bgm-upbeat: upbeat</li>
     * <li>bgm-dynamic: dynamic</li>
     * <li>bgm-relaxing: relaxing</li>
     * <li>bgm-quirky: quirky</li>
     * <li>bgm-beauty: fashion and beauty</li>
     * </ul>
     * </li>
     * <li>bgi: background images<ul>
     * <li>bgi-grad: gradient background</li>
     * <li>bgi-solid: solid color background</li>
     * <li>bgi-pic: image background</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sticker-atmosphere</p>
     */
    @NameInMap("MediaTagId")
    public String mediaTagId;

    /**
     * <p>The token that indicates the position from which the next query starts. An empty value indicates that all data has been read.</p>
     * 
     * <strong>example:</strong>
     * <p>pSa1SQ0wCe5pzVrQ6mWZEw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
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
