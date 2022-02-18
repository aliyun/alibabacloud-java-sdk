// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeCourseRequest extends TeaModel {
    @NameInMap("CourseId")
    public String courseId;

    public static DescribeCourseRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCourseRequest self = new DescribeCourseRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCourseRequest setCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }
    public String getCourseId() {
        return this.courseId;
    }

}
