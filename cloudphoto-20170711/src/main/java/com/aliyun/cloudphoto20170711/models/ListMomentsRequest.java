// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListMomentsRequest extends TeaModel {
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

    public static ListMomentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMomentsRequest self = new ListMomentsRequest();
        return TeaModel.build(map, self);
    }

    public ListMomentsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListMomentsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListMomentsRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public ListMomentsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListMomentsRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public ListMomentsRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
