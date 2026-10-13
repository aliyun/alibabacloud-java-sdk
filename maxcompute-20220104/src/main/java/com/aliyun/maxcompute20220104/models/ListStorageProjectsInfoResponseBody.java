// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStorageProjectsInfoResponseBody extends TeaModel {
    /**
     * <p>The data.</p>
     */
    @NameInMap("data")
    public ListStorageProjectsInfoResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>this quota is not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: Informational. The request was received and is being processed.</li>
     * <li>2xx: Success. The action requested by the client was successfully received, understood, and accepted by the server.</li>
     * <li>3xx: Redirection. The request was redirected, and further action is required to complete it.</li>
     * <li>4xx: Client error. The request contains bad syntax, invalid parameters, or cannot be fulfilled.</li>
     * <li>5xx: Server error. The server failed to fulfill the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc3b4b016674434996033675e71ee</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListStorageProjectsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStorageProjectsInfoResponseBody self = new ListStorageProjectsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStorageProjectsInfoResponseBody setData(ListStorageProjectsInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListStorageProjectsInfoResponseBodyData getData() {
        return this.data;
    }

    public ListStorageProjectsInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListStorageProjectsInfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListStorageProjectsInfoResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListStorageProjectsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList extends TeaModel {
        /**
         * <p>The statistical date. Data is collected on a daily basis. Specify the date in the YYYYMMDD format.</p>
         * 
         * <strong>example:</strong>
         * <p>20250528</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <p>The long-term storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("longTermStorage")
        public Double longTermStorage;

        /**
         * <p>The unit of the long-term storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("longTermStorageUnit")
        public String longTermStorageUnit;

        /**
         * <p>The low-frequency storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("lowFreqStorage")
        public Double lowFreqStorage;

        /**
         * <p>The unit of the low-frequency storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("lowFreqStorageUnit")
        public String lowFreqStorageUnit;

        /**
         * <p>The name of the MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>max_testproject</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>The rate of change in the total storage usage compared with {$recentDays} days ago.</p>
         * 
         * <strong>example:</strong>
         * <p>0.011872406445069006</p>
         */
        @NameInMap("rate")
        public Double rate;

        /**
         * <p>The recycle bin storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("recycleBinStorage")
        public Double recycleBinStorage;

        /**
         * <p>The unit of the recycle bin storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>B</p>
         */
        @NameInMap("recycleBinStorageUnit")
        public String recycleBinStorageUnit;

        /**
         * <p>The standard storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("standardStorage")
        public Double standardStorage;

        /**
         * <p>The unit of the standard storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("standardStorageUnit")
        public String standardStorageUnit;

        /**
         * <p>The timestamp of the last data update.</p>
         * 
         * <strong>example:</strong>
         * <p>1749105045512</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        /**
         * <p>The total storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalStorage")
        public Double totalStorage;

        /**
         * <p>The unit of the total storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>TB</p>
         */
        @NameInMap("totalStorageUnit")
        public String totalStorageUnit;

        public static ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList self = new ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList();
            return TeaModel.build(map, self);
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setLongTermStorage(Double longTermStorage) {
            this.longTermStorage = longTermStorage;
            return this;
        }
        public Double getLongTermStorage() {
            return this.longTermStorage;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setLongTermStorageUnit(String longTermStorageUnit) {
            this.longTermStorageUnit = longTermStorageUnit;
            return this;
        }
        public String getLongTermStorageUnit() {
            return this.longTermStorageUnit;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setLowFreqStorage(Double lowFreqStorage) {
            this.lowFreqStorage = lowFreqStorage;
            return this;
        }
        public Double getLowFreqStorage() {
            return this.lowFreqStorage;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setLowFreqStorageUnit(String lowFreqStorageUnit) {
            this.lowFreqStorageUnit = lowFreqStorageUnit;
            return this;
        }
        public String getLowFreqStorageUnit() {
            return this.lowFreqStorageUnit;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setRecycleBinStorage(Double recycleBinStorage) {
            this.recycleBinStorage = recycleBinStorage;
            return this;
        }
        public Double getRecycleBinStorage() {
            return this.recycleBinStorage;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setRecycleBinStorageUnit(String recycleBinStorageUnit) {
            this.recycleBinStorageUnit = recycleBinStorageUnit;
            return this;
        }
        public String getRecycleBinStorageUnit() {
            return this.recycleBinStorageUnit;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setStandardStorage(Double standardStorage) {
            this.standardStorage = standardStorage;
            return this;
        }
        public Double getStandardStorage() {
            return this.standardStorage;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setStandardStorageUnit(String standardStorageUnit) {
            this.standardStorageUnit = standardStorageUnit;
            return this;
        }
        public String getStandardStorageUnit() {
            return this.standardStorageUnit;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setTotalStorage(Double totalStorage) {
            this.totalStorage = totalStorage;
            return this;
        }
        public Double getTotalStorage() {
            return this.totalStorage;
        }

        public ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList setTotalStorageUnit(String totalStorageUnit) {
            this.totalStorageUnit = totalStorageUnit;
            return this;
        }
        public String getTotalStorageUnit() {
            return this.totalStorageUnit;
        }

    }

    public static class ListStorageProjectsInfoResponseBodyData extends TeaModel {
        /**
         * <p>The statistical date. The format is YYYYMMDD.</p>
         * 
         * <strong>example:</strong>
         * <p>20241205</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The list of project-level storage information.</p>
         */
        @NameInMap("storageProjectInfoList")
        public java.util.List<ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList> storageProjectInfoList;

        /**
         * <p>The total number of returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListStorageProjectsInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListStorageProjectsInfoResponseBodyData self = new ListStorageProjectsInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListStorageProjectsInfoResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListStorageProjectsInfoResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListStorageProjectsInfoResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListStorageProjectsInfoResponseBodyData setStorageProjectInfoList(java.util.List<ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList> storageProjectInfoList) {
            this.storageProjectInfoList = storageProjectInfoList;
            return this;
        }
        public java.util.List<ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList> getStorageProjectInfoList() {
            return this.storageProjectInfoList;
        }

        public ListStorageProjectsInfoResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
