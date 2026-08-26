// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordNotifyRecordsResponseBody extends TeaModel {
    /**
     * <p>The callback records.</p>
     */
    @NameInMap("CallbackList")
    public java.util.List<DescribeLiveRecordNotifyRecordsResponseBodyCallbackList> callbackList;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>180FA0D2-1A02-5158-A36B-115DBF7B218D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that meet the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeLiveRecordNotifyRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordNotifyRecordsResponseBody self = new DescribeLiveRecordNotifyRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordNotifyRecordsResponseBody setCallbackList(java.util.List<DescribeLiveRecordNotifyRecordsResponseBodyCallbackList> callbackList) {
        this.callbackList = callbackList;
        return this;
    }
    public java.util.List<DescribeLiveRecordNotifyRecordsResponseBodyCallbackList> getCallbackList() {
        return this.callbackList;
    }

    public DescribeLiveRecordNotifyRecordsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeLiveRecordNotifyRecordsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeLiveRecordNotifyRecordsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveRecordNotifyRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveRecordNotifyRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveRecordNotifyRecordsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveRecordNotifyRecordsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeLiveRecordNotifyRecordsResponseBodyCallbackList extends TeaModel {
        /**
         * <p>The name of the application to which the stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The result description. The value is success if the callback was successful. Otherwise, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The streamer\&quot;s streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The specific content of the callback.</p>
         * 
         * <strong>example:</strong>
         * <p>7月26日 16:14{&quot;domain&quot;:&quot;al.xxxx.com&quot;,&quot;stream&quot;:&quot;livestream01&quot;,&quot;pull _stream_result&quot;:true,&quot;cdn&quot;:&quot;al&quot;}</p>
         */
        @NameInMap("NotifyContent")
        public String notifyContent;

        /**
         * <p>The callback request header.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;Content-Type&quot;: [
         *     &quot;application/json; charset=utf-8&quot;
         *   ]
         * }</p>
         */
        @NameInMap("NotifyHeader")
        public String notifyHeader;

        /**
         * <p>The response returned by the user after receiving the callback.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Code&quot;:0,&quot;Msg&quot;:&quot;Success&quot;}</p>
         */
        @NameInMap("NotifyResponse")
        public String notifyResponse;

        /**
         * <p>The callback result. Valid values:</p>
         * <ul>
         * <li>success: The callback was successful.</li>
         * <li>failed: The callback failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("NotifyResult")
        public String notifyResult;

        /**
         * <p>The callback time. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-19T19:09:28Z</p>
         */
        @NameInMap("NotifyTime")
        public String notifyTime;

        /**
         * <p>The callback type. Valid values:</p>
         * <ul>
         * <li>file_created: The recording was created.</li>
         * <li>record_error: A recording error occurred.</li>
         * <li>record_started: The recording started.</li>
         * <li>record_paused: The recording was paused.</li>
         * <li>record_resumed: The recording was resumed.</li>
         * <li>record_force_transcode_fail: The recording task failed to trigger transcoding.</li>
         * <li>transformat_error: An error occurred while parsing the live stream content.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record_started</p>
         */
        @NameInMap("NotifyType")
        public String notifyType;

        /**
         * <p>The recording callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://learn.aliyundoc.com/examplecallback.action">http://learn.aliyundoc.com/examplecallback.action</a></p>
         */
        @NameInMap("NotifyUrl")
        public String notifyUrl;

        /**
         * <p>The recording storage type. Valid values:</p>
         * <ul>
         * <li>oss: recorded to OSS</li>
         * <li>vod: recorded to ApsaraVideo VOD</li>
         * <li>all: all storage types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The stream name.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        public static DescribeLiveRecordNotifyRecordsResponseBodyCallbackList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordNotifyRecordsResponseBodyCallbackList self = new DescribeLiveRecordNotifyRecordsResponseBodyCallbackList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordNotifyRecordsResponseBodyCallbackList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveRecordNotifyRecordsResponseBodyCallbackList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveRecordNotifyRecordsResponseBodyCallbackList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveRecordNotifyRecordsResponseBodyCallbackList setNotifyContent(String notifyContent) {
            this.notifyContent = notifyContent;
            return this;
        }
        public String getNotifyContent() {
            return this.notifyContent;
        }

        public DescribeLiveRecordNotifyRecordsResponseBodyCallbackList setNotifyHeader(String notifyHeader) {
            this.notifyHeader = notifyHeader;
            return this;
        }
        public String getNotifyHeader() {
            return this.notifyHeader;
        }

        public DescribeLiveRecordNotifyRecordsResponseBodyCallbackList setNotifyResponse(String notifyResponse) {
            this.notifyResponse = notifyResponse;
            return this;
        }
        public String getNotifyResponse() {
            return this.notifyResponse;
        }

        public DescribeLiveRecordNotifyRecordsResponseBodyCallbackList setNotifyResult(String notifyResult) {
            this.notifyResult = notifyResult;
            return this;
        }
        public String getNotifyResult() {
            return this.notifyResult;
        }

        public DescribeLiveRecordNotifyRecordsResponseBodyCallbackList setNotifyTime(String notifyTime) {
            this.notifyTime = notifyTime;
            return this;
        }
        public String getNotifyTime() {
            return this.notifyTime;
        }

        public DescribeLiveRecordNotifyRecordsResponseBodyCallbackList setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
        }

        public DescribeLiveRecordNotifyRecordsResponseBodyCallbackList setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        public DescribeLiveRecordNotifyRecordsResponseBodyCallbackList setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeLiveRecordNotifyRecordsResponseBodyCallbackList setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

}
