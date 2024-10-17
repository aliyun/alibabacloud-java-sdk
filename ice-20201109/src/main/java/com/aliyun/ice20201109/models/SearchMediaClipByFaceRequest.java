// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaClipByFaceRequest extends TeaModel {
    /**
     * <p>The ID of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>2d3bf1e35a1e42b5ab338d701efa****</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The value of this parameter is the same as that of the FaceSearchToken parameter in the SearchMediaByFace request. This specifies to return media asset clips that meet the same query conditions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zxtest-huangxuan-2023-3-7-V1</p>
     */
    @NameInMap("FaceSearchToken")
    public String faceSearchToken;

    /**
     * <p>The ID of the media asset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3b187b3620c8490886cfc2a9578c****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

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
     * <p>The name of the search library.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    public static SearchMediaClipByFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaClipByFaceRequest self = new SearchMediaClipByFaceRequest();
        return TeaModel.build(map, self);
    }

    public SearchMediaClipByFaceRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public SearchMediaClipByFaceRequest setFaceSearchToken(String faceSearchToken) {
        this.faceSearchToken = faceSearchToken;
        return this;
    }
    public String getFaceSearchToken() {
        return this.faceSearchToken;
    }

    public SearchMediaClipByFaceRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SearchMediaClipByFaceRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchMediaClipByFaceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchMediaClipByFaceRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
