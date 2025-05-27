// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeLabSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("LabSession")
    public DescribeLabSessionResponseBodyLabSession labSession;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9ADC729B-...</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeLabSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabSessionResponseBody self = new DescribeLabSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLabSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeLabSessionResponseBody setLabSession(DescribeLabSessionResponseBodyLabSession labSession) {
        this.labSession = labSession;
        return this;
    }
    public DescribeLabSessionResponseBodyLabSession getLabSession() {
        return this.labSession;
    }

    public DescribeLabSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLabSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLabSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeLabSessionResponseBodyLabSession extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-05-05 15:01:59</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Finished")
        public Boolean finished;

        /**
         * <strong>example:</strong>
         * <p>838</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>875</p>
         */
        @NameInMap("LabId")
        public Long labId;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeLabSessionResponseBodyLabSession build(java.util.Map<String, ?> map) throws Exception {
            DescribeLabSessionResponseBodyLabSession self = new DescribeLabSessionResponseBodyLabSession();
            return TeaModel.build(map, self);
        }

        public DescribeLabSessionResponseBodyLabSession setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLabSessionResponseBodyLabSession setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public DescribeLabSessionResponseBodyLabSession setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeLabSessionResponseBodyLabSession setLabId(Long labId) {
            this.labId = labId;
            return this;
        }
        public Long getLabId() {
            return this.labId;
        }

        public DescribeLabSessionResponseBodyLabSession setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
