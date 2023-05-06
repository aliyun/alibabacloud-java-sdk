// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListImageByAppIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListImageByAppIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListImageByAppIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageByAppIdResponseBody self = new ListImageByAppIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageByAppIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListImageByAppIdResponseBody setData(ListImageByAppIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListImageByAppIdResponseBodyData getData() {
        return this.data;
    }

    public ListImageByAppIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListImageByAppIdResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListImageByAppIdResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListImageByAppIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageByAppIdResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListImageByAppIdResponseBodyDataImageDOList extends TeaModel {
        @NameInMap("AdaptorId")
        public Long adaptorId;

        @NameInMap("FrameRate")
        public String frameRate;

        @NameInMap("Hardware")
        public String hardware;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImageUid")
        public String imageUid;

        @NameInMap("Number")
        public String number;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("VersionName")
        public String versionName;

        public static ListImageByAppIdResponseBodyDataImageDOList build(java.util.Map<String, ?> map) throws Exception {
            ListImageByAppIdResponseBodyDataImageDOList self = new ListImageByAppIdResponseBodyDataImageDOList();
            return TeaModel.build(map, self);
        }

        public ListImageByAppIdResponseBodyDataImageDOList setAdaptorId(Long adaptorId) {
            this.adaptorId = adaptorId;
            return this;
        }
        public Long getAdaptorId() {
            return this.adaptorId;
        }

        public ListImageByAppIdResponseBodyDataImageDOList setFrameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public String getFrameRate() {
            return this.frameRate;
        }

        public ListImageByAppIdResponseBodyDataImageDOList setHardware(String hardware) {
            this.hardware = hardware;
            return this;
        }
        public String getHardware() {
            return this.hardware;
        }

        public ListImageByAppIdResponseBodyDataImageDOList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListImageByAppIdResponseBodyDataImageDOList setImageUid(String imageUid) {
            this.imageUid = imageUid;
            return this;
        }
        public String getImageUid() {
            return this.imageUid;
        }

        public ListImageByAppIdResponseBodyDataImageDOList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListImageByAppIdResponseBodyDataImageDOList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListImageByAppIdResponseBodyDataImageDOList setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListImageByAppIdResponseBodyDataImageDOList setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ListImageByAppIdResponseBodyDataImageDOList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListImageByAppIdResponseBodyDataImageDOList setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class ListImageByAppIdResponseBodyDataTagList extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public Long name;

        public static ListImageByAppIdResponseBodyDataTagList build(java.util.Map<String, ?> map) throws Exception {
            ListImageByAppIdResponseBodyDataTagList self = new ListImageByAppIdResponseBodyDataTagList();
            return TeaModel.build(map, self);
        }

        public ListImageByAppIdResponseBodyDataTagList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListImageByAppIdResponseBodyDataTagList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListImageByAppIdResponseBodyDataTagList setName(Long name) {
            this.name = name;
            return this;
        }
        public Long getName() {
            return this.name;
        }

    }

    public static class ListImageByAppIdResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImageDOList")
        public java.util.List<ListImageByAppIdResponseBodyDataImageDOList> imageDOList;

        @NameInMap("TagList")
        public java.util.List<ListImageByAppIdResponseBodyDataTagList> tagList;

        public static ListImageByAppIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListImageByAppIdResponseBodyData self = new ListImageByAppIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListImageByAppIdResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListImageByAppIdResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListImageByAppIdResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListImageByAppIdResponseBodyData setImageDOList(java.util.List<ListImageByAppIdResponseBodyDataImageDOList> imageDOList) {
            this.imageDOList = imageDOList;
            return this;
        }
        public java.util.List<ListImageByAppIdResponseBodyDataImageDOList> getImageDOList() {
            return this.imageDOList;
        }

        public ListImageByAppIdResponseBodyData setTagList(java.util.List<ListImageByAppIdResponseBodyDataTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<ListImageByAppIdResponseBodyDataTagList> getTagList() {
            return this.tagList;
        }

    }

}
