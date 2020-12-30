// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListFacePhotosRequest extends TeaModel {
    @NameInMap("FaceId")
    public Long faceId;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Cursor")
    public String cursor;

    @NameInMap("State")
    public String state;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static ListFacePhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFacePhotosRequest self = new ListFacePhotosRequest();
        return TeaModel.build(map, self);
    }

    public ListFacePhotosRequest setFaceId(Long faceId) {
        this.faceId = faceId;
        return this;
    }
    public Long getFaceId() {
        return this.faceId;
    }

    public ListFacePhotosRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListFacePhotosRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListFacePhotosRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public ListFacePhotosRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListFacePhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public ListFacePhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
