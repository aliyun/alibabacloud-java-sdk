// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineRelatedRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RelatedRecords")
    public java.util.List<ListRoutineRelatedRecordsResponseBodyRelatedRecords> relatedRecords;

    /**
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRoutineRelatedRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineRelatedRecordsResponseBody self = new ListRoutineRelatedRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoutineRelatedRecordsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRoutineRelatedRecordsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRoutineRelatedRecordsResponseBody setRelatedRecords(java.util.List<ListRoutineRelatedRecordsResponseBodyRelatedRecords> relatedRecords) {
        this.relatedRecords = relatedRecords;
        return this;
    }
    public java.util.List<ListRoutineRelatedRecordsResponseBodyRelatedRecords> getRelatedRecords() {
        return this.relatedRecords;
    }

    public ListRoutineRelatedRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoutineRelatedRecordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRoutineRelatedRecordsResponseBodyRelatedRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>509348423011904</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <strong>example:</strong>
         * <p>test-record-1.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <strong>example:</strong>
         * <p>54362329990032</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        public static ListRoutineRelatedRecordsResponseBodyRelatedRecords build(java.util.Map<String, ?> map) throws Exception {
            ListRoutineRelatedRecordsResponseBodyRelatedRecords self = new ListRoutineRelatedRecordsResponseBodyRelatedRecords();
            return TeaModel.build(map, self);
        }

        public ListRoutineRelatedRecordsResponseBodyRelatedRecords setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public ListRoutineRelatedRecordsResponseBodyRelatedRecords setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public ListRoutineRelatedRecordsResponseBodyRelatedRecords setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListRoutineRelatedRecordsResponseBodyRelatedRecords setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

    }

}
