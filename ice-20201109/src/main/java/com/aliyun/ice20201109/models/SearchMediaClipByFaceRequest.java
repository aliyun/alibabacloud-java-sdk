// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaClipByFaceRequest extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("FaceSearchToken")
    public String faceSearchToken;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

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

}
