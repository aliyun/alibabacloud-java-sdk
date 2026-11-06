// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryMauReportDataResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of <code>200</code> indicates that the request is processed successfully. Other values indicate that the request fails to be processed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The list of monthly active user report data.</p>
     */
    @NameInMap("MauReportDataModel")
    public java.util.List<QueryMauReportDataResponseBodyMauReportDataModel> mauReportDataModel;

    /**
     * <p>The description of the request processing result. If the request is successful, <code>success</code> is usually returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number corresponding to the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page used in the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryMauReportDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMauReportDataResponseBody self = new QueryMauReportDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMauReportDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMauReportDataResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryMauReportDataResponseBody setMauReportDataModel(java.util.List<QueryMauReportDataResponseBodyMauReportDataModel> mauReportDataModel) {
        this.mauReportDataModel = mauReportDataModel;
        return this;
    }
    public java.util.List<QueryMauReportDataResponseBodyMauReportDataModel> getMauReportDataModel() {
        return this.mauReportDataModel;
    }

    public QueryMauReportDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMauReportDataResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryMauReportDataResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMauReportDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMauReportDataResponseBodyMauReportDataModel extends TeaModel {
        /**
         * <p>The app instance group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The number of monthly active users in the statistical month. Unit: users.</p>
         * 
         * <strong>example:</strong>
         * <p>286</p>
         */
        @NameInMap("Mau")
        public Long mau;

        /**
         * <p>The business region ID to which the report data belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The statistical cutoff date used for the month. Format: <code>yyyy-MM-dd</code>. For the last month, this is usually the day before the requested <code>EndDate</code>. The date is interpreted as a calendar date in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-29</p>
         */
        @NameInMap("StatDate")
        public String statDate;

        /**
         * <p>The statistical month. Format: <code>yyyy-MM</code>. The month is interpreted as a calendar month in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09</p>
         */
        @NameInMap("StatMonth")
        public String statMonth;

        public static QueryMauReportDataResponseBodyMauReportDataModel build(java.util.Map<String, ?> map) throws Exception {
            QueryMauReportDataResponseBodyMauReportDataModel self = new QueryMauReportDataResponseBodyMauReportDataModel();
            return TeaModel.build(map, self);
        }

        public QueryMauReportDataResponseBodyMauReportDataModel setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public QueryMauReportDataResponseBodyMauReportDataModel setMau(Long mau) {
            this.mau = mau;
            return this;
        }
        public Long getMau() {
            return this.mau;
        }

        public QueryMauReportDataResponseBodyMauReportDataModel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryMauReportDataResponseBodyMauReportDataModel setStatDate(String statDate) {
            this.statDate = statDate;
            return this;
        }
        public String getStatDate() {
            return this.statDate;
        }

        public QueryMauReportDataResponseBodyMauReportDataModel setStatMonth(String statMonth) {
            this.statMonth = statMonth;
            return this;
        }
        public String getStatMonth() {
            return this.statMonth;
        }

    }

}
