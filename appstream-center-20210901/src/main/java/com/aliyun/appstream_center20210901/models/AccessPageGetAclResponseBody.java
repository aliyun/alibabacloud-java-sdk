// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AccessPageGetAclResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<AccessPageGetAclResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>The parameter ProductType is invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static AccessPageGetAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AccessPageGetAclResponseBody self = new AccessPageGetAclResponseBody();
        return TeaModel.build(map, self);
    }

    public AccessPageGetAclResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AccessPageGetAclResponseBody setData(java.util.List<AccessPageGetAclResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AccessPageGetAclResponseBodyData> getData() {
        return this.data;
    }

    public AccessPageGetAclResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AccessPageGetAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AccessPageGetAclResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class AccessPageGetAclResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FREE_ACCESS</p>
         */
        @NameInMap("AccessMode")
        public String accessMode;

        /**
         * <strong>example:</strong>
         * <p><a href="https://wuying.aliyun.com/native-solution/cloud-flow/view?id=a-075nu7bcqim2wvxli&token=8141B1A674D48ACB8E5D2D6CE53FDB2F3CF8710A5F8F78578D5254BC6F">https://wuying.aliyun.com/native-solution/cloud-flow/view?id=a-075nu7bcqim2wvxli&amp;token=8141B1A674D48ACB8E5D2D6CE53FDB2F3CF8710A5F8F78578D5254BC6F</a>******</p>
         */
        @NameInMap("AccessUrl")
        public String accessUrl;

        /**
         * <strong>example:</strong>
         * <p>2023-02-08T03:52Z</p>
         */
        @NameInMap("EffectTime")
        public Integer effectTime;

        /**
         * <strong>example:</strong>
         * <p>hour</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>2023-12-05 14:28:20</p>
         */
        @NameInMap("UrlExpireTime")
        public String urlExpireTime;

        public static AccessPageGetAclResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AccessPageGetAclResponseBodyData self = new AccessPageGetAclResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AccessPageGetAclResponseBodyData setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

        public AccessPageGetAclResponseBodyData setAccessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
            return this;
        }
        public String getAccessUrl() {
            return this.accessUrl;
        }

        public AccessPageGetAclResponseBodyData setEffectTime(Integer effectTime) {
            this.effectTime = effectTime;
            return this;
        }
        public Integer getEffectTime() {
            return this.effectTime;
        }

        public AccessPageGetAclResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public AccessPageGetAclResponseBodyData setUrlExpireTime(String urlExpireTime) {
            this.urlExpireTime = urlExpireTime;
            return this;
        }
        public String getUrlExpireTime() {
            return this.urlExpireTime;
        }

    }

}
