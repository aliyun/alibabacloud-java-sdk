// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRumAppResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. 2XX indicates that the request was successful. 3XX indicates that the request was redirected. 4XX indicates that a request error occurred. 5XX indicates that a server error occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The application ID and domain names. This parameter is returned if the application is created. Multiple domain names are separated with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ggxxxnjuz@xxxx,xxxxxx-default-cn.rum.aliyuncs.com</p>
     */
    @NameInMap("Data")
    public CreateRumAppResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1A474FF8-7861-4D00-81B5-5BC3DA4E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
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

    public static CreateRumAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRumAppResponseBody self = new CreateRumAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRumAppResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateRumAppResponseBody setData(CreateRumAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateRumAppResponseBodyData getData() {
        return this.data;
    }

    public CreateRumAppResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateRumAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRumAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRumAppResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRumAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateRumAppResponseBodyData extends TeaModel {
        /**
         * <p>The SDK Domain.</p>
         * 
         * <strong>example:</strong>
         * <p>bxxxxxxx-sdk.rum.aliyuncs.com/v2/browser-sdk.js</p>
         */
        @NameInMap("CdnDomain")
        public String cdnDomain;

        /**
         * <p>The endpoint of the event target.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx-default-cn.rum.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>avccccxxxx@24cxxxxbf384dc6</p>
         */
        @NameInMap("Pid")
        public String pid;

        public static CreateRumAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateRumAppResponseBodyData self = new CreateRumAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateRumAppResponseBodyData setCdnDomain(String cdnDomain) {
            this.cdnDomain = cdnDomain;
            return this;
        }
        public String getCdnDomain() {
            return this.cdnDomain;
        }

        public CreateRumAppResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateRumAppResponseBodyData setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

    }

}
