// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetBwmMigrationSubmitInstanceListResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public java.util.List<GetBwmMigrationSubmitInstanceListResponseBodyData> data;

    /**
     * <p>Indicates whether the result is empty.</p>
     */
    @NameInMap("empty")
    public Boolean empty;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>Indicates whether the result is not empty.</p>
     */
    @NameInMap("notEmpty")
    public Boolean notEmpty;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, use errCode and errMessage to troubleshoot the issue.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalPages")
    public Integer totalPages;

    public static GetBwmMigrationSubmitInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBwmMigrationSubmitInstanceListResponseBody self = new GetBwmMigrationSubmitInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBwmMigrationSubmitInstanceListResponseBody setData(java.util.List<GetBwmMigrationSubmitInstanceListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetBwmMigrationSubmitInstanceListResponseBodyData> getData() {
        return this.data;
    }

    public GetBwmMigrationSubmitInstanceListResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public GetBwmMigrationSubmitInstanceListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetBwmMigrationSubmitInstanceListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetBwmMigrationSubmitInstanceListResponseBody setNotEmpty(Boolean notEmpty) {
        this.notEmpty = notEmpty;
        return this;
    }
    public Boolean getNotEmpty() {
        return this.notEmpty;
    }

    public GetBwmMigrationSubmitInstanceListResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetBwmMigrationSubmitInstanceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetBwmMigrationSubmitInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBwmMigrationSubmitInstanceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBwmMigrationSubmitInstanceListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetBwmMigrationSubmitInstanceListResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class GetBwmMigrationSubmitInstanceListResponseBodyData extends TeaModel {
        /**
         * <p>The reason for the conversion failure.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>The conversion execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01 00:00:00</p>
         */
        @NameInMap("gmtConvert")
        public String gmtConvert;

        /**
         * <p>The UUID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance-1</p>
         */
        @NameInMap("instanceName")
        public String instanceName;

        /**
         * <p>The time when the source metadata was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01 00:00:00</p>
         */
        @NameInMap("srcMetaGmtUpdate")
        public String srcMetaGmtUpdate;

        /**
         * <p>The scheduling information of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>source-info</p>
         */
        @NameInMap("srcMetaInfo")
        public String srcMetaInfo;

        /**
         * <p>The execution status of the instance. Valid values:</p>
         * <ul>
         * <li>NOT_START: Not started.</li>
         * <li>READY: Pending execution.</li>
         * <li>RUNNING: Running.</li>
         * <li>ALL_SUCCESS: All succeeded.</li>
         * <li>PARTIAL_SUCCESS: Partially succeeded.</li>
         * <li>FAILURE: Failed.</li>
         * <li>MANUAL: Manually uploaded.</li>
         * </ul>
         * <p>If the status code cannot be recognized, the value defaults to NOT_START.</p>
         * 
         * <strong>example:</strong>
         * <p>NOT_START</p>
         */
        @NameInMap("status")
        public String status;

        public static GetBwmMigrationSubmitInstanceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBwmMigrationSubmitInstanceListResponseBodyData self = new GetBwmMigrationSubmitInstanceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBwmMigrationSubmitInstanceListResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetBwmMigrationSubmitInstanceListResponseBodyData setGmtConvert(String gmtConvert) {
            this.gmtConvert = gmtConvert;
            return this;
        }
        public String getGmtConvert() {
            return this.gmtConvert;
        }

        public GetBwmMigrationSubmitInstanceListResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetBwmMigrationSubmitInstanceListResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetBwmMigrationSubmitInstanceListResponseBodyData setSrcMetaGmtUpdate(String srcMetaGmtUpdate) {
            this.srcMetaGmtUpdate = srcMetaGmtUpdate;
            return this;
        }
        public String getSrcMetaGmtUpdate() {
            return this.srcMetaGmtUpdate;
        }

        public GetBwmMigrationSubmitInstanceListResponseBodyData setSrcMetaInfo(String srcMetaInfo) {
            this.srcMetaInfo = srcMetaInfo;
            return this;
        }
        public String getSrcMetaInfo() {
            return this.srcMetaInfo;
        }

        public GetBwmMigrationSubmitInstanceListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
