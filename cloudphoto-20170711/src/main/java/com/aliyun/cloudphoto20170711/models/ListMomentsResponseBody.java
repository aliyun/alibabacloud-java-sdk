// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListMomentsResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextCursor")
    public String nextCursor;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Moments")
    public java.util.List<ListMomentsResponseBodyMoments> moments;

    @NameInMap("Code")
    public String code;

    public static ListMomentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMomentsResponseBody self = new ListMomentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMomentsResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListMomentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListMomentsResponseBody setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public ListMomentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMomentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMomentsResponseBody setMoments(java.util.List<ListMomentsResponseBodyMoments> moments) {
        this.moments = moments;
        return this;
    }
    public java.util.List<ListMomentsResponseBodyMoments> getMoments() {
        return this.moments;
    }

    public ListMomentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListMomentsResponseBodyMoments extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("PhotosCount")
        public Integer photosCount;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("Ctime")
        public Long ctime;

        @NameInMap("TakenAt")
        public Long takenAt;

        @NameInMap("State")
        public String state;

        @NameInMap("LocationName")
        public String locationName;

        @NameInMap("Id")
        public Long id;

        public static ListMomentsResponseBodyMoments build(java.util.Map<String, ?> map) throws Exception {
            ListMomentsResponseBodyMoments self = new ListMomentsResponseBodyMoments();
            return TeaModel.build(map, self);
        }

        public ListMomentsResponseBodyMoments setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ListMomentsResponseBodyMoments setPhotosCount(Integer photosCount) {
            this.photosCount = photosCount;
            return this;
        }
        public Integer getPhotosCount() {
            return this.photosCount;
        }

        public ListMomentsResponseBodyMoments setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListMomentsResponseBodyMoments setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public ListMomentsResponseBodyMoments setTakenAt(Long takenAt) {
            this.takenAt = takenAt;
            return this;
        }
        public Long getTakenAt() {
            return this.takenAt;
        }

        public ListMomentsResponseBodyMoments setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMomentsResponseBodyMoments setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

        public ListMomentsResponseBodyMoments setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
