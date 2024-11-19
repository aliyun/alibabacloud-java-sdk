// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PageQuerySpeechBroadcastHourResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public PageQuerySpeechBroadcastHourResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Indicates whether the speech was successfully broadcasted. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The speech was successfully broadcasted.</li>
         * <li><strong>1</strong>: The speech was repeatedly broadcasted.</li>
         * <li><strong>2</strong>: The speech does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The DeviceName of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>device1</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The message that indicates the speech broadcasting result.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sd34****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The code of the sharing task.</p>
         * 
         * <strong>example:</strong>
         * <p>ebed9280_ba25_48df_80c2_****</p>
         */
        @NameInMap("ShareTaskCode")
        public String shareTaskCode;

        /**
         * <p>The ID of the speech that was broadcasted.</p>
         * 
         * <strong>example:</strong>
         * <p>42000011392021112380****</p>
         */
        @NameInMap("SpeechId")
        public String speechId;

        /**
         * <p>The content of the broadcasted speech. The parameter value is a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ANC&quot;,&quot;CDF&quot;]</p>
         */
        @NameInMap("Speechs")
        public String speechs;

        /**
         * <p>The start time of speech broadcasting. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1663210172207</p>
         */
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
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageId")
        public Integer pageId;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * <p>If <strong>PageToken</strong> is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        @NameInMap("PageToken")
        public String pageToken;

        /**
         * <p>The shared speech broadcasting data returned.</p>
         */
        @NameInMap("ResultData")
        public PageQuerySpeechBroadcastHourResponseBodyDataResultData resultData;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
