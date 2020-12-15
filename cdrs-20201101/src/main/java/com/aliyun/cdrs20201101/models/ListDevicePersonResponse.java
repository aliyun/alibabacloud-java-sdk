// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListDevicePersonResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListDevicePersonResponseData> data;

    public static ListDevicePersonResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevicePersonResponse self = new ListDevicePersonResponse();
        return TeaModel.build(map, self);
    }

    public ListDevicePersonResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDevicePersonResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDevicePersonResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevicePersonResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDevicePersonResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDevicePersonResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDevicePersonResponse setData(java.util.List<ListDevicePersonResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDevicePersonResponseData> getData() {
        return this.data;
    }

    public static class ListDevicePersonResponseData extends TeaModel {
        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("FreqNum")
        @Validation(required = true)
        public String freqNum;

        @NameInMap("TargetPicUrlPath")
        @Validation(required = true)
        public String targetPicUrlPath;

        public static ListDevicePersonResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDevicePersonResponseData self = new ListDevicePersonResponseData();
            return TeaModel.build(map, self);
        }

        public ListDevicePersonResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListDevicePersonResponseData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListDevicePersonResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListDevicePersonResponseData setFreqNum(String freqNum) {
            this.freqNum = freqNum;
            return this;
        }
        public String getFreqNum() {
            return this.freqNum;
        }

        public ListDevicePersonResponseData setTargetPicUrlPath(String targetPicUrlPath) {
            this.targetPicUrlPath = targetPicUrlPath;
            return this;
        }
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

    }

}
