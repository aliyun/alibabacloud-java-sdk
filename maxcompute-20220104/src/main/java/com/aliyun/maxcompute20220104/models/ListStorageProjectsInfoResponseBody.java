// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStorageProjectsInfoResponseBody extends TeaModel {
    @NameInMap("data")
    public ListStorageProjectsInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>this quota is not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
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
         * <strong>example:</strong>
         * <p>20250528</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("longTermStorage")
        public Double longTermStorage;

        /**
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("longTermStorageUnit")
        public String longTermStorageUnit;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("lowFreqStorage")
        public Double lowFreqStorage;

        /**
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("lowFreqStorageUnit")
        public String lowFreqStorageUnit;

        /**
         * <strong>example:</strong>
         * <p>max_testproject</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>0.011872406445069006</p>
         */
        @NameInMap("rate")
        public Double rate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("recycleBinStorage")
        public Double recycleBinStorage;

        /**
         * <strong>example:</strong>
         * <p>B</p>
         */
        @NameInMap("recycleBinStorageUnit")
        public String recycleBinStorageUnit;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("standardStorage")
        public Double standardStorage;

        /**
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("standardStorageUnit")
        public String standardStorageUnit;

        /**
         * <strong>example:</strong>
         * <p>1749105045512</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalStorage")
        public Double totalStorage;

        /**
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
         * <strong>example:</strong>
         * <p>20241205</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("storageProjectInfoList")
        public java.util.List<ListStorageProjectsInfoResponseBodyDataStorageProjectInfoList> storageProjectInfoList;

        /**
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
