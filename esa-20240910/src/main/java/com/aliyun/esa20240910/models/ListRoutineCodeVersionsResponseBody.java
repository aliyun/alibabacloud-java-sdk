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

    public static class ListRoutineCodeVersionsResponseBodyCodeVersions extends TeaModel {
        @NameInMap("CodeDescription")
        public String codeDescription;

        @NameInMap("CodeVersion")
        public String codeVersion;

        @NameInMap("CreateTime")
        public String createTime;

        public static ListRoutineCodeVersionsResponseBodyCodeVersions build(java.util.Map<String, ?> map) throws Exception {
            ListRoutineCodeVersionsResponseBodyCodeVersions self = new ListRoutineCodeVersionsResponseBodyCodeVersions();
            return TeaModel.build(map, self);
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

        public ListRoutineCodeVersionsResponseBodyCodeVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
