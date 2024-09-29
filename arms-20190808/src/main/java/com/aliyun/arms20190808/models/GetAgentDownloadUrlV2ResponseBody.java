// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAgentDownloadUrlV2ResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.\
     * <strong>Valid values:</strong></p>
     * <ul>
     * <li>2xx: The request was successful.</li>
     * <li>3xx: The request was redirected.</li>
     * <li>4xx: The request was invalid.</li>
     * <li>5xx: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The version number and download URL of the agent.</p>
     */
    @NameInMap("Data")
    public GetAgentDownloadUrlV2ResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.\
     * <strong>Valid values:</strong></p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAgentDownloadUrlV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDownloadUrlV2ResponseBody self = new GetAgentDownloadUrlV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentDownloadUrlV2ResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetAgentDownloadUrlV2ResponseBody setData(GetAgentDownloadUrlV2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentDownloadUrlV2ResponseBodyData getData() {
        return this.data;
    }

    public GetAgentDownloadUrlV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentDownloadUrlV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentDownloadUrlV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentDownloadUrlV2ResponseBodyData extends TeaModel {
        /**
         * <p>The download URL of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://arms-apm-cn-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/3.2.9/ArmsAgent.zip">http://arms-apm-cn-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/3.2.9/ArmsAgent.zip</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The version number of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>3.2.9</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetAgentDownloadUrlV2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentDownloadUrlV2ResponseBodyData self = new GetAgentDownloadUrlV2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentDownloadUrlV2ResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetAgentDownloadUrlV2ResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
