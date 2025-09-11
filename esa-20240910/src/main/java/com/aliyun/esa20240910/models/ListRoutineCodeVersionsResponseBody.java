// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineCodeVersionsResponseBody extends TeaModel {
    @NameInMap("CodeVersions")
    public java.util.List<ListRoutineCodeVersionsResponseBodyCodeVersions> codeVersions;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRoutineCodeVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineCodeVersionsResponseBody self = new ListRoutineCodeVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoutineCodeVersionsResponseBody setCodeVersions(java.util.List<ListRoutineCodeVersionsResponseBodyCodeVersions> codeVersions) {
        this.codeVersions = codeVersions;
        return this;
    }
    public java.util.List<ListRoutineCodeVersionsResponseBodyCodeVersions> getCodeVersions() {
        return this.codeVersions;
    }

    public ListRoutineCodeVersionsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRoutineCodeVersionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRoutineCodeVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoutineCodeVersionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRoutineCodeVersionsResponseBodyCodeVersionsConfOptions extends TeaModel {
        @NameInMap("NotFoundStrategy")
        public String notFoundStrategy;

        public static ListRoutineCodeVersionsResponseBodyCodeVersionsConfOptions build(java.util.Map<String, ?> map) throws Exception {
            ListRoutineCodeVersionsResponseBodyCodeVersionsConfOptions self = new ListRoutineCodeVersionsResponseBodyCodeVersionsConfOptions();
            return TeaModel.build(map, self);
        }

        public ListRoutineCodeVersionsResponseBodyCodeVersionsConfOptions setNotFoundStrategy(String notFoundStrategy) {
            this.notFoundStrategy = notFoundStrategy;
            return this;
        }
        public String getNotFoundStrategy() {
            return this.notFoundStrategy;
        }

    }

    public static class ListRoutineCodeVersionsResponseBodyCodeVersions extends TeaModel {
        @NameInMap("BuildId")
        public Long buildId;

        @NameInMap("CodeDescription")
        public String codeDescription;

        @NameInMap("CodeVersion")
        public String codeVersion;

        @NameInMap("ConfOptions")
        public ListRoutineCodeVersionsResponseBodyCodeVersionsConfOptions confOptions;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("Status")
        public String status;

        public static ListRoutineCodeVersionsResponseBodyCodeVersions build(java.util.Map<String, ?> map) throws Exception {
            ListRoutineCodeVersionsResponseBodyCodeVersions self = new ListRoutineCodeVersionsResponseBodyCodeVersions();
            return TeaModel.build(map, self);
        }

        public ListRoutineCodeVersionsResponseBodyCodeVersions setBuildId(Long buildId) {
            this.buildId = buildId;
            return this;
        }
        public Long getBuildId() {
            return this.buildId;
        }

        public ListRoutineCodeVersionsResponseBodyCodeVersions setCodeDescription(String codeDescription) {
            this.codeDescription = codeDescription;
            return this;
        }
        public String getCodeDescription() {
            return this.codeDescription;
        }

        public ListRoutineCodeVersionsResponseBodyCodeVersions setCodeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }
        public String getCodeVersion() {
            return this.codeVersion;
        }

        public ListRoutineCodeVersionsResponseBodyCodeVersions setConfOptions(ListRoutineCodeVersionsResponseBodyCodeVersionsConfOptions confOptions) {
            this.confOptions = confOptions;
            return this;
        }
        public ListRoutineCodeVersionsResponseBodyCodeVersionsConfOptions getConfOptions() {
            return this.confOptions;
        }

        public ListRoutineCodeVersionsResponseBodyCodeVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRoutineCodeVersionsResponseBodyCodeVersions setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public ListRoutineCodeVersionsResponseBodyCodeVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
