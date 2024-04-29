// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeLabResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Lab")
    public DescribeLabResponseBodyLab lab;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeLabResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabResponseBody self = new DescribeLabResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLabResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeLabResponseBody setLab(DescribeLabResponseBodyLab lab) {
        this.lab = lab;
        return this;
    }
    public DescribeLabResponseBodyLab getLab() {
        return this.lab;
    }

    public DescribeLabResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLabResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLabResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeLabResponseBodyLab extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Introduction")
        public String introduction;

        @NameInMap("SubTitle")
        public String subTitle;

        @NameInMap("Title")
        public String title;

        public static DescribeLabResponseBodyLab build(java.util.Map<String, ?> map) throws Exception {
            DescribeLabResponseBodyLab self = new DescribeLabResponseBodyLab();
            return TeaModel.build(map, self);
        }

        public DescribeLabResponseBodyLab setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeLabResponseBodyLab setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeLabResponseBodyLab setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public DescribeLabResponseBodyLab setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

        public DescribeLabResponseBodyLab setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
