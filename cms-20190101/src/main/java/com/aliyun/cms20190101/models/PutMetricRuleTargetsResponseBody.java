// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMetricRuleTargetsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p>The value 200 indicates success.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of failures.</p>
     */
    @NameInMap("FailData")
    public PutMetricRuleTargetsResponseBodyFailData failData;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A569B0D-9055-58AF-9E82-BAEAF95C0FD5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: successful.</p>
     * </li>
     * <li><p>false: failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PutMetricRuleTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutMetricRuleTargetsResponseBody self = new PutMetricRuleTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public PutMetricRuleTargetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutMetricRuleTargetsResponseBody setFailData(PutMetricRuleTargetsResponseBodyFailData failData) {
        this.failData = failData;
        return this;
    }
    public PutMetricRuleTargetsResponseBodyFailData getFailData() {
        return this.failData;
    }

    public PutMetricRuleTargetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutMetricRuleTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutMetricRuleTargetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PutMetricRuleTargetsResponseBodyFailDataTargetsTarget extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("Id")
        public String id;

        @NameInMap("Level")
        public String level;

        public static PutMetricRuleTargetsResponseBodyFailDataTargetsTarget build(java.util.Map<String, ?> map) throws Exception {
            PutMetricRuleTargetsResponseBodyFailDataTargetsTarget self = new PutMetricRuleTargetsResponseBodyFailDataTargetsTarget();
            return TeaModel.build(map, self);
        }

        public PutMetricRuleTargetsResponseBodyFailDataTargetsTarget setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public PutMetricRuleTargetsResponseBodyFailDataTargetsTarget setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutMetricRuleTargetsResponseBodyFailDataTargetsTarget setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class PutMetricRuleTargetsResponseBodyFailDataTargets extends TeaModel {
        @NameInMap("Target")
        public java.util.List<PutMetricRuleTargetsResponseBodyFailDataTargetsTarget> target;

        public static PutMetricRuleTargetsResponseBodyFailDataTargets build(java.util.Map<String, ?> map) throws Exception {
            PutMetricRuleTargetsResponseBodyFailDataTargets self = new PutMetricRuleTargetsResponseBodyFailDataTargets();
            return TeaModel.build(map, self);
        }

        public PutMetricRuleTargetsResponseBodyFailDataTargets setTarget(java.util.List<PutMetricRuleTargetsResponseBodyFailDataTargetsTarget> target) {
            this.target = target;
            return this;
        }
        public java.util.List<PutMetricRuleTargetsResponseBodyFailDataTargetsTarget> getTarget() {
            return this.target;
        }

    }

    public static class PutMetricRuleTargetsResponseBodyFailData extends TeaModel {
        @NameInMap("Targets")
        public PutMetricRuleTargetsResponseBodyFailDataTargets targets;

        public static PutMetricRuleTargetsResponseBodyFailData build(java.util.Map<String, ?> map) throws Exception {
            PutMetricRuleTargetsResponseBodyFailData self = new PutMetricRuleTargetsResponseBodyFailData();
            return TeaModel.build(map, self);
        }

        public PutMetricRuleTargetsResponseBodyFailData setTargets(PutMetricRuleTargetsResponseBodyFailDataTargets targets) {
            this.targets = targets;
            return this;
        }
        public PutMetricRuleTargetsResponseBodyFailDataTargets getTargets() {
            return this.targets;
        }

    }

}
