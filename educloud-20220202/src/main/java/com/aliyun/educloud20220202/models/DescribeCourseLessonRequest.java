// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeCourseLessonRequest extends TeaModel {
    @NameInMap("LessonId")
    public String lessonId;

    public static DescribeCourseLessonRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCourseLessonRequest self = new DescribeCourseLessonRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCourseLessonRequest setLessonId(String lessonId) {
        this.lessonId = lessonId;
        return this;
    }
    public String getLessonId() {
        return this.lessonId;
    }

}
