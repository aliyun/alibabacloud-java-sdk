// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class FetchLibrariesResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Libraries")
    public java.util.List<FetchLibrariesResponseBodyLibraries> libraries;

    @NameInMap("Code")
    public String code;

    public static FetchLibrariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchLibrariesResponseBody self = new FetchLibrariesResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchLibrariesResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public FetchLibrariesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public FetchLibrariesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FetchLibrariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchLibrariesResponseBody setLibraries(java.util.List<FetchLibrariesResponseBodyLibraries> libraries) {
        this.libraries = libraries;
        return this;
    }
    public java.util.List<FetchLibrariesResponseBodyLibraries> getLibraries() {
        return this.libraries;
    }

    public FetchLibrariesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class FetchLibrariesResponseBodyLibraries extends TeaModel {
        @NameInMap("Ctime")
        public Long ctime;

        @NameInMap("LibraryId")
        public String libraryId;

        @NameInMap("TotalQuota")
        public Long totalQuota;

        public static FetchLibrariesResponseBodyLibraries build(java.util.Map<String, ?> map) throws Exception {
            FetchLibrariesResponseBodyLibraries self = new FetchLibrariesResponseBodyLibraries();
            return TeaModel.build(map, self);
        }

        public FetchLibrariesResponseBodyLibraries setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public FetchLibrariesResponseBodyLibraries setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public FetchLibrariesResponseBodyLibraries setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

    }

}
