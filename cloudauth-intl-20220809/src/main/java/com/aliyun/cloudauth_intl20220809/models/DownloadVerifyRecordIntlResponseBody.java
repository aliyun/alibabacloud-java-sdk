// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DownloadVerifyRecordIntlResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DownloadVerifyRecordIntlResponseBodyData data;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DownloadVerifyRecordIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadVerifyRecordIntlResponseBody self = new DownloadVerifyRecordIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadVerifyRecordIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DownloadVerifyRecordIntlResponseBody setData(DownloadVerifyRecordIntlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DownloadVerifyRecordIntlResponseBodyData getData() {
        return this.data;
    }

    public DownloadVerifyRecordIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DownloadVerifyRecordIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DownloadVerifyRecordIntlResponseBodyData extends TeaModel {
        /**
         * <p>The task ID. This parameter is returned in asynchronous mode. Use QueryDownloadTaskIntl to download the exported file.</p>
         * 
         * <strong>example:</strong>
         * <p>202511284106866</p>
         */
        @NameInMap("DownloadTaskId")
        public String downloadTaskId;

        /**
         * <p>The download URL of the exported file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-shanghai-aliyun-cloudauth.oss-cn-shanghai.aliyuncs.com/console/xxxxxx/KYC_INVOKE_STATISTICS.xlxs">https://cn-shanghai-aliyun-cloudauth.oss-cn-shanghai.aliyuncs.com/console/xxxxxx/KYC_INVOKE_STATISTICS.xlxs</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DownloadVerifyRecordIntlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DownloadVerifyRecordIntlResponseBodyData self = new DownloadVerifyRecordIntlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DownloadVerifyRecordIntlResponseBodyData setDownloadTaskId(String downloadTaskId) {
            this.downloadTaskId = downloadTaskId;
            return this;
        }
        public String getDownloadTaskId() {
            return this.downloadTaskId;
        }

        public DownloadVerifyRecordIntlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
