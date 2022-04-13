// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeLabResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DescribeLabResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeLabResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabResponseBody self = new DescribeLabResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLabResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeLabResponseBody setData(DescribeLabResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLabResponseBodyData getData() {
        return this.data;
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

    public static class DescribeLabResponseBodyDataChapterSections extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("OrderNumber")
        public Long orderNumber;

        @NameInMap("SectionId")
        public String sectionId;

        @NameInMap("Title")
        public String title;

        public static DescribeLabResponseBodyDataChapterSections build(java.util.Map<String, ?> map) throws Exception {
            DescribeLabResponseBodyDataChapterSections self = new DescribeLabResponseBodyDataChapterSections();
            return TeaModel.build(map, self);
        }

        public DescribeLabResponseBodyDataChapterSections setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeLabResponseBodyDataChapterSections setOrderNumber(Long orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        public Long getOrderNumber() {
            return this.orderNumber;
        }

        public DescribeLabResponseBodyDataChapterSections setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public String getSectionId() {
            return this.sectionId;
        }

        public DescribeLabResponseBodyDataChapterSections setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeLabResponseBodyDataChapter extends TeaModel {
        @NameInMap("OrderNumber")
        public Long orderNumber;

        @NameInMap("Sections")
        public java.util.List<DescribeLabResponseBodyDataChapterSections> sections;

        @NameInMap("Title")
        public String title;

        public static DescribeLabResponseBodyDataChapter build(java.util.Map<String, ?> map) throws Exception {
            DescribeLabResponseBodyDataChapter self = new DescribeLabResponseBodyDataChapter();
            return TeaModel.build(map, self);
        }

        public DescribeLabResponseBodyDataChapter setOrderNumber(Long orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        public Long getOrderNumber() {
            return this.orderNumber;
        }

        public DescribeLabResponseBodyDataChapter setSections(java.util.List<DescribeLabResponseBodyDataChapterSections> sections) {
            this.sections = sections;
            return this;
        }
        public java.util.List<DescribeLabResponseBodyDataChapterSections> getSections() {
            return this.sections;
        }

        public DescribeLabResponseBodyDataChapter setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeLabResponseBodyData extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Chapter")
        public java.util.List<DescribeLabResponseBodyDataChapter> chapter;

        @NameInMap("Introduce")
        public String introduce;

        @NameInMap("LabId")
        public String labId;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Time")
        public String time;

        @NameInMap("Title")
        public String title;

        public static DescribeLabResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLabResponseBodyData self = new DescribeLabResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLabResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeLabResponseBodyData setChapter(java.util.List<DescribeLabResponseBodyDataChapter> chapter) {
            this.chapter = chapter;
            return this;
        }
        public java.util.List<DescribeLabResponseBodyDataChapter> getChapter() {
            return this.chapter;
        }

        public DescribeLabResponseBodyData setIntroduce(String introduce) {
            this.introduce = introduce;
            return this;
        }
        public String getIntroduce() {
            return this.introduce;
        }

        public DescribeLabResponseBodyData setLabId(String labId) {
            this.labId = labId;
            return this;
        }
        public String getLabId() {
            return this.labId;
        }

        public DescribeLabResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeLabResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeLabResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
