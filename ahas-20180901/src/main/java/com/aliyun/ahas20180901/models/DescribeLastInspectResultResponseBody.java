// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DescribeLastInspectResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeLastInspectResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeLastInspectResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLastInspectResultResponseBody self = new DescribeLastInspectResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLastInspectResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeLastInspectResultResponseBody setData(DescribeLastInspectResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLastInspectResultResponseBodyData getData() {
        return this.data;
    }

    public DescribeLastInspectResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLastInspectResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLastInspectResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeLastInspectResultResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FailInspectCount")
        public Integer failInspectCount;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PassInspectCount")
        public Integer passInspectCount;

        @NameInMap("Score")
        public Float score;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("TotalInspectCount")
        public Integer totalInspectCount;

        public static DescribeLastInspectResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLastInspectResultResponseBodyData self = new DescribeLastInspectResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLastInspectResultResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLastInspectResultResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLastInspectResultResponseBodyData setFailInspectCount(Integer failInspectCount) {
            this.failInspectCount = failInspectCount;
            return this;
        }
        public Integer getFailInspectCount() {
            return this.failInspectCount;
        }

        public DescribeLastInspectResultResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeLastInspectResultResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeLastInspectResultResponseBodyData setPassInspectCount(Integer passInspectCount) {
            this.passInspectCount = passInspectCount;
            return this;
        }
        public Integer getPassInspectCount() {
            return this.passInspectCount;
        }

        public DescribeLastInspectResultResponseBodyData setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DescribeLastInspectResultResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLastInspectResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLastInspectResultResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeLastInspectResultResponseBodyData setTotalInspectCount(Integer totalInspectCount) {
            this.totalInspectCount = totalInspectCount;
            return this;
        }
        public Integer getTotalInspectCount() {
            return this.totalInspectCount;
        }

    }

}
