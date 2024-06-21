// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateApplicationResponseBody extends TeaModel {
    /**
     * <p>The response code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("Data")
    public CreateApplicationResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>68D91223-CCE9-5F9C-B538-20F617DA48B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationResponseBody self = new CreateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateApplicationResponseBody setData(CreateApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateApplicationResponseBodyData getData() {
        return this.data;
    }

    public CreateApplicationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApplicationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateApplicationResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx@xxxxxxxxxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1631001140913</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;rpcTypes\&quot;:[\&quot;dubbo\&quot;,\&quot;springCloud\&quot;]}</p>
         */
        @NameInMap("ExtraInfo")
        public String extraInfo;

        /**
         * <p>The programming language of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>JAVA</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The license key in use.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx@xxxxxxxxxx</p>
         */
        @NameInMap("LicenseKey")
        public String licenseKey;

        /**
         * <p>MSE命名空间名字。</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The service where the application is deployed. Valid values:</p>
         * <ul>
         * <li>\- ACK: Container Service for Kubernetes</li>
         * <li>\- Normal: another service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACK</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the application. A value of 1 indicates that the application is in a normal state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1632979237663</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1888888888</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>版本号。</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static CreateApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseBodyData self = new CreateApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateApplicationResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateApplicationResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateApplicationResponseBodyData setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public CreateApplicationResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public CreateApplicationResponseBodyData setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public CreateApplicationResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateApplicationResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateApplicationResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateApplicationResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateApplicationResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public CreateApplicationResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CreateApplicationResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
