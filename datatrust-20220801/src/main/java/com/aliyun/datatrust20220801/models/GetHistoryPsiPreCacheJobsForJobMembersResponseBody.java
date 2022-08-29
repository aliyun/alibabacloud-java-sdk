// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetHistoryPsiPreCacheJobsForJobMembersResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHistoryPsiPreCacheJobsForJobMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryPsiPreCacheJobsForJobMembersResponseBody self = new GetHistoryPsiPreCacheJobsForJobMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHistoryPsiPreCacheJobsForJobMembersResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetHistoryPsiPreCacheJobsForJobMembersResponseBody setData(java.util.List<GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData> getData() {
        return this.data;
    }

    public GetHistoryPsiPreCacheJobsForJobMembersResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHistoryPsiPreCacheJobsForJobMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHistoryPsiPreCacheJobsForJobMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHistoryPsiPreCacheJobsForJobMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData extends TeaModel {
        @NameInMap("CacheUsage")
        public Long cacheUsage;

        @NameInMap("IsUsePsiPreCache")
        public Boolean isUsePsiPreCache;

        @NameInMap("LocalBasePath")
        public String localBasePath;

        @NameInMap("PsiPreCacheColumn")
        public java.util.List<String> psiPreCacheColumn;

        @NameInMap("PsiPreCacheDataName")
        public String psiPreCacheDataName;

        @NameInMap("PsiPreCacheJobId")
        public Long psiPreCacheJobId;

        @NameInMap("PsiPreCacheJobName")
        public String psiPreCacheJobName;

        public static GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData self = new GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData setCacheUsage(Long cacheUsage) {
            this.cacheUsage = cacheUsage;
            return this;
        }
        public Long getCacheUsage() {
            return this.cacheUsage;
        }

        public GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData setIsUsePsiPreCache(Boolean isUsePsiPreCache) {
            this.isUsePsiPreCache = isUsePsiPreCache;
            return this;
        }
        public Boolean getIsUsePsiPreCache() {
            return this.isUsePsiPreCache;
        }

        public GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData setLocalBasePath(String localBasePath) {
            this.localBasePath = localBasePath;
            return this;
        }
        public String getLocalBasePath() {
            return this.localBasePath;
        }

        public GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData setPsiPreCacheColumn(java.util.List<String> psiPreCacheColumn) {
            this.psiPreCacheColumn = psiPreCacheColumn;
            return this;
        }
        public java.util.List<String> getPsiPreCacheColumn() {
            return this.psiPreCacheColumn;
        }

        public GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData setPsiPreCacheDataName(String psiPreCacheDataName) {
            this.psiPreCacheDataName = psiPreCacheDataName;
            return this;
        }
        public String getPsiPreCacheDataName() {
            return this.psiPreCacheDataName;
        }

        public GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData setPsiPreCacheJobId(Long psiPreCacheJobId) {
            this.psiPreCacheJobId = psiPreCacheJobId;
            return this;
        }
        public Long getPsiPreCacheJobId() {
            return this.psiPreCacheJobId;
        }

        public GetHistoryPsiPreCacheJobsForJobMembersResponseBodyData setPsiPreCacheJobName(String psiPreCacheJobName) {
            this.psiPreCacheJobName = psiPreCacheJobName;
            return this;
        }
        public String getPsiPreCacheJobName() {
            return this.psiPreCacheJobName;
        }

    }

}
