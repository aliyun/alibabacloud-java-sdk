// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySoundRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>返回状态码 0000表示成功 其他表示失败</p>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySoundRecordResponseBodyData data;

    /**
     * <p>返回信息</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>返回是否成功 true  表示成功 false表示失败</p>
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
         * <p>通话录音url路径，最大长度1000，有效期1小时</p>
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
