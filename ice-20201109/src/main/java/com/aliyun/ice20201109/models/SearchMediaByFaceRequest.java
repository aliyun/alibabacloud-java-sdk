// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByFaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2d3bf1e35a1e42b5ab338d701efa****</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zxtest-huangxuan-2023-3-7-V1</p>
     */
    @NameInMap("FaceSearchToken")
    public String faceSearchToken;

    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>https://<strong><strong>.oss-cn-shanghai.aliyuncs.com/input/huangxuan</strong></strong>.jpg</p>
     */
    @NameInMap("PersonImageUrl")
    public String personImageUrl;

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
