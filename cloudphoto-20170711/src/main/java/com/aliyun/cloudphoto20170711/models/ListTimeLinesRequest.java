// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListTimeLinesRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("PhotoSize")
    public Integer photoSize;

    @NameInMap("Cursor")
    public Long cursor;

    @NameInMap("TimeLineCount")
    public Integer timeLineCount;

    @NameInMap("TimeLineUnit")
    public String timeLineUnit;

    @NameInMap("FilterBy")
    public String filterBy;

    @NameInMap("Order")
    public String order;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static ListTimeLinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTimeLinesRequest self = new ListTimeLinesRequest();
        return TeaModel.build(map, self);
    }

    public ListTimeLinesRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListTimeLinesRequest setPhotoSize(Integer photoSize) {
        this.photoSize = photoSize;
        return this;
    }
    public Integer getPhotoSize() {
        return this.photoSize;
    }

    public ListTimeLinesRequest setCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    public Long getCursor() {
        return this.cursor;
    }

    public ListTimeLinesRequest setTimeLineCount(Integer timeLineCount) {
        this.timeLineCount = timeLineCount;
        return this;
    }
    public Integer getTimeLineCount() {
        return this.timeLineCount;
    }

    public ListTimeLinesRequest setTimeLineUnit(String timeLineUnit) {
        this.timeLineUnit = timeLineUnit;
        return this;
    }
    public String getTimeLineUnit() {
        return this.timeLineUnit;
    }

    public ListTimeLinesRequest setFilterBy(String filterBy) {
        this.filterBy = filterBy;
        return this;
    }
    public String getFilterBy() {
        return this.filterBy;
    }

    public ListTimeLinesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTimeLinesRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public ListTimeLinesRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
