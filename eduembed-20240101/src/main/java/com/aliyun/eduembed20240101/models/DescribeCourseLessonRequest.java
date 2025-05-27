// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeCourseLessonRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LessonId")
    public Long lessonId;

    public static DescribeCourseLessonRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCourseLessonRequest self = new DescribeCourseLessonRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCourseLessonRequest setLessonId(Long lessonId) {
        this.lessonId = lessonId;
        return this;
    }
    public Long getLessonId() {
        return this.lessonId;
    }

}
