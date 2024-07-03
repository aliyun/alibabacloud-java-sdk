// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetTotalPublicUrlResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other status codes indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The download URLs of the recording files.</p>
     */
    @NameInMap("Data")
    public GetTotalPublicUrlResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AB3CEF7-DCBE-488C-9C33-D180982CE031</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTotalPublicUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTotalPublicUrlResponseBody self = new GetTotalPublicUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTotalPublicUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTotalPublicUrlResponseBody setData(GetTotalPublicUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTotalPublicUrlResponseBodyData getData() {
        return this.data;
    }

    public GetTotalPublicUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTotalPublicUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTotalPublicUrlResponseBodyData extends TeaModel {
        /**
         * <p>The download URL of the recorded call.</p>
         * <blockquote>
         * <p> The download URL of the recorded call is valid for 30 days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://secret-axb-reco****cn-shanghai.aliyuncs.com/1000000820257625_66647243838006067251551752068865.mp3?Expires=1551****07&OSSAccessKeyId=LTAIP00vvvv****v&Signature=tK6Yq9KusU4n%2BZQWX****4/WmEA%3D">http://secret-axb-reco****cn-shanghai.aliyuncs.com/1000000820257625_66647243838006067251551752068865.mp3?Expires=1551****07&amp;OSSAccessKeyId=LTAIP00vvvv****v&amp;Signature=tK6Yq9KusU4n%2BZQWX****4/WmEA%3D</a></p>
         */
        @NameInMap("PhonePublicUrl")
        public String phonePublicUrl;

        /**
         * <p>The download URL of the recorded ringing tone.</p>
         * <blockquote>
         * <p> The download URL of the recorded ringing tone is valid for 30 days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://secret-ab-reco****cn-shanghai.aliyuncs.com/1000000820257625_66647243838006067251551752068865.mp3?Expires=155175****&OSSAccessKeyId=LTAIP00vvv****vv&Signature=tK6Yq9KusU4n%2BZQW****g4/WmEA%3D">http://secret-ab-reco****cn-shanghai.aliyuncs.com/1000000820257625_66647243838006067251551752068865.mp3?Expires=155175****&amp;OSSAccessKeyId=LTAIP00vvv****vv&amp;Signature=tK6Yq9KusU4n%2BZQW****g4/WmEA%3D</a></p>
         */
        @NameInMap("RingPublicUrl")
        public String ringPublicUrl;

        public static GetTotalPublicUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTotalPublicUrlResponseBodyData self = new GetTotalPublicUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTotalPublicUrlResponseBodyData setPhonePublicUrl(String phonePublicUrl) {
            this.phonePublicUrl = phonePublicUrl;
            return this;
        }
        public String getPhonePublicUrl() {
            return this.phonePublicUrl;
        }

        public GetTotalPublicUrlResponseBodyData setRingPublicUrl(String ringPublicUrl) {
            this.ringPublicUrl = ringPublicUrl;
            return this;
        }
        public String getRingPublicUrl() {
            return this.ringPublicUrl;
        }

    }

}
