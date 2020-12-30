// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ListFacePersonsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("FaceGroupId")
    public Long faceGroupId;

    @NameInMap("FacePersonName")
    public String facePersonName;

    public static ListFacePersonsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFacePersonsRequest self = new ListFacePersonsRequest();
        return TeaModel.build(map, self);
    }

    public ListFacePersonsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFacePersonsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFacePersonsRequest setFaceGroupId(Long faceGroupId) {
        this.faceGroupId = faceGroupId;
        return this;
    }
    public Long getFaceGroupId() {
        return this.faceGroupId;
    }

    public ListFacePersonsRequest setFacePersonName(String facePersonName) {
        this.facePersonName = facePersonName;
        return this;
    }
    public String getFacePersonName() {
        return this.facePersonName;
    }

}
