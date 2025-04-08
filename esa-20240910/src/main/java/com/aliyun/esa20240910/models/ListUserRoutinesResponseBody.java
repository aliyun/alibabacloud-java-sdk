// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserRoutinesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("QuotaRoutineNumber")
    public Long quotaRoutineNumber;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Routines")
    public java.util.List<ListUserRoutinesResponseBodyRoutines> routines;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("UsedRoutineNumber")
    public Long usedRoutineNumber;

    public static ListUserRoutinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserRoutinesResponseBody self = new ListUserRoutinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserRoutinesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListUserRoutinesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUserRoutinesResponseBody setQuotaRoutineNumber(Long quotaRoutineNumber) {
        this.quotaRoutineNumber = quotaRoutineNumber;
        return this;
    }
    public Long getQuotaRoutineNumber() {
        return this.quotaRoutineNumber;
    }

    public ListUserRoutinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserRoutinesResponseBody setRoutines(java.util.List<ListUserRoutinesResponseBodyRoutines> routines) {
        this.routines = routines;
        return this;
    }
    public java.util.List<ListUserRoutinesResponseBodyRoutines> getRoutines() {
        return this.routines;
    }

    public ListUserRoutinesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUserRoutinesResponseBody setUsedRoutineNumber(Long usedRoutineNumber) {
        this.usedRoutineNumber = usedRoutineNumber;
        return this;
    }
    public Long getUsedRoutineNumber() {
        return this.usedRoutineNumber;
    }

    public static class ListUserRoutinesResponseBodyRoutines extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("RoutineName")
        public String routineName;

        public static ListUserRoutinesResponseBodyRoutines build(java.util.Map<String, ?> map) throws Exception {
            ListUserRoutinesResponseBodyRoutines self = new ListUserRoutinesResponseBodyRoutines();
            return TeaModel.build(map, self);
        }

        public ListUserRoutinesResponseBodyRoutines setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserRoutinesResponseBodyRoutines setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserRoutinesResponseBodyRoutines setRoutineName(String routineName) {
            this.routineName = routineName;
            return this;
        }
        public String getRoutineName() {
            return this.routineName;
        }

    }

}
