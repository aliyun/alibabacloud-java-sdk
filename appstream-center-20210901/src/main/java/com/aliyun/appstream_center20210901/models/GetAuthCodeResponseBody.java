// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetAuthCodeResponseBody extends TeaModel {
    /**
     * <p>The error code. It is returned when the request fails. A success response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned by the operation.</p>
     */
    @NameInMap("Data")
    public GetAuthCodeResponseBodyData data;

    /**
     * <p>The error or result message. It describes the cause when the request fails. A success response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal error.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can provide this value for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was processed successfully. A value of true indicates that the request was processed successfully. To check whether an asynchronous task is completed, you must query the task status separately.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAuthCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthCodeResponseBody self = new GetAuthCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAuthCodeResponseBody setData(GetAuthCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAuthCodeResponseBodyData getData() {
        return this.data;
    }

    public GetAuthCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAuthCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAuthCodeResponseBodyData extends TeaModel {
        /**
         * <p>The network access type supported by the connection resource.</p>
         * <ul>
         * <li><strong>INTERNET</strong>: Supports Internet access.</li>
         * <li><strong>VPC</strong>: Supports virtual private cloud (VPC) access.</li>
         * <li><strong>ANY</strong>: Supports both Internet and VPC access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>The application ID, which is used for subsequent application queries or unbinding the image.</p>
         * 
         * <strong>example:</strong>
         * <p>app-bp1example****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The delivery group ID of the creation or validation resource. It is used together with the user and application information in this response during connection.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-bp1example****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The application version ID, which is used to locate a specific version of the application. This field is not the image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>apv-bp1example****</p>
         */
        @NameInMap("AppVersionId")
        public String appVersionId;

        /**
         * <p>The authorization code used to connect to the creation or validation resource. <strong>The validity period is 180 seconds (3 minutes) from the time of issuance. Use it promptly after obtaining it.</strong> Use it together with the user, delivery group, and application information in the same response, and keep it confidential as a connection credential.</p>
         * <p>Do not reuse the authorization code after it is redeemed. If it has been used or expired, call this operation again to obtain a new one.</p>
         * 
         * <strong>example:</strong>
         * <p>e4e169bea1cc48e8afac53**********</p>
         */
        @NameInMap("AuthCode")
        public String authCode;

        /**
         * <p>The purpose type of the connection resource.</p>
         * <ul>
         * <li><strong>ImageBuilder</strong>: Image or application creation resource.</li>
         * <li><strong>ImageValidate</strong>: Image or application validation resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImageBuilder</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The region ID in this response.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The user ID used when connecting to the creation or validation environment. Use the value returned in this response.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>vhd_builder</strong></p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetAuthCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAuthCodeResponseBodyData self = new GetAuthCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAuthCodeResponseBodyData setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public GetAuthCodeResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAuthCodeResponseBodyData setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public GetAuthCodeResponseBodyData setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public GetAuthCodeResponseBodyData setAuthCode(String authCode) {
            this.authCode = authCode;
            return this;
        }
        public String getAuthCode() {
            return this.authCode;
        }

        public GetAuthCodeResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetAuthCodeResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAuthCodeResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
