// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ListFaceImagesRequest extends TeaModel {
    @NameInMap("FaceGroupId")
    public Long faceGroupId;

    @NameInMap("FacePersonId")
    public Long facePersonId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListFaceImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFaceImagesRequest self = new ListFaceImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListFaceImagesRequest setFaceGroupId(Long faceGroupId) {
        this.faceGroupId = faceGroupId;
        return this;
    }
    public Long getFaceGroupId() {
        return this.faceGroupId;
    }

    public ListFaceImagesRequest setFacePersonId(Long facePersonId) {
        this.facePersonId = facePersonId;
        return this;
    }
    public Long getFacePersonId() {
        return this.facePersonId;
    }

    public ListFaceImagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFaceImagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
