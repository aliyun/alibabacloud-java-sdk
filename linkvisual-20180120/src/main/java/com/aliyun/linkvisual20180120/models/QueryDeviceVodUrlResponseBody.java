// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceVodUrlResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: The call was successful.</li>
     * <li>Other values: The call failed. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public QueryDeviceVodUrlResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>product is not active.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>06DC77A0-4622-42DB-9EE0-25FIOHS82JK1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceVodUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceVodUrlResponseBody self = new QueryDeviceVodUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceVodUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceVodUrlResponseBody setData(QueryDeviceVodUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceVodUrlResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceVodUrlResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceVodUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceVodUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceVodUrlResponseBodyData extends TeaModel {
        /**
         * <p>The decryption key.
         * A decryption key is generated when the <strong>ShouldEncrypt</strong> parameter is set to <strong>true</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;iv&quot;: &quot;MDEy<strong><strong>OTo7PD0+Pw==&quot;,&quot;key&quot;: &quot;eA2r</strong></strong>fHjOmnyBfQ==&quot;}</p>
         */
        @NameInMap("DecryptKey")
        public String decryptKey;

        @NameInMap("StunInfo")
        public String stunInfo;

        /**
         * <p>The URL of the local recording.</p>
         */
        @NameInMap("VodUrl")
        public String vodUrl;

        public static QueryDeviceVodUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceVodUrlResponseBodyData self = new QueryDeviceVodUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceVodUrlResponseBodyData setDecryptKey(String decryptKey) {
            this.decryptKey = decryptKey;
            return this;
        }
        public String getDecryptKey() {
            return this.decryptKey;
        }

        public QueryDeviceVodUrlResponseBodyData setStunInfo(String stunInfo) {
            this.stunInfo = stunInfo;
            return this;
        }
        public String getStunInfo() {
            return this.stunInfo;
        }

        public QueryDeviceVodUrlResponseBodyData setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

    }

}
