// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetLibraryResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Library")
    public GetLibraryResponseBodyLibrary library;

    @NameInMap("Code")
    public String code;

    public static GetLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryResponseBody self = new GetLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLibraryResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public GetLibraryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLibraryResponseBody setLibrary(GetLibraryResponseBodyLibrary library) {
        this.library = library;
        return this;
    }
    public GetLibraryResponseBodyLibrary getLibrary() {
        return this.library;
    }

    public GetLibraryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetLibraryResponseBodyLibraryAutoCleanConfig extends TeaModel {
        @NameInMap("AutoCleanDays")
        public Integer autoCleanDays;

        @NameInMap("AutoCleanEnabled")
        public Boolean autoCleanEnabled;

        public static GetLibraryResponseBodyLibraryAutoCleanConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryResponseBodyLibraryAutoCleanConfig self = new GetLibraryResponseBodyLibraryAutoCleanConfig();
            return TeaModel.build(map, self);
        }

        public GetLibraryResponseBodyLibraryAutoCleanConfig setAutoCleanDays(Integer autoCleanDays) {
            this.autoCleanDays = autoCleanDays;
            return this;
        }
        public Integer getAutoCleanDays() {
            return this.autoCleanDays;
        }

        public GetLibraryResponseBodyLibraryAutoCleanConfig setAutoCleanEnabled(Boolean autoCleanEnabled) {
            this.autoCleanEnabled = autoCleanEnabled;
            return this;
        }
        public Boolean getAutoCleanEnabled() {
            return this.autoCleanEnabled;
        }

    }

    public static class GetLibraryResponseBodyLibraryQuota extends TeaModel {
        @NameInMap("PhotosCount")
        public Integer photosCount;

        @NameInMap("TotalTrashQuota")
        public Long totalTrashQuota;

        @NameInMap("InactiveSize")
        public Long inactiveSize;

        @NameInMap("ActiveSize")
        public Long activeSize;

        @NameInMap("FacesCount")
        public Integer facesCount;

        @NameInMap("VideosCount")
        public Integer videosCount;

        @NameInMap("UsedQuota")
        public Long usedQuota;

        @NameInMap("TotalQuota")
        public Long totalQuota;

        public static GetLibraryResponseBodyLibraryQuota build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryResponseBodyLibraryQuota self = new GetLibraryResponseBodyLibraryQuota();
            return TeaModel.build(map, self);
        }

        public GetLibraryResponseBodyLibraryQuota setPhotosCount(Integer photosCount) {
            this.photosCount = photosCount;
            return this;
        }
        public Integer getPhotosCount() {
            return this.photosCount;
        }

        public GetLibraryResponseBodyLibraryQuota setTotalTrashQuota(Long totalTrashQuota) {
            this.totalTrashQuota = totalTrashQuota;
            return this;
        }
        public Long getTotalTrashQuota() {
            return this.totalTrashQuota;
        }

        public GetLibraryResponseBodyLibraryQuota setInactiveSize(Long inactiveSize) {
            this.inactiveSize = inactiveSize;
            return this;
        }
        public Long getInactiveSize() {
            return this.inactiveSize;
        }

        public GetLibraryResponseBodyLibraryQuota setActiveSize(Long activeSize) {
            this.activeSize = activeSize;
            return this;
        }
        public Long getActiveSize() {
            return this.activeSize;
        }

        public GetLibraryResponseBodyLibraryQuota setFacesCount(Integer facesCount) {
            this.facesCount = facesCount;
            return this;
        }
        public Integer getFacesCount() {
            return this.facesCount;
        }

        public GetLibraryResponseBodyLibraryQuota setVideosCount(Integer videosCount) {
            this.videosCount = videosCount;
            return this;
        }
        public Integer getVideosCount() {
            return this.videosCount;
        }

        public GetLibraryResponseBodyLibraryQuota setUsedQuota(Long usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }
        public Long getUsedQuota() {
            return this.usedQuota;
        }

        public GetLibraryResponseBodyLibraryQuota setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

    }

    public static class GetLibraryResponseBodyLibrary extends TeaModel {
        @NameInMap("AutoCleanConfig")
        public GetLibraryResponseBodyLibraryAutoCleanConfig autoCleanConfig;

        @NameInMap("Quota")
        public GetLibraryResponseBodyLibraryQuota quota;

        @NameInMap("Ctime")
        public Long ctime;

        public static GetLibraryResponseBodyLibrary build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryResponseBodyLibrary self = new GetLibraryResponseBodyLibrary();
            return TeaModel.build(map, self);
        }

        public GetLibraryResponseBodyLibrary setAutoCleanConfig(GetLibraryResponseBodyLibraryAutoCleanConfig autoCleanConfig) {
            this.autoCleanConfig = autoCleanConfig;
            return this;
        }
        public GetLibraryResponseBodyLibraryAutoCleanConfig getAutoCleanConfig() {
            return this.autoCleanConfig;
        }

        public GetLibraryResponseBodyLibrary setQuota(GetLibraryResponseBodyLibraryQuota quota) {
            this.quota = quota;
            return this;
        }
        public GetLibraryResponseBodyLibraryQuota getQuota() {
            return this.quota;
        }

        public GetLibraryResponseBodyLibrary setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

    }

}
