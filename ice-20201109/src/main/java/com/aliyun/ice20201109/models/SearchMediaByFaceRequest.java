// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByFaceRequest extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("FaceSearchToken")
    public String faceSearchToken;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PersonImageUrl")
    public String personImageUrl;

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

}
