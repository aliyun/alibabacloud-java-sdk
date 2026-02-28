// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PageQuerySpeechBroadcastHourResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PageQuerySpeechBroadcastHourResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PageQuerySpeechBroadcastHourResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageQuerySpeechBroadcastHourResponseBody self = new PageQuerySpeechBroadcastHourResponseBody();
        return TeaModel.build(map, self);
    }

    public PageQuerySpeechBroadcastHourResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageQuerySpeechBroadcastHourResponseBody setData(PageQuerySpeechBroadcastHourResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PageQuerySpeechBroadcastHourResponseBodyData getData() {
        return this.data;
    }

    public PageQuerySpeechBroadcastHourResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PageQuerySpeechBroadcastHourResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageQuerySpeechBroadcastHourResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageQuerySpeechBroadcastHourResponseBodyDataResultDataData extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ShareTaskCode")
        public String shareTaskCode;

        @NameInMap("SpeechId")
        public String speechId;

        @NameInMap("Speechs")
        public String speechs;

        @NameInMap("StartTime")
        public Long startTime;

        public static PageQuerySpeechBroadcastHourResponseBodyDataResultDataData build(java.util.Map<String, ?> map) throws Exception {
            PageQuerySpeechBroadcastHourResponseBodyDataResultDataData self = new PageQuerySpeechBroadcastHourResponseBodyDataResultDataData();
            return TeaModel.build(map, self);
        }

        public PageQuerySpeechBroadcastHourResponseBodyDataResultDataData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public PageQuerySpeechBroadcastHourResponseBodyDataResultDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public PageQuerySpeechBroadcastHourResponseBodyDataResultDataData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public PageQuerySpeechBroadcastHourResponseBodyDataResultDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public PageQuerySpeechBroadcastHourResponseBodyDataResultDataData setShareTaskCode(String shareTaskCode) {
            this.shareTaskCode = shareTaskCode;
            return this;
        }
        public String getShareTaskCode() {
            return this.shareTaskCode;
        }

        public PageQuerySpeechBroadcastHourResponseBodyDataResultDataData setSpeechId(String speechId) {
            this.speechId = speechId;
            return this;
        }
        public String getSpeechId() {
            return this.speechId;
        }

        public PageQuerySpeechBroadcastHourResponseBodyDataResultDataData setSpeechs(String speechs) {
            this.speechs = speechs;
            return this;
        }
        public String getSpeechs() {
            return this.speechs;
        }

        public PageQuerySpeechBroadcastHourResponseBodyDataResultDataData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class PageQuerySpeechBroadcastHourResponseBodyDataResultData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<PageQuerySpeechBroadcastHourResponseBodyDataResultDataData> data;

        public static PageQuerySpeechBroadcastHourResponseBodyDataResultData build(java.util.Map<String, ?> map) throws Exception {
            PageQuerySpeechBroadcastHourResponseBodyDataResultData self = new PageQuerySpeechBroadcastHourResponseBodyDataResultData();
            return TeaModel.build(map, self);
        }

        public PageQuerySpeechBroadcastHourResponseBodyDataResultData setData(java.util.List<PageQuerySpeechBroadcastHourResponseBodyDataResultDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<PageQuerySpeechBroadcastHourResponseBodyDataResultDataData> getData() {
            return this.data;
        }

    }

    public static class PageQuerySpeechBroadcastHourResponseBodyData extends TeaModel {
        @NameInMap("PageId")
        public Integer pageId;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageToken")
        public String pageToken;

        @NameInMap("ResultData")
        public PageQuerySpeechBroadcastHourResponseBodyDataResultData resultData;

        @NameInMap("Total")
        public Integer total;

        public static PageQuerySpeechBroadcastHourResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PageQuerySpeechBroadcastHourResponseBodyData self = new PageQuerySpeechBroadcastHourResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PageQuerySpeechBroadcastHourResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public PageQuerySpeechBroadcastHourResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public PageQuerySpeechBroadcastHourResponseBodyData setPageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }
        public String getPageToken() {
            return this.pageToken;
        }

        public PageQuerySpeechBroadcastHourResponseBodyData setResultData(PageQuerySpeechBroadcastHourResponseBodyDataResultData resultData) {
            this.resultData = resultData;
            return this;
        }
        public PageQuerySpeechBroadcastHourResponseBodyDataResultData getResultData() {
            return this.resultData;
        }

        public PageQuerySpeechBroadcastHourResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
