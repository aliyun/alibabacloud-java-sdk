// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceVodUrlByTimeResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: The call was successful.</li>
     * <li>Other values: An error occurred. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
     * </ul>
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
    public QueryDeviceVodUrlByTimeResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant auth error</p>
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

    public static QueryDeviceVodUrlByTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceVodUrlByTimeResponseBody self = new QueryDeviceVodUrlByTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceVodUrlByTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceVodUrlByTimeResponseBody setData(QueryDeviceVodUrlByTimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceVodUrlByTimeResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceVodUrlByTimeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceVodUrlByTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceVodUrlByTimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceVodUrlByTimeResponseBodyData extends TeaModel {
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
         * <p>The playback URL of the local recording.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://iotx-vision-vod-vpc-hz-pre.aliyun-inc.com/vod/device/localrecord/flv/play/1****668.flv?token=e9****a9e14482c56be52&session=470e****3d015">https://iotx-vision-vod-vpc-hz-pre.aliyun-inc.com/vod/device/localrecord/flv/play/1****668.flv?token=e9****a9e14482c56be52&amp;session=470e****3d015</a></p>
         */
        @NameInMap("VodUrl")
        public String vodUrl;

        public static QueryDeviceVodUrlByTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceVodUrlByTimeResponseBodyData self = new QueryDeviceVodUrlByTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceVodUrlByTimeResponseBodyData setDecryptKey(String decryptKey) {
            this.decryptKey = decryptKey;
            return this;
        }
        public String getDecryptKey() {
            return this.decryptKey;
        }

        public QueryDeviceVodUrlByTimeResponseBodyData setStunInfo(String stunInfo) {
            this.stunInfo = stunInfo;
            return this;
        }
        public String getStunInfo() {
            return this.stunInfo;
        }

        public QueryDeviceVodUrlByTimeResponseBodyData setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

    }

}
