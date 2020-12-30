// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListMomentPhotosRequest extends TeaModel {
    @NameInMap("MomentId")
    public Long momentId;

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

    public static ListMomentPhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMomentPhotosRequest self = new ListMomentPhotosRequest();
        return TeaModel.build(map, self);
    }

    public ListMomentPhotosRequest setMomentId(Long momentId) {
        this.momentId = momentId;
        return this;
    }
    public Long getMomentId() {
        return this.momentId;
    }

    public ListMomentPhotosRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListMomentPhotosRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListMomentPhotosRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public ListMomentPhotosRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListMomentPhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public ListMomentPhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
