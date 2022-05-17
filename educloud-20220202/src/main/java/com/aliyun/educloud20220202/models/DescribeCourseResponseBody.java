// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeCourseResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DescribeCourseResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCourseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCourseResponseBody self = new DescribeCourseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCourseResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeCourseResponseBody setData(DescribeCourseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCourseResponseBodyData getData() {
        return this.data;
    }

    public DescribeCourseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCourseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCourseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCourseResponseBodyDataChapterLessons extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("LessonId")
        public String lessonId;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static DescribeCourseResponseBodyDataChapterLessons build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseResponseBodyDataChapterLessons self = new DescribeCourseResponseBodyDataChapterLessons();
            return TeaModel.build(map, self);
        }

        public DescribeCourseResponseBodyDataChapterLessons setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeCourseResponseBodyDataChapterLessons setLessonId(String lessonId) {
            this.lessonId = lessonId;
            return this;
        }
        public String getLessonId() {
            return this.lessonId;
        }

        public DescribeCourseResponseBodyDataChapterLessons setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeCourseResponseBodyDataChapterLessons setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCourseResponseBodyDataChapterUnitLessons extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("LessonId")
        public String lessonId;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static DescribeCourseResponseBodyDataChapterUnitLessons build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseResponseBodyDataChapterUnitLessons self = new DescribeCourseResponseBodyDataChapterUnitLessons();
            return TeaModel.build(map, self);
        }

        public DescribeCourseResponseBodyDataChapterUnitLessons setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeCourseResponseBodyDataChapterUnitLessons setLessonId(String lessonId) {
            this.lessonId = lessonId;
            return this;
        }
        public String getLessonId() {
            return this.lessonId;
        }

        public DescribeCourseResponseBodyDataChapterUnitLessons setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeCourseResponseBodyDataChapterUnitLessons setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCourseResponseBodyDataChapterUnit extends TeaModel {
        @NameInMap("Lessons")
        public java.util.List<DescribeCourseResponseBodyDataChapterUnitLessons> lessons;

        @NameInMap("Number")
        public Long number;

        @NameInMap("Title")
        public String title;

        public static DescribeCourseResponseBodyDataChapterUnit build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseResponseBodyDataChapterUnit self = new DescribeCourseResponseBodyDataChapterUnit();
            return TeaModel.build(map, self);
        }

        public DescribeCourseResponseBodyDataChapterUnit setLessons(java.util.List<DescribeCourseResponseBodyDataChapterUnitLessons> lessons) {
            this.lessons = lessons;
            return this;
        }
        public java.util.List<DescribeCourseResponseBodyDataChapterUnitLessons> getLessons() {
            return this.lessons;
        }

        public DescribeCourseResponseBodyDataChapterUnit setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public DescribeCourseResponseBodyDataChapterUnit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeCourseResponseBodyDataChapter extends TeaModel {
        @NameInMap("Lessons")
        public java.util.List<DescribeCourseResponseBodyDataChapterLessons> lessons;

        @NameInMap("Number")
        public Long number;

        @NameInMap("Title")
        public String title;

        @NameInMap("Unit")
        public java.util.List<DescribeCourseResponseBodyDataChapterUnit> unit;

        public static DescribeCourseResponseBodyDataChapter build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseResponseBodyDataChapter self = new DescribeCourseResponseBodyDataChapter();
            return TeaModel.build(map, self);
        }

        public DescribeCourseResponseBodyDataChapter setLessons(java.util.List<DescribeCourseResponseBodyDataChapterLessons> lessons) {
            this.lessons = lessons;
            return this;
        }
        public java.util.List<DescribeCourseResponseBodyDataChapterLessons> getLessons() {
            return this.lessons;
        }

        public DescribeCourseResponseBodyDataChapter setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public DescribeCourseResponseBodyDataChapter setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeCourseResponseBodyDataChapter setUnit(java.util.List<DescribeCourseResponseBodyDataChapterUnit> unit) {
            this.unit = unit;
            return this;
        }
        public java.util.List<DescribeCourseResponseBodyDataChapterUnit> getUnit() {
            return this.unit;
        }

    }

    public static class DescribeCourseResponseBodyDataLessons extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("LessonId")
        public String lessonId;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static DescribeCourseResponseBodyDataLessons build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseResponseBodyDataLessons self = new DescribeCourseResponseBodyDataLessons();
            return TeaModel.build(map, self);
        }

        public DescribeCourseResponseBodyDataLessons setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeCourseResponseBodyDataLessons setLessonId(String lessonId) {
            this.lessonId = lessonId;
            return this;
        }
        public String getLessonId() {
            return this.lessonId;
        }

        public DescribeCourseResponseBodyDataLessons setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeCourseResponseBodyDataLessons setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCourseResponseBodyData extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Chapter")
        public java.util.List<DescribeCourseResponseBodyDataChapter> chapter;

        @NameInMap("CourseId")
        public String courseId;

        @NameInMap("Introduce")
        public String introduce;

        @NameInMap("LessonNum")
        public Long lessonNum;

        @NameInMap("Lessons")
        public java.util.List<DescribeCourseResponseBodyDataLessons> lessons;

        @NameInMap("PictureUrl")
        public String pictureUrl;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Title")
        public String title;

        public static DescribeCourseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCourseResponseBodyData self = new DescribeCourseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCourseResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeCourseResponseBodyData setChapter(java.util.List<DescribeCourseResponseBodyDataChapter> chapter) {
            this.chapter = chapter;
            return this;
        }
        public java.util.List<DescribeCourseResponseBodyDataChapter> getChapter() {
            return this.chapter;
        }

        public DescribeCourseResponseBodyData setCourseId(String courseId) {
            this.courseId = courseId;
            return this;
        }
        public String getCourseId() {
            return this.courseId;
        }

        public DescribeCourseResponseBodyData setIntroduce(String introduce) {
            this.introduce = introduce;
            return this;
        }
        public String getIntroduce() {
            return this.introduce;
        }

        public DescribeCourseResponseBodyData setLessonNum(Long lessonNum) {
            this.lessonNum = lessonNum;
            return this;
        }
        public Long getLessonNum() {
            return this.lessonNum;
        }

        public DescribeCourseResponseBodyData setLessons(java.util.List<DescribeCourseResponseBodyDataLessons> lessons) {
            this.lessons = lessons;
            return this;
        }
        public java.util.List<DescribeCourseResponseBodyDataLessons> getLessons() {
            return this.lessons;
        }

        public DescribeCourseResponseBodyData setPictureUrl(String pictureUrl) {
            this.pictureUrl = pictureUrl;
            return this;
        }
        public String getPictureUrl() {
            return this.pictureUrl;
        }

        public DescribeCourseResponseBodyData setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeCourseResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
