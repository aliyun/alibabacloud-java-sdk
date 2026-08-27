// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class VerifyMigrationTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public VerifyMigrationTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CB85272A-5F04-58D7-BDE1-8BB5EB390CE1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static VerifyMigrationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyMigrationTaskResponseBody self = new VerifyMigrationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyMigrationTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyMigrationTaskResponseBody setData(VerifyMigrationTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyMigrationTaskResponseBodyData getData() {
        return this.data;
    }

    public VerifyMigrationTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyMigrationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyMigrationTaskResponseBodyDataUnSupportedRouteRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default/my-ingress</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>/api/v1/pets -&gt; pet-service</p>
         */
        @NameInMap("rule")
        public String rule;

        @NameInMap("unSupportedAnnotations")
        public java.util.List<String> unSupportedAnnotations;

        public static VerifyMigrationTaskResponseBodyDataUnSupportedRouteRules build(java.util.Map<String, ?> map) throws Exception {
            VerifyMigrationTaskResponseBodyDataUnSupportedRouteRules self = new VerifyMigrationTaskResponseBodyDataUnSupportedRouteRules();
            return TeaModel.build(map, self);
        }

        public VerifyMigrationTaskResponseBodyDataUnSupportedRouteRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VerifyMigrationTaskResponseBodyDataUnSupportedRouteRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public VerifyMigrationTaskResponseBodyDataUnSupportedRouteRules setUnSupportedAnnotations(java.util.List<String> unSupportedAnnotations) {
            this.unSupportedAnnotations = unSupportedAnnotations;
            return this;
        }
        public java.util.List<String> getUnSupportedAnnotations() {
            return this.unSupportedAnnotations;
        }

    }

    public static class VerifyMigrationTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isSupported")
        public Boolean isSupported;

        /**
         * <strong>example:</strong>
         * <p>all routes supported</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("success")
        public Boolean success;

        @NameInMap("unSupportedRouteRules")
        public java.util.List<VerifyMigrationTaskResponseBodyDataUnSupportedRouteRules> unSupportedRouteRules;

        public static VerifyMigrationTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyMigrationTaskResponseBodyData self = new VerifyMigrationTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyMigrationTaskResponseBodyData setIsSupported(Boolean isSupported) {
            this.isSupported = isSupported;
            return this;
        }
        public Boolean getIsSupported() {
            return this.isSupported;
        }

        public VerifyMigrationTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public VerifyMigrationTaskResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public VerifyMigrationTaskResponseBodyData setUnSupportedRouteRules(java.util.List<VerifyMigrationTaskResponseBodyDataUnSupportedRouteRules> unSupportedRouteRules) {
            this.unSupportedRouteRules = unSupportedRouteRules;
            return this;
        }
        public java.util.List<VerifyMigrationTaskResponseBodyDataUnSupportedRouteRules> getUnSupportedRouteRules() {
            return this.unSupportedRouteRules;
        }

    }

}
