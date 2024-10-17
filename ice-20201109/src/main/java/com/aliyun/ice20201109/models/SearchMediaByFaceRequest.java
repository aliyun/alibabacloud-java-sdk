// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByFaceRequest extends TeaModel {
    /**
     * <p>The ID of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>2d3bf1e35a1e42b5ab338d701efa****</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The token that is used to identify the query. You can use this parameter in the SearchMediaClipByFace operation to specify the same query conditions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zxtest-huangxuan-2023-3-7-V1</p>
     */
    @NameInMap("FaceSearchToken")
    public String faceSearchToken;

    /**
     * <p>The type of the media asset. Valid values:</p>
     * <ul>
     * <li>image</li>
     * <li>video</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The URL of the face image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>https://<strong><strong>.oss-cn-shanghai.aliyuncs.com/input/huangxuan</strong></strong>.jpg</p>
     */
    @NameInMap("PersonImageUrl")
    public String personImageUrl;

    /**
     * <p>The name of the search library.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    public static SearchMediaByFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByFaceRequest self = new SearchMediaByFaceRequest();
        return TeaModel.build(map, self);
    }

    public SearchMediaByFaceRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public SearchMediaByFaceRequest setFaceSearchToken(String faceSearchToken) {
        this.faceSearchToken = faceSearchToken;
        return this;
    }
    public String getFaceSearchToken() {
        return this.faceSearchToken;
    }

    public SearchMediaByFaceRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public SearchMediaByFaceRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchMediaByFaceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchMediaByFaceRequest setPersonImageUrl(String personImageUrl) {
        this.personImageUrl = personImageUrl;
        return this;
    }
    public String getPersonImageUrl() {
        return this.personImageUrl;
    }

    public SearchMediaByFaceRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
