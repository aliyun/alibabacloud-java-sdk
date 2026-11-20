// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySoundRecordResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code. Valid values:</p>
     * <ul>
     * <li>0000: Success.</li>
     * </ul>
     * <p>Other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The call recording query results.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FileUrl&quot;:&quot;<a href="http://www.oss.com/temepl/a.mp3%22%7D">http://www.oss.com/temepl/a.mp3&quot;}</a></p>
     */
    @NameInMap("Data")
    public QuerySoundRecordResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request is successful. </p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySoundRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundRecordResponseBody self = new QuerySoundRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySoundRecordResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySoundRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySoundRecordResponseBody setData(QuerySoundRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySoundRecordResponseBodyData getData() {
        return this.data;
    }

    public QuerySoundRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySoundRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySoundRecordResponseBodyData extends TeaModel {
        /**
         * <p>The URL of the call recording. The maximum length is 1,000 characters. The URL is valid for 1 hour.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.oss.com/temepl/a.mp3">http://www.oss.com/temepl/a.mp3</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        public static QuerySoundRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundRecordResponseBodyData self = new QuerySoundRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySoundRecordResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

}
