// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeCourseLessonResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DescribeCourseLessonResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCourseLessonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCourseLessonResponseBody self = new DescribeCourseLessonResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCourseLessonResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeCourseLessonResponseBody setData(DescribeCourseLessonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCourseLessonResponseBodyData getData() {
        return this.data;
    }

    public DescribeCourseLessonResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCourseLessonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCourseLessonResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCourseLessonResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Url")
        public String url;

        public static DescribeCourseLessonResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseLessonResponseBodyData self = new DescribeCourseLessonResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCourseLessonResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeCourseLessonResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
