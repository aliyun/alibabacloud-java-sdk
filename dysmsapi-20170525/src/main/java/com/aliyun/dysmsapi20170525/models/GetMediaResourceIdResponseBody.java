// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetMediaResourceIdResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>Other values indicate that the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetMediaResourceIdResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F07CF237-F6E3-5F77-B91B-F9B7C5DE84AB</p>
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

    public static GetMediaResourceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaResourceIdResponseBody self = new GetMediaResourceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaResourceIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMediaResourceIdResponseBody setData(GetMediaResourceIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMediaResourceIdResponseBodyData getData() {
        return this.data;
    }

    public GetMediaResourceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaResourceIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMediaResourceIdResponseBodyData extends TeaModel {
        /**
         * <p>The download URL of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test-example.com/download.jpg">http://test-example.com/download.jpg</a></p>
         */
        @NameInMap("ResUrlDownload")
        public String resUrlDownload;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS_14571****</p>
         */
        @NameInMap("ResourceId")
        public Long resourceId;

        public static GetMediaResourceIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMediaResourceIdResponseBodyData self = new GetMediaResourceIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMediaResourceIdResponseBodyData setResUrlDownload(String resUrlDownload) {
            this.resUrlDownload = resUrlDownload;
            return this;
        }
        public String getResUrlDownload() {
            return this.resUrlDownload;
        }

        public GetMediaResourceIdResponseBodyData setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

    }

}
