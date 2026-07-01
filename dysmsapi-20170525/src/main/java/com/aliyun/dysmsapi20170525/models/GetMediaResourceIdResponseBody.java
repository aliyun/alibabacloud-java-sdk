// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetMediaResourceIdResponseBody extends TeaModel {
    /**
     * <p>请求状态码。</p>
     * <ul>
     * <li>返回OK代表请求成功。</li>
     * <li>其他错误码，请参见<a href="https://help.aliyun.com/document_detail/101346.html">错误码列表</a>。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public GetMediaResourceIdResponseBodyData data;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>F07CF237-F6E3-5F77-B91B-F9B7C5DE84AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>调用接口是否成功。取值：</p>
     * <ul>
     * <li><p><strong>true</strong>：调用成功。</p>
     * </li>
     * <li><p><strong>false</strong>：调用失败。</p>
     * </li>
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
         * <p>资源下载地址。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test-example.com/download.jpg">http://test-example.com/download.jpg</a></p>
         */
        @NameInMap("ResUrlDownload")
        public String resUrlDownload;

        /**
         * <p>资源ID。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
