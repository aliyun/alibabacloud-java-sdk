// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaClipByFaceRequest extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FaceSearchToken")
    public String faceSearchToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

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
