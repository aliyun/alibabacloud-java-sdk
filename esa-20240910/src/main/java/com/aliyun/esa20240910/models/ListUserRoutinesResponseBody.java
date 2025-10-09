// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserRoutinesResponseBody extends TeaModel {
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
     * <p>The maximum number of functions supported by the billing plan.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("QuotaRoutineNumber")
    public Long quotaRoutineNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890ABCDEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The functions.</p>
     */
    @NameInMap("Routines")
    public java.util.List<ListUserRoutinesResponseBodyRoutines> routines;

    /**
     * <p>The total count.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The number of functions that were already created.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
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
        /**
         * <p>The time when the function was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-11T01:23:02.883361712Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The default record name to access.</p>
         * 
         * <strong>example:</strong>
         * <p>serverless-test-2.154edaf6.er.aliyun-esa.net</p>
         */
        @NameInMap("DefaultRelatedRecord")
        public String defaultRelatedRecord;

        /**
         * <p>The function description.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWRpdCByb3V0aW5lIGNvbmZpZyBkZXNjcmlwdGlvbg==</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether to include the Assets file tag.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasAssets")
        public Boolean hasAssets;

        /**
         * <p>The function name.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
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

        public ListUserRoutinesResponseBodyRoutines setDefaultRelatedRecord(String defaultRelatedRecord) {
            this.defaultRelatedRecord = defaultRelatedRecord;
            return this;
        }
        public String getDefaultRelatedRecord() {
            return this.defaultRelatedRecord;
        }

        public ListUserRoutinesResponseBodyRoutines setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserRoutinesResponseBodyRoutines setHasAssets(Boolean hasAssets) {
            this.hasAssets = hasAssets;
            return this;
        }
        public Boolean getHasAssets() {
            return this.hasAssets;
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
