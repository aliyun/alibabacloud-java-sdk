// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetQuotaResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Quota")
    public GetQuotaResponseBodyQuota quota;

    @NameInMap("Code")
    public String code;

    public static GetQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaResponseBody self = new GetQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public GetQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQuotaResponseBody setQuota(GetQuotaResponseBodyQuota quota) {
        this.quota = quota;
        return this;
    }
    public GetQuotaResponseBodyQuota getQuota() {
        return this.quota;
    }

    public GetQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetQuotaResponseBodyQuota extends TeaModel {
        @NameInMap("PhotosCount")
        public Integer photosCount;

        @NameInMap("VideosCount")
        public Integer videosCount;

        @NameInMap("FacesCount")
        public Integer facesCount;

        @NameInMap("UsedQuota")
        public Long usedQuota;

        @NameInMap("TotalQuota")
        public Long totalQuota;

        public static GetQuotaResponseBodyQuota build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyQuota self = new GetQuotaResponseBodyQuota();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyQuota setPhotosCount(Integer photosCount) {
            this.photosCount = photosCount;
            return this;
        }
        public Integer getPhotosCount() {
            return this.photosCount;
        }

        public GetQuotaResponseBodyQuota setVideosCount(Integer videosCount) {
            this.videosCount = videosCount;
            return this;
        }
        public Integer getVideosCount() {
            return this.videosCount;
        }

        public GetQuotaResponseBodyQuota setFacesCount(Integer facesCount) {
            this.facesCount = facesCount;
            return this;
        }
        public Integer getFacesCount() {
            return this.facesCount;
        }

        public GetQuotaResponseBodyQuota setUsedQuota(Long usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }
        public Long getUsedQuota() {
            return this.usedQuota;
        }

        public GetQuotaResponseBodyQuota setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

    }

}
