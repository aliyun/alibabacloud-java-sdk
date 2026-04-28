// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetRecordUrlResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudGetRecordUrlResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6086693B-2250-17CE-A41F-06259AB6DB1B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudGetRecordUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudGetRecordUrlResponseBody self = new CloudGetRecordUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudGetRecordUrlResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudGetRecordUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudGetRecordUrlResponseBody setData(CloudGetRecordUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudGetRecordUrlResponseBodyData getData() {
        return this.data;
    }

    public CloudGetRecordUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudGetRecordUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudGetRecordUrlResponseBodyData extends TeaModel {
        /**
         * <p>试听或下载地址，默认120分钟过期（可配置），过期后，需重新请求接口</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://voice-1.aliyun.cn/31102016/record/7000000/7000000-2016103111%204742-01087120766-01087120766--record-sip-1-1477885662.222.mp3?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20161114T100003Z&X-Amz-SignedHeaders=host&X-Amz-Expires=119&X-Amz-Credential=AKIAOTCJOBZFUWFI7FSA%2F20161114%2Fcn-north-1%2Fs3%2Faws4_request&X-Amz-Signature=0cda4389ecc743acc71d76a320705afd0c175c5ad2286305675c4dee5189b9c8">http://voice-1.aliyun.cn/31102016/record/7000000/7000000-2016103111%204742-01087120766-01087120766--record-sip-1-1477885662.222.mp3?X-Amz-Algorithm=AWS4-HMAC-SHA256&amp;X-Amz-Date=20161114T100003Z&amp;X-Amz-SignedHeaders=host&amp;X-Amz-Expires=119&amp;X-Amz-Credential=AKIAOTCJOBZFUWFI7FSA%2F20161114%2Fcn-north-1%2Fs3%2Faws4_request&amp;X-Amz-Signature=0cda4389ecc743acc71d76a320705afd0c175c5ad2286305675c4dee5189b9c8</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static CloudGetRecordUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudGetRecordUrlResponseBodyData self = new CloudGetRecordUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudGetRecordUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
