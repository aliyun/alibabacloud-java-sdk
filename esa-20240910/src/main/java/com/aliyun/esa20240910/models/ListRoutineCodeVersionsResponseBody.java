// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineCodeVersionsResponseBody extends TeaModel {
    /**
     * <p>The code versions of the routine.</p>
     */
    @NameInMap("CodeVersions")
    public java.util.List<ListRoutineCodeVersionsResponseBodyCodeVersions> codeVersions;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of code versions returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
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
        /**
         * <p>Code version configuration items NotFoundStrategy.</p>
         * 
         * <strong>example:</strong>
         * <p>SinglePageApplication</p>
         */
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
        /**
         * <p>The ID of the code version build.</p>
         * 
         * <strong>example:</strong>
         * <p>25801233</p>
         */
        @NameInMap("BuildId")
        public Long buildId;

        /**
         * <p>The description of the code version.</p>
         * 
         * <strong>example:</strong>
         * <p>test desc</p>
         */
        @NameInMap("CodeDescription")
        public String codeDescription;

        /**
         * <p>The version of the code.</p>
         * 
         * <strong>example:</strong>
         * <p>1723599747213377175</p>
         */
        @NameInMap("CodeVersion")
        public String codeVersion;

        /**
         * <p>Code version configuration items.</p>
         */
        @NameInMap("ConfOptions")
        public ListRoutineCodeVersionsResponseBodyCodeVersionsConfOptions confOptions;

        /**
         * <p>The time when the code version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-16T09:42:47Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Additional information about the code version.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;approver\&quot;:[\&quot;348678\&quot;,\&quot;111133\&quot;,\&quot;411544\&quot;]}</p>
         */
        @NameInMap("ExtraInfo")
        public String extraInfo;

        /**
         * <p>The status of the code version.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
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
